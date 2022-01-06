package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement login;
	
	public Login(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);		
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

}
