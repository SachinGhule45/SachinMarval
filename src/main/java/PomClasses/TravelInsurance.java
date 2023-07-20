package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravelInsurance {
	

		

		@FindBy(xpath="//input[@id='country']")private WebElement selecticn;
		
		@FindBy(xpath="//input[@id='country']")private WebElement dest;
		

		@FindBy(xpath="//ul[@class='search-list']/li")private WebElement firstop;
		
		@FindBy(xpath="//button[text()='Next']")private WebElement nextbtn1;
		
		@FindBy(xpath="(//input[@placeholder='dd mmmm, yyyy'])[1]")private WebElement sdate;
		
		@FindBy(xpath="(//input[@placeholder='dd mmmm, yyyy'])[2]")private WebElement edate;
		
		@FindBy(xpath="//select[@id='feet']")private WebElement age;
		
		@FindBy(xpath="//button[@class='travel_main_cta']")private WebElement agenext;
		
		@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement lastbtn;
		
		@FindBy(xpath="//button[@class='travel_main_cta']")private WebElement savemed;
		
		
		@FindBy(xpath="//label[@for='ped_no']")private WebElement Medno;
		
		//@FindBy(xpath="//button[@class='travel_main_cta']")private WebElement medprod;
		
		
		public TravelInsurance (WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
			
		}
		
		public void clickOnTravelInsurance() {
			
			selecticn.click();
			
		}
		
		public void enterdest(String dst) {
			dest.sendKeys(dst);
			
		}
		public void firststop() {
			firstop.click();
			
		}
		
		public void ClickOnNext() {
			
			nextbtn1.click();
		}
		public void enterStartDate(String date) {
			sdate.sendKeys(date);
		}

		
		public void enetereDate(String date1) {
			
			edate.sendKeys(date1);
		
		}
		public void selectAge(String ag) {
			Select s= new Select (age);
			s.selectByValue(ag);
				
			}
		public void Lastbutton() {
			
			lastbtn.click();
		}
		public void saving() {
			savemed.click();
		}
		public void agenextclk() {
			agenext.click();
		}
//		public void mednoclick() {
//			
//			Medno.click();
//		}
	//	public void medproclick() {
		//	medprod.click();
		//}

	}

	


