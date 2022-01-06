package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement pay;

	public WebElement getPay() {
		return pay;
	}
	
	public Payment(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
}
