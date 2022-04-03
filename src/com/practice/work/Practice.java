package com.practice.work;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice

{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/amazon.com");
		driver.manage().window().maximize();
		driver.navigate().to("https:/flipkart.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().getClass();
		driver.navigate().hashCode();
		
		System.out.println("test pass successfully");
		driver.close();
	}

}
