
package TestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseClass;
import BaseClasses.Utility;
import PomClasses.Login;
import PomClasses.TravelInsurance;
import configurations.PathConfiguration;

public class Logintest {

	Login travel;
	BaseClass base;

	WebDriver driver;

	@BeforeClass
	public void launch() throws InterruptedException {

		base = new BaseClass();

	driver = base.launchBrowser();

	}

	@BeforeMethod

	public void maxibrowser() {

	}

	@Test

	public void testcase1() throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		travel = new Login(driver);

		travel.clickOnTravelInsurance();
		Thread.sleep(2000);

		travel.enterdest(Utility.reaData(1, 1));

		Thread.sleep(2000);
		travel.firststop();
		Thread.sleep(2000);
		travel.ClickOnNext();

		Thread.sleep(2000);
		travel.enterStartDate("15-02-2023");
		Thread.sleep(2000);
		travel.enetereDate("20-02-2023");
		Thread.sleep(2000);
	    
		base.pressTab();

		travel.saving();

		travel.selectAge("25");
		Thread.sleep(2000);

		travel.agenextclk();
//			
//			travel.mednoclick();
//			
//			
		// travel.medproclick();
//			

	}

	@AfterMethod
	public void refresh() {

	}

	@AfterClass

	public void end() {

	}

}
