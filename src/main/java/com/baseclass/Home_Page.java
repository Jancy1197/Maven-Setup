package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath="(//a[@title='Casual Dresses'])[1]")
	private WebElement casualdress;
	
	public Home_Page(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}



}
