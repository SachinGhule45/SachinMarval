package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBooklogn {
	@FindBy(xpath="//input[@name='firstname']")private WebElement name;

	
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	
	@FindBy(xpath="//select[@name='birthday_day']")private WebElement day;
	
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement month;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement year ;
	@FindBy(xpath="//button[@name='websubmit']")private WebElement submmit;
	
	
	
	
	
	 public void Facebooklogin ( WebDriver driver){
		
		PageFactory.initElements(driver, this);
	 }
	 
	 public void enterFirstName(String A) {
		 
		 name.sendKeys(A);
	 }
	 public void enterLastName(String B) {
		 
		 lastname.sendKeys(B);
	 }
	 
	 public void enterEmail(String C) {
		 
		 email.sendKeys(C);
	 }
	 
	 public void EnterPassWord(String D) {
		 
		 password.sendKeys(D);
	 }
	 
	 public void clickonDay() {
		 day.click();
	 }
	 public void clickonmonth() {
		 month.click();
	 }
	 public void clickonYear() {
		 
		 year.click();
	 }
	 public void clickonSubmmit() {
		 
		 submmit.click();
	 }
		
	

}
