package com.elearning_1.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.elearning_1.utilities.readconfig;

public class baseclass {
	readconfig readcon=new readconfig();
	public String baseURL=readcon.getApplicationURL();
	public String username=readcon.getUsername();
	public String password=readcon.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
		
		
	    logger = Logger.getLogger("elearning_1");
	    PropertyConfigurator.configure("log4j.properties");
	    if(br.equals("chrome"))
	        {
		System.setProperty("webdriver.chrome.driver", readcon.getChromePath());
    	 driver = new ChromeDriver();
	        }
	        else if (br.equals("firefox"))
	        {
	        	System.setProperty("webdriver.gecko.driver","d://geckodriver.exe");
				driver = new FirefoxDriver();

	        }
	    	 
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
