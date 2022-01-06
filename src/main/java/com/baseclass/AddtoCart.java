package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	
	public WebDriver driver;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement imgframe;
	
	@FindBy(name="qty")
	private WebElement quantity;
	
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(name="Submit")
	private WebElement submit;

	public AddtoCart(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public WebElement getImgframe() {
		return imgframe;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
