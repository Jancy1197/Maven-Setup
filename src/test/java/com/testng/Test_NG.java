package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_NG {

	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");
	}

	@BeforeTest
	private void browser() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void url() {
		System.out.println("Launch URL");
	}

	@BeforeMethod
	private void Signin() {
		System.out.println("Sign In");
	}

	@Test
	private void women() {
		System.out.println("Women");
	}

	@AfterMethod
	private void signout() {
		System.out.println("Sign Out");
	}

	@AfterClass
	private void home_Page() {
		System.out.println("Home Page");
	}

	@AfterTest
	private void close() {
		System.out.println("Close");
	}

	@AfterSuite
	private void cookies() {
		System.out.println("Delete Cookies");
	}

	@Test
	private void dress() {
		System.out.println("Dress");
	}

	@Test
	private void tshirt() {
		System.out.println("T-Shirt");
	}
}
