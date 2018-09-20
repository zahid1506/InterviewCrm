package com.qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.crm.base.TestBase;




public class LoginPOM extends TestBase {
    //Declaration or creating repository
	@FindBy(xpath="//a[@class='navbar-brand']/img")
    WebElement logo;
	
	@FindBy(name="username")
	WebElement un;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement loginbutton;
	
	//initialization 
	public LoginPOM(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	//utilization
	public boolean displaylogo(){
		boolean flag=logo.isDisplayed();
		
		return flag;
	}
	public void loginTOHome(){
		un.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("password"));
		loginbutton.click();
		
		// i m from git
		
	}
		
	// i m from eclipse
    
}
