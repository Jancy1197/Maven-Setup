package com.runnerclass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.MyStore_Base;

public class MyStore_Runner extends MyStore_Base {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		driver = browsertype("chrome");
		getUrl("http://automationpractice.com/index.php");
		WebElement login = driver.findElement(By.className("login"));
		clickOnElement(login);
		WebElement email = driver.findElement(By.id("email"));
		sendKeystoElement(email, "arun47@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		sendKeystoElement(password, "test@123");
		WebElement signin = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(signin);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		WebElement casual = driver.findElement(By.xpath("//a[@title='Casual Dresses'][1]"));
		action(women, casual);
		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		clickOnElement(image);
		Thread.sleep(3000);
		WebElement imgframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frames(imgframe);
		WebElement quantity = driver.findElement(By.name("qty"));
		clearElement(quantity);
		sendKeystoElement(quantity, "5");
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropdown("byvisibletext", size, "M");
		WebElement submit = driver.findElement(By.name("Submit"));
		clickOnElement(submit);
		frameout();
		waiting();
		WebElement cart = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(cart);
		WebElement checkout = driver
				.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
		clickOnElement(checkout);
		WebElement address = driver.findElement(By.name("processAddress"));
		clickOnElement(address);
		WebElement terms = driver.findElement(By.name("cgv"));
		clickOnElement(terms);
		WebElement shipping = driver.findElement(By.name("processCarrier"));
		clickOnElement(shipping);
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(payment);
		WebElement confirmOrder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(confirmOrder);
		scroll("window.scrollBy(0,500)");

		navigateTo("http://www.leafground.com/pages/Alert.html");
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		clickOnElement(simple);
		alert("dismiss", null);
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		clickOnElement(confirm);
		alert("dismiss", null);
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		clickOnElement(prompt);
		alert("prompt", "jancy");
		alert("accept", null);
		
		navigateTo("http://www.leafground.com/pages/drop.html");
		WebElement from_element = driver.findElement(By.id("draggable"));
		WebElement to_Element = driver.findElement(By.id("droppable"));
		draganddrop(from_element, to_Element);
		
//		close();
		
		getUrl("https://www.flipkart.com/");
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clickOnElement(close);
		WebElement top_Offers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		rightclick(top_Offers);
		downkey();
		enterkey();
		WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		rightclick(grocery);
		downkey();
		enterkey();

		windowHandle("Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com");
//			quit();
		
	}
}
