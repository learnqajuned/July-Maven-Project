package org.qa.testCases;

import org.testng.annotations.Test;

public class PrioritiesEx {
	@Test(priority=1)
	public void LoginMethod() {
		System.out.println("LoginMethod");
	}
	@Test(priority=2)
	public void loginMethod() {
		System.out.println("loginMethod");
	}
	@Test(priority=3)
	public void CreateMethod() {
		System.out.println("CreateMethod");
	}
	@Test(priority=4)
	public void UpdateMethod() {
		System.out.println("UpdateMethod");
	}
	@Test(priority=5)
	public void DeleteMethod() {
		System.out.println("DeleteMethod");
	}


}



// priority means it is your choice which method u want execute 1,2,3..... 



// it will execute with reference to ASCII value....