package com.atipune.automation.Frameworkb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotSample {

	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcFile=ts.getScreenshotAs(OutputType.FILE);
        System.out.println(srcFile);
        File destFile=new File("C:\\Users\\user\\Desktop\\screenshot\\SCREENSHOT.jpg");
        Files.copy(srcFile, destFile);
        Thread.sleep(5000);
        driver.quit();
        

	
	}


}
