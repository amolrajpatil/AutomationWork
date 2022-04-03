package com.aspirepune.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoProgram 
{

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			 WebElement dm = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		     dm.click();
		     Thread.sleep(2000);
			WebElement mn = driver.findElement(By.xpath("//select[@id='month']"));
		    Select s=new Select(mn);
		    if(s.isMultiple()) 
		    {
		    	System.out.println("list box is selectable");
		    }
		    else
		    {
		    	System.out.println("list box is not selectable");
		    }

	}

}
