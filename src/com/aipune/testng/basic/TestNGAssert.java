package com.aipune.testng.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssert {
	WebDriver driver;
@BeforeMethod
public void openBrowser() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\TestNG Framework\\drivers//chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("https://flipkart.com");
    System.out.println("Browser Opened");
    driver.manage().window().maximize();
}
  @Test
  public void verifyHomepageTitle() {
	  
	 String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"; 
	 String actualTitle=driver.getTitle();
	 Assert.assertEquals(actualTitle, expectedTitle); 
  }
	 @AfterMethod
	 public void closeBrowser() 
	 {
		 driver.quit();
  }
	 
}
