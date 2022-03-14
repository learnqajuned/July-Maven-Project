package org.qa.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
// for all @Test Method "BeforeMethod" and "AfterMethod" is Repeated...
public class SequenceOfAnnotations {
	@BeforeSuite
	 public void BeforeSuiteMethod() {
		  System.out.println("Before Suite");
	  }
	@BeforeTest
	 public void BeforeTestMethod() {
		  System.out.println("Before Test");
	  }
	@BeforeClass
	 public void BeforeClassMethod() {
		  System.out.println("Before Class");
	  }
	@BeforeMethod
	public void BeforeMethod() {
		  System.out.println("Before Method");
	  }
  @Test
  public void TestMethod1() {
	  System.out.println("Test Method1");
  }
  @Test
  public void TestMethod2() {
	  System.out.println("Test Method2");
  }
  
  @AfterMethod
  public void AfterMMethod() {
	  System.out.println("After Method");
  }
  @AfterClass
  public void AfterClassMethod() {
	  System.out.println("After Class");
  }
  @AfterTest
  public void AfterTestMethod() {
	  System.out.println("After Test");
  }
  @AfterSuite
  public void AfterSuiteMethod() {
	  System.out.println("After Suite");
  }
  
  
}
