package org.qa.testCases;

import org.testng.annotations.Test;

public class DuplicatePrioritiesEx2 {
	@Test(priority=1)
	public void LoginMethod() {
		System.out.println("LoginMethod");
	}
	@Test(priority=1)
	public void loginMethod() {
		System.out.println("loginMethod");
	}
	@Test(priority=2)
	public void CreateMethod() {
		System.out.println("CreateMethod");
	}
	@Test(priority=3)
	public void UpdateMethod() {
		System.out.println("UpdateMethod");
	}
	@Test(priority=4)
	public void DeleteMethod() {
		System.out.println("DeleteMethod");
	}


}
//priority=0 is also acceptable....
//if u are going to give duplicate priorities then it will prefer the ASCII value..
//if u are going to give same priority then it will prefer the ASCII value..