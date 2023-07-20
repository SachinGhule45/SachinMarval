package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class setup1 {
	

	@FindBy(xpath="//input[@id='country']")private WebElement select1;
	
	@FindBy(xpath="//input[@id='country']")private WebElement dest;
	

	@FindBy(xpath="//ul[@class='search-list']/li")private WebElement firstop;
	
	@FindBy(xpath="//button[text()='Next']")private WebElement nextbtn1; 
	
	
	
	public setup1 (WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void selectweb() {
		select1.click();
	}
	
	public void destination(String str) {
		
		dest.sendKeys(str);
	}
	public void firststopclick() {
		firstop.click();
	}
	
	public void nextbtn1click() {
		nextbtn1.click();
	}
	

}
