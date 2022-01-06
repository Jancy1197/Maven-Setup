package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {

	public WebDriver driver;
	
	@FindBy(name="processAddress")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	public Address(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	}
}
