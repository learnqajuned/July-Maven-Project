package qa_BaseUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseUtility {
	WebDriver driver;
	public void selectByIndex(WebElement ele,int value) {
		Select se=new Select(ele);
		se.deselectByIndex(value);
	}
public void selectByValue(WebElement ele,String value) {
	Select se=new Select(ele);
	se.deselectByValue(value);
	}
public void selectByVisibleText(WebElement ele,String value) {
	Select se=new Select(ele);
	se.deselectByVisibleText(value);
}
	public WebDriver startUp(String browserName, String url) {
		String projectpath=System.getProperty("user.dir");
		System.out.println("Path ="+projectpath);
		if(browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver",
					projectpath+"\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("ff")) {
		System.setProperty("webdriver.gecko.driver",
				projectpath+"\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}else if(browserName.equalsIgnoreCase("Internetexplorer")||browserName.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver",
				projectpath+"\\Drivers\\iedriver.exe");
		 driver=new InternetExplorerDriver();
	}	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}

}
