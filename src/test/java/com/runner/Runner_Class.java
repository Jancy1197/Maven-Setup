package com.runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Address;
import com.baseclass.AddtoCart;
import com.baseclass.Confirm_Order;
import com.baseclass.Home_Page;
import com.baseclass.MyStore_Base;
import com.baseclass.Payment;
import com.baseclass.Proceed_Checkout;
import com.baseclass.Product;
import com.baseclass.Project_Object_Model;
import com.baseclass.Shipping;
import com.baseclass.Sign_In;
import com.baseclass.Summary;

public class Runner_Class extends MyStore_Base{
public static WebDriver driver=MyStore_Base.browsertype("chrome");
public static Project_Object_Model pom=new Project_Object_Model(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		getUrl("http://automationpractice.com/index.php");
		action(pom.getHp().getWomen(), pom.getHp().getCasualdress());
		waiting();
		clickOnElement(pom.getPrd().getImage());
		waiting();
		frames(pom.getCart().getImgframe());
		clearElement(pom.getCart().getQuantity());
		sendKeystoElement(pom.getCart().getQuantity(), "5");
		dropdown("byvisibletext",pom.getCart().getSize(), "M");
		clickOnElement(pom.getCart().getSubmit());
		frameout();
		waiting();
		clickOnElement(pom.getProceed().getProceed());
		clickOnElement(pom.getCheckout().getCheckout());
		String username= particular_DataDriven("C:\\Users\\jancy\\OneDrive\\Documents\\Course\\Test case for My Store-Jancy.xlsx", 19, 6);
		sendKeystoElement(pom.getLogin().getEmail(), username);
		String pass = particular_DataDriven("C:\\Users\\jancy\\OneDrive\\Documents\\Course\\Test case for My Store-Jancy.xlsx", 19, 7);
		sendKeystoElement(pom.getLogin().getPassword(), pass);
		clickOnElement(pom.getLogin().getSubmit());
		clickOnElement(pom.getAddrs().getAddress());
		clickOnElement(pom.getShpng().getTerms());
		clickOnElement(pom.getShpng().getCheckout());
		clickOnElement(pom.getTrans().getPay());
		clickOnElement(pom.getOrd().getOrder());
		scroll("window.scrollBy(0,500)");
		screenshot("order");
	}
}
