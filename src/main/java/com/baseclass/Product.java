package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	
	public WebDriver driver;
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement image;

	public WebElement getImage() {
		return image;
	}
	
	public Product(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	

}
