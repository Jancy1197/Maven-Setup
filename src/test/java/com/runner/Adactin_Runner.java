package com.runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.Booking;
import com.adactin.Login;
import com.adactin.Obj_Adac;
import com.adactin.Search_Hotel;
import com.adactin.Select_Hotel;
import com.baseclass.MyStore_Base;

public class Adactin_Runner extends MyStore_Base {
	public static WebDriver driver = MyStore_Base.browsertype("chrome");
	public static Obj_Adac obj=new Obj_Adac(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		getUrl("https://adactinhotelapp.com/");
		sendKeystoElement(obj.getLog().getUsername(), "JancyRani");
		sendKeystoElement(obj.getLog().getPass(), "Dream@123");
		clickOnElement(obj.getLog().getLogin());
		dropdown("byvisibletext", obj.getSh().getLocation(), "New York");
		dropdown("byvisibletext", obj.getSh().getHotels(), "Hotel Sunshine");
		dropdown("byvisibletext", obj.getSh().getRoom(), "Deluxe");
		dropdown("byvisibletex", obj.getSh().getNumbers(), "2 - Two");
		clearElement(obj.getSh().getCheckIn());
		sendKeystoElement(obj.getSh().getCheckIn(), "05/12/2021");
		clearElement(obj.getSh().getCheckOut());
		sendKeystoElement(obj.getSh().getCheckOut(), "07/12/2021");	
		dropdown("byvisibletext", obj.getSh().getAdult_room(), "2 - Two");
		dropdown("byvisibletext", obj.getSh().getChild_room(), "1 - One");
		clickOnElement(obj.getSh().getSubmit());
		waiting();
		clickOnElement(obj.getSlth().getRadio());
		clickOnElement(obj.getSlth().getCont());
		Thread.sleep(2000);
		sendKeystoElement(obj.getBk().getFirst_Name(), "Jeni");	
		sendKeystoElement(obj.getBk().getLast_Name(), "Alex");
		sendKeystoElement(obj.getBk().getAddress(), "Porur, Chennai");
		sendKeystoElement(obj.getBk().getCc(), "1234567890123456");
		dropdown("byvisibletext", obj.getBk().getCard(), "Master Card");
		dropdown("byvisibletext", obj.getBk().getMonth(), "March");
		dropdown("byvisibletext", obj.getBk().getYear(), "2022");
		sendKeystoElement(obj.getBk().getCvv(), "456");
		clickOnElement(obj.getBk().getBook());
		screenshot("Booking");
		
		
		
		
	}

}
