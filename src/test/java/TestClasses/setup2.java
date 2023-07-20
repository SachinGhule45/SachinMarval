package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.setup1;
import configurations.PathConfiguration;

public class setup2 {
	
	WebDriver driver;
	setup1 set;
	
	@BeforeClass
	
	public void launchbrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", PathConfiguration.chromeDriver);
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		
		
		
		
		driver=new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		
        setup1 sew= new setup1(driver);
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	
	public void maxibrowser() {
		
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void testcase1() throws InterruptedException {
		
		set.selectweb();
		Thread.sleep(2000);
		set.destination("USA");
		Thread.sleep(2000);
		set.firststopclick();
		Thread.sleep(2000);
		set.nextbtn1click();
		
	}
	@AfterMethod
	public void refresh() {
		
	}
	@AfterClass
	public void end() {
		
		
	}

}
