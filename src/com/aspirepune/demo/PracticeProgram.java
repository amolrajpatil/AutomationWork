package com.aspirepune.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='xtXmba']"));
		System.out.println(link.size());
		
		for (WebElement ele : link) 
		{
			ele.getText();
			
		}
	}

}

