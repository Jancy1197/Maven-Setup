package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=order&step=1']")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
	
	public Summary(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	

}
