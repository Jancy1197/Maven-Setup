package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
	
	public static WebDriver driver;

	@FindBy(id="first_name")
	private WebElement first_Name;
	
	@FindBy(id="last_name")
	private WebElement last_Name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	public Booking(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(id="cc_type")
	private WebElement card;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	
}
