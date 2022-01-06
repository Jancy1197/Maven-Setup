package com.adactin;

import org.openqa.selenium.WebDriver;

public class Obj_Adac {

	public static WebDriver driver;
	
	private Login log;
	private Search_Hotel sh;
	private  Select_Hotel slth;
	private Booking bk;
	
	public Obj_Adac(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public Login getLog() {
		log=new Login(driver);
		return log;
	}
	public Search_Hotel getSh() {
		sh=new Search_Hotel(driver);
		return sh;
	}
	public Select_Hotel getSlth() {
		slth=new Select_Hotel(driver);
		return slth;
	}
	public Booking getBk() {
		bk=new Booking(driver);
		return bk;
	}



	
	
}
