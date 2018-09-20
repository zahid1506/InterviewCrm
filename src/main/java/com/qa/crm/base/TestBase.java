package com.qa.crm.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	public static Logger log=Logger.getLogger("class");
	public TestBase(){
		BasicConfigurator.configure();
		DOMConfigurator.configure("Log4j.xml");
		try{
			FileInputStream fis=new FileInputStream("./src/main/java/com/qa/crm/properties/config.properties");
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

	public static void intialization(){
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Users/Aritra/Desktop/selenium essentials/browser driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.marionette","C:/Users/zahid/Desktop/selenium essentials/browser driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		        
		//changes from git 
		
	}
}
