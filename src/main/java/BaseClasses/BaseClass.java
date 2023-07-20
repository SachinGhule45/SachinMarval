package BaseClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import configurations.PathConfiguration;

public class BaseClass {
	
	WebDriver driver;
	
	public WebDriver launchBrowser() 
	{
		Reporter.log("--browser lauch---");
		
		System.setProperty("webdriver,chrome,driver",PathConfiguration.chromeDriver);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		
		driver = new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com");
		driver.manage().window().maximize();

		Reporter.log("--url is entered---");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	public void pressTab() {
		Actions act= new Actions(driver);
		act.sendKeys(Keys.TAB);
		
	}

}
