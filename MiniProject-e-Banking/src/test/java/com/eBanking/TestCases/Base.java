package com.eBanking.TestCases;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base
{
	
	
	public String baseURL="https://demo.guru99.com/v3/index.php";
	
	public String userName="mngr550239";
	
	public String passWord="hApYsYs";
	
	public static WebDriver driver;
	
	public static Logger logg;
	
	
	//initial setup
	
	
	@Parameters("browsers")
	@BeforeClass
	public void setUp(String brwsr)
	{
		
		
		
		//adding logs here in Base(C) coz again every TC needs it
		
		logg=(Logger) LogManager.getLogger(Base.class);
		
		// for cross browser testing 
		
		if(brwsr.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(brwsr.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(brwsr.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		
		//openign URL after browser launch
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
	}
	
	
	
	// closure 
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
