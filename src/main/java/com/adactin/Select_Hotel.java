package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	public Select_Hotel(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}


	public WebElement getCont() {
		return cont;
	}
	

}
