package com.qa.crm.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.crm.base.TestBase;
import com.qa.crm.pages.LoginPOM;

public class LoginPageTest extends TestBase{
	LoginPOM lp;

	@BeforeMethod
	public void init(){
		TestBase.intialization();;
		lp=new LoginPOM(driver);
		
	}
	@Test(priority=1)
	
	public void verifylogo(){
		log.info("executing and checking if logo is displayed or not");
		lp.displaylogo();
	}
	@Test(priority=2)
	public void LoginToHome(){
		log.info("log in into the app");
		lp.loginTOHome();
	}
	@AfterMethod
	public void close(){
		driver.quit();
	}
}
