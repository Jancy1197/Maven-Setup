package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Checkout {
	
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public Proceed_Checkout(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getProceed() {
		return proceed;
	}

}
