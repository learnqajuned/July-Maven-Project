package org.qa.testCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa_BaseUtilities.BaseUtility;

public class window_HandlingEx1 {

	public static void main(String[] args) {
	
		BaseUtility obj=new BaseUtility();
		WebDriver driver=obj.startUp("ch", "https://demoqa.com/browser-windows");
		
		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
		driver.findElement(By.id("windowButton")).click();
		
		String parentid=driver.getWindowHandle();
		System.out.println("parent win id ="+parentid);
		//parent id means url window id.
		
		Set<String> allWinId=driver.getWindowHandles();
		Iterator<String> allWinItr=allWinId.iterator();
		//u can also write Iterator like in below line.
		//driver.getWindowHandles().iterator();
		
		String id1=allWinItr.next();
		System.out.println("id1 ="+id1);
		String id2=allWinItr.next();
		System.out.println("id2 ="+id2);
		
		//switch driver from 1 to another window.
		driver.switchTo().window(id2);
		String childtext=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Child Win Text="+childtext);
		
		driver.quit();
		

	}

}
