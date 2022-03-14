package org.qa.testCases;

import org.testng.annotations.Test;

public class PrioritiesEx2 {
	@Test(priority=0)
	public void LoginMethod() {
		System.out.println("LoginMethod");
	}
	@Test(priority=-100)
	public void loginMethod() {
		System.out.println("loginMethod");
	}
	@Test(priority=10)
	public void CreateMethod() {
		System.out.println("CreateMethod");
	}
	@Test
	public void UpdateMethod() {
		System.out.println("UpdateMethod");
	}
	@Test(priority=5)
	public void DeleteMethod() {
		System.out.println("DeleteMethod");
	}


}
// u can give zero priority and also negative(-) priority.... 
// after negative priority, zero priority will always executed before the no priority execution... 