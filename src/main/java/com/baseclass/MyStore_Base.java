package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class MyStore_Base {

	public static WebDriver driver;
	public static String StringCellValue;

	public static WebDriver browsertype(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Chrome\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\Chrome\\chromedriver_win32\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendKeystoElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clearElement(WebElement element) {
		element.clear();

	}

	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void action(WebElement element, WebElement element1) {
		Actions a = new Actions(driver);
		a.clickAndHold(element).build().perform();
		a.moveToElement(element1).build().perform();
		a.click().build().perform();
	}

	public static void draganddrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	public static void rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byindex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
			}
		}
	public static void downkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void enterkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void upkey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void frameout() {
		driver.switchTo().defaultContent();
	}

	 
	
	public static void scroll(String value) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript(value);
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}

	public static void backTo() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void alert(String type, String value) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (type.equalsIgnoreCase("prompt")) {
			driver.switchTo().alert().sendKeys(value);

		}
	}

	public static void windowHandle(String window) {
		Set<String> wh = driver.getWindowHandles();
		for (String string : wh) {

			System.out.println(driver.switchTo().window(string).getTitle());
		}

		String s = window;

		for (String string1 : wh) {

		if (driver.switchTo().window(string1).getTitle().equalsIgnoreCase(s)) {
				break;
			}
		}
	}

	public static void waiting() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void screenshot(String scName) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File sourceFile = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\jancy\\eclipse-workspace\\MavenProject\\Screen shot\\"+ scName+".png");
	FileUtils.copyFile(sourceFile, destination);
	}
	
	public static String particular_DataDriven(String path, int row_Index, int cell_Index) throws IOException {
	File f = new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row = sheetAt.getRow(row_Index );
	Cell cell = row.getCell(cell_Index);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		StringCellValue=String.valueOf(stringCellValue);

	} else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int value = (int) numericCellValue;
		StringCellValue=String.valueOf(value);

	}
	return StringCellValue;
		
}}