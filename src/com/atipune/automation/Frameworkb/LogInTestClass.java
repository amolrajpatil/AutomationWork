package com.atipune.automation.Frameworkb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTestClass
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);	
		
		LogInPage lp= new LogInPage(driver);
		lp.enterUserName();
		lp.enterPassword();
		lp.clickloginButton();
		Thread.sleep(4000);
		
		PinPage pp = new PinPage(driver);
		pp.enterpin();
		pp.clickcntbtn();
		Thread.sleep(4000);
		
		HomePage hp = new HomePage(driver);
		hp.verifylogo();
		hp.verifyInitialName();
		
		Thread.sleep(10000);
		driver.close();
	  
	
  }
}
