package TestClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.TravelInsurance;
import configurations.PathConfiguration;

public class TC001insuranceTravel {
	
	
	TravelInsurance travel;

	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		
		
		System.setProperty("WebDriver.chrome.driver",PathConfiguration.chromeDriver);
		
		 driver = new ChromeDriver	();
		
		driver.get(PathConfiguration.appUrlpolicy);
		
		travel=new TravelInsurance(driver);
		Thread.sleep(2000);
		
		
			
		}
	
	@BeforeMethod
	
	public void maxibrowser() {
		
		driver.manage().window().maximize();
			
		}
	
	@Test
	
	public void testcase1() throws InterruptedException {
		
		travel.clickOnTravelInsurance();
		Thread.sleep(2000);
		
		travel.enterdest("USA");
		
		Thread.sleep(2000);
		travel.firststop();
		Thread.sleep(2000);
		travel.ClickOnNext();
		
		Thread.sleep(2000);
		travel.enterStartDate("15-02-2023");
		Thread.sleep(2000);
		travel.enetereDate("20-02-2023");
		Thread.sleep(2000);
		
		Actions act= new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
		
		
		

		travel.saving();
		
		travel.selectAge("25");
		Thread.sleep(2000);
		
		travel.agenextclk();
//		
//		travel.mednoclick();
//		
//		
		//travel.medproclick();
//		
		
		

	
		
	}
	
	@AfterMethod
	public void refresh() {
		
	}
	
	@AfterClass
	
	public void end() {
		
	}
	
		
	
	
	

}
