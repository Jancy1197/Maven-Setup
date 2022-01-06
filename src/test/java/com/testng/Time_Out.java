package com.testng;

import org.testng.annotations.Test;

public class Time_Out {
	
	@Test(timeOut = 7000)
	private void login() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		Thread.sleep(2000);
		System.out.println("Get Url");
		Thread.sleep(2000);
		System.out.println("Enter the cretential ");
		System.out.println("Validate the cretential");
		System.out.println("Navigate to home page");
	}
	
	

}
	