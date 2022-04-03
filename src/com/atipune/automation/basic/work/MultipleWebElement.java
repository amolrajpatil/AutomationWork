package com.atipune.automation.basic.work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElement 
{
public static void main(String[] args) 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.findElement("")
	List<WebElement> itemstext = driver.findElements(By.xpath("//div[@class='xtXmba']"));
       System.out.println(itemstext.size());
    for (WebElement item : itemstext) 
    {
		System.out.println(item.getText());
		
	}
}
}
