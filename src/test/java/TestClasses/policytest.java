package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseClass;
import PomClasses.policylogin;

public class policytest {
	
	BaseClass base;
	WebDriver driver;
	
	
	@BeforeClass
	public void launchbrowser() {
		
		base =new BaseClass();
		driver =base.launchBrowser();
		
	}
	
	@BeforeMethod
	public void max() {
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void tc001() throws InterruptedException {
		
		 policylogin pom=new policylogin(driver);
		 
		 pom.firstcl();
		 Thread.sleep(2000);
		 pom.self();
		 Thread.sleep(2000);
		 pom.clickcountinue();
		 
		 Thread.sleep(2000);
		 pom.enterAge("25");
	}
	@AfterMethod 
	public void details(){
		
	}
	
	@AfterClass
	
	public void end() {
		
	}
	
	
	
	

}

