package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class Ignore_Annotations {

	@Test
	private void women() {
		System.out.println("Women");
	}

	
	@Test(enabled = false)
	private void men() {
		System.out.println("men");
	}
	
	@Ignore
	@Test
	private void child() {
		System.out.println("child");
	}
	
	@Test
	private void tshirt() {
		System.out.println("Tshirt");
	}

}
