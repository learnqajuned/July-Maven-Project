package org.qa.testCases;

import org.testng.annotations.Test;

public class DuplicatePrioritiesEx {
	@Test(priority=1)
	public void LoginMethod() {
		System.out.println("LoginMethod");
	}
	@Test(priority=1)
	public void loginMethod() {
		System.out.println("loginMethod");
	}
	@Test(priority=1)
	public void CreateMethod() {
		System.out.println("CreateMethod");
	}
	@Test(priority=1)
	public void UpdateMethod() {
		System.out.println("UpdateMethod");
	}
	@Test(priority=1)
	public void DeleteMethod() {
		System.out.println("DeleteMethod");
	}


}


//if u are going to give duplicate priorities then it will prefer the ASCII value..