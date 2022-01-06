package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order {

	public WebDriver driver;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement order;
	
	public Confirm_Order(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOrder() {
		return order;
	}
	
}
