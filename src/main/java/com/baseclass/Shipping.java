package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {

	public WebDriver driver;
	@FindBy(name="cgv")
	private WebElement terms;
	
	@FindBy(name="processCarrier")
	private WebElement checkout;

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	public Shipping(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
}
