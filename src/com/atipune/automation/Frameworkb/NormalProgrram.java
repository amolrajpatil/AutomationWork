package com.atipune.automation.Frameworkb;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NormalProgrram 
	{
		public static void main(String[] args) throws InterruptedException 
		{System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        Thread.sleep(2000);
	//Enter UN
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amolmanes1122@gmail.com");
	//enter Pwd
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amol@1007");
	//enter button
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(@class,'_4EzTm    ')])/div[3]")).click();
	//enter pin
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("976976");
	//Continue button
			//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//logo verify
			Thread.sleep(2000);
			boolean expLogo = true;
			boolean actLogo = driver.findElement(By.xpath("//img[@class='s4Iyt']")).isDisplayed();
			if(expLogo==actLogo)
			{
				System.out.println("Logo verification Test case is pass");
			}
			else
			{
				System.out.println("Logo verification Test case is fail");
			}
	//initial name verify
	/*
	 * String expInitialName = "PM"; String actInitialName =
	 * driver.findElement(By.xpath("//div[@class='avatar']/span")).getText();
	 * if(expInitialName.equals(actInitialName)) {
	 * System.out.println("Initial name verification Test case pass"); } else {
	 * System.out.println("Initial name verification Test case fail"); }
	 */
			
			Thread.sleep(10000);
			driver.close();
		}
	}

