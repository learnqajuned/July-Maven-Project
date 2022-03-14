package org.qa.testCases;

import org.testng.annotations.Test;

import qa_BaseUtilities.BaseUtility;

public class invocationCount {
  @Test(invocationCount=2,threadPoolSize=5)
  public void browserURL() {
	  BaseUtility obj=new BaseUtility();
	  obj.startUp("ch", "https://www.google.com/"); 
	  }
  /*@Test
  public void browserURL1() {
	  BaseUtility obj=new BaseUtility();
	  obj.startUp("ff", "https://www.google.com/"); 
	  }*/
  
  
}
// in invocation after first url page load u will directed to another url page load..

//but in threadpool it will open url page parallely without waiting to load first url page.

// thradpool 5 means it load 3times as invocationcount and wait for 2 times or pending..