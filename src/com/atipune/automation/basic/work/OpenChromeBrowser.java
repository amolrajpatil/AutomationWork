package com.atipune.automation.basic.work;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.microsoft.edge.seleniumtools.EdgeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\Automation\\Driver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://google.com");
         System.out.println("Browser Opened");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.close();
         
         System.setProperty("webdriver.gecko.driver", "C:\\BasicJavaWork\\Automation\\Driver\\geckodriver.exe");
         WebDriver driver2=new FirefoxDriver();
         driver2.get("https://google.com");
         System.out.println("Browser Opened");
         driver2.manage().window().maximize();
         Thread.sleep(2000);
         driver2.close();
         
         System.setProperty("webdriver.edge.driver", "C:\\BasicJavaWork\\Automation\\Driver\\msedgedriver.exe");
         WebDriver driver3=new EdgeDriver();
         driver3.get("https://google.com");
         System.out.println("Browser Opened");
         driver3.manage().window().maximize();
         Thread.sleep(2000);
         driver3.close();
	}

}

