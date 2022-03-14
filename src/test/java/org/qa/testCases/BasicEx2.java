package org.qa.testCases;

import org.testng.annotations.Test;

public class BasicEx2 {
  @Test
  public void SimpleTestMethod1() {
	  System.out.println("Hello 1");
  }
  @Test
  public void SimpleTestMethod2() {
	  System.out.println("Hello 2");
	  this.SimpleMethod3();
  }
 
  public void SimpleMethod3() {
	  System.out.println("Hello 3");
  }
  
}













//if u are going to give duplicate priorities then it will prefer the ASCII value.. 
