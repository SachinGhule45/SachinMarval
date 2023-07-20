package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import PomClasses.FaceBooklogn;
import configurations.PathConfiguration;

public class FacebookTest {
	WebDriver driver;
	FaceBooklogn log1;
	
	
	@BeforeClass
	public void launchbrowser() {


		
		System.setProperty("webdriver.crome.driver",PathConfiguration.chromeDriver );
		
		driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		//FaceBooklogn log1 = new FaceBooklogn (driver);
		
		
	
	
	
	
}
}
