package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class policylogin {


	@FindBy(xpath="(//div[@class='prd-icon add shadowHandler short'])[2]")private WebElement fs1;

	@FindBy(xpath="(//i[@class='checkbox'])[1]")private WebElement self;

	@FindBy(xpath="//input[@type='submit']")private WebElement countinue;
	@FindBy(xpath="//select[@class='font-dark input_box select_input_box']")private WebElement age;
	
	
	
	public policylogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void firstcl() {
		fs1.click();
		
	}
	public void self() {
		self.click();
	}
	public void clickcountinue() {
		countinue.click();
		
	}
	public void enterAge(String A) {
		age.sendKeys(A);
	}
}
