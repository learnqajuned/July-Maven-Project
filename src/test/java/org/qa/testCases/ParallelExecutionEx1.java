package org.qa.testCases;

import org.testng.annotations.Test;

import qa_BaseUtilities.BaseUtility;

public class ParallelExecutionEx1 {
  @Test
  public void browserURL() {
	  BaseUtility obj=new BaseUtility();
	  obj.startUp("ch", "https://www.google.com/"); 
	  }
  @Test
  public void browserURL1() {
	  BaseUtility obj=new BaseUtility();
	  obj.startUp("ch", "https://www.google.com/"); 
	  }
  
  
}