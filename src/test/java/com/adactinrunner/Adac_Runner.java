package com.adactinrunner;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.MyStore_Base;

public class Adac_Runner extends MyStore_Base{
	
	public static WebDriver driver= MyStore_Base.browsertype("chrome");

	public static void main(String[] args) {
		getUrl("https://adactinhotelapp.com/");
	
//		driver.findElement(By.id("username")).sendKeys("JancyRani");
//		driver.findElement(By.id("password")).sendKeys("Dream@123");
//		driver.findElement(By.id("login")).click();
//		
//		WebElement location = driver.findElement(By.id("location"));
//		Select s=new Select(location);
//		s.selectByVisibleText("New York");
//		
//		WebElement hotels = driver.findElement(By.id("hotels"));
//		Select s1=new Select(hotels);
//		s1.selectByVisibleText("Hotel Sunshine");
//
//		WebElement room = driver.findElement(By.id("room_type"));
//		Select s2=new Select(room);
//		s2.selectByVisibleText("Deluxe");
//		
//		WebElement numbers = driver.findElement(By.id("room_nos"));
//		Select s3=new Select(numbers);
//		s3.selectByVisibleText("2 - Two");
//		
//		WebElement checkIn = driver.findElement(By.id("datepick_in"));
//		checkIn.clear();
//		checkIn.sendKeys("05/12/2021");
//		
//		WebElement checkOut = driver.findElement(By.id("datepick_out"));
//		checkOut.clear();
//		checkOut.sendKeys("07/12/2021");
//		
//		WebElement adult_room = driver.findElement(By.id("adult_room"));	
//		Select s4=new Select(adult_room);
//		s4.selectByVisibleText("2 - Two");
//		
//		WebElement child_room = driver.findElement(By.id("child_room"));
//		Select s5=new Select(child_room);
//		s5.selectByVisibleText("1 - One");
//		
//		driver.findElement(By.id("Submit")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("radiobutton_0")).click();
//		driver.findElement(By.id("continue")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.id("first_name")).sendKeys("Jeni");
//		driver.findElement(By.id("last_name")).sendKeys("Alex");
//		driver.findElement(By.id("address")).sendKeys("Porur, Chennai");
//		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
//		
//		WebElement card = driver.findElement(By.id("cc_type"));
//		Select s6=new Select(card);
//		s6.selectByVisibleText("Master Card");
//		
//		WebElement month = driver.findElement(By.id("cc_exp_month"));
//		Select s7=new Select(month);
//		s7.selectByVisibleText("March");
//
//		WebElement year = driver.findElement(By.id("cc_exp_year"));
//		Select s8=new Select(year);
//		s8.selectByVisibleText("2022");
//		
//		driver.findElement(By.id("cc_cvv")).sendKeys("456");
//		driver.findElement(By.id("book_now")).click();
//		
//
//		
//		TakesScreenshot ss=(TakesScreenshot)driver;
//		File sourceFile=ss.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\jancy\\eclipse-workspace\\Selenium\\Screenshot\\details.png");
//		FileUtils.copyFile(sourceFile, destination);
	}
}
