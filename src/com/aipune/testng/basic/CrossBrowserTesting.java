package com.aipune.testng.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.microsoft.edge.seleniumtools.EdgeDriver;

public class CrossBrowserTesting {
	public WebDriver driver;
	@Parameters("browser")
	
  @BeforeClass
  public void browserLaunch(String browser) {
	if(browser.equalsIgnoreCase("firefox"))
	{
		 System.setProperty("webdriver.gecko.driver", "C:\\BasicJavaWork\\Automation\\Driver\\geckodriver.exe");
         driver=new FirefoxDriver();
        System.out.println("firefox opened succesfully");
	}
	else if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        System.out.println(" chrome Browser Opened succesfully");
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		 System.setProperty("webdriver.edge.driver", "C:\\BasicJavaWork\\Automation\\Driver\\msedgedriver.exe");
          driver=new EdgeDriver();
         System.out.println("Edge Browser Opened succesfully");
	}
	
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}
	@Parameters ({"username","password"})
	@Test
	public void verifyPageTitle(String uname,String pass)
	
	{
		System.out.println(uname);
		System.out.println(pass);
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
		
			
  }

