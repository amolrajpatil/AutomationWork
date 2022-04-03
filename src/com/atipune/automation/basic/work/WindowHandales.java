package com.atipune.automation.basic.work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandales 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 List<WebElement> items = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	System.out.println(items);
	for (WebElement mobileN : items) 
	{
		mobileN.getText();
		Thread.sleep(2000);
		
	    mobileN.click();
	}
}
}
