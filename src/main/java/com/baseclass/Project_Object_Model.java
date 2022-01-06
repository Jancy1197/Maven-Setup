package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Project_Object_Model {
	
	public WebDriver driver;

	private Home_Page hp;
	private Product prd;
	private AddtoCart cart;
	private Proceed_Checkout proceed;
	private Summary checkout;
	private Sign_In login;
	private Address addrs;
	private Shipping shpng;
	private Payment trans;
	private Confirm_Order ord;
	
	public Project_Object_Model(WebDriver driver1){
		this.driver=driver1;	
	}
	public Home_Page getHp() {
		hp=new Home_Page(driver);
		return hp;
	}
	public Product getPrd() {
		prd=new Product(driver);
		return prd;
	}
	public AddtoCart getCart() {
		cart=new AddtoCart(driver);
		return cart;
	}
	public Proceed_Checkout getProceed() {
		proceed=new Proceed_Checkout(driver);
		return proceed;
	}
	public Summary getCheckout() {
		checkout=new Summary(driver);
		return checkout;
	}
	public Sign_In getLogin() {
		login=new Sign_In(driver);
		return login;
	}
	public Address getAddrs() {
		addrs=new Address(driver);
		return addrs;
	}
	public Shipping getShpng() {
		shpng=new Shipping(driver);
		return shpng;
	}
	public Payment getTrans() {
		trans=new Payment(driver);
		return trans;
	}
	public Confirm_Order getOrd() {
		ord=new Confirm_Order(driver);
		return ord;
	}
	

}
