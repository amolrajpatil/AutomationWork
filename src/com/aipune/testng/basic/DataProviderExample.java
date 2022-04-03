package com.aipune.testng.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	public static WebDriver driver;
	public static WebElement weUserName,weUserpass,weConfermpass,wePreLang,weEngLang,weSecAns,weSecAnssel,weSecAnsIn;
  @BeforeClass
  public void openBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\TestNG Framework\\drivers//chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	    System.out.println("Browser Opened");
	    driver.manage().window().maximize();
	  WebElement okbutton=driver.findElement(By.xpath("//button[text()='OK']"));
	  if(okbutton.isDisplayed()) {
		  okbutton.click();
	  }
  }
  
  @Test(dataProvider="login-data")
  public void loginForm(String tcid,String tcdesc,String uname,String pass,String confpass,String secansin)
  {
	  System.out.println("test case id"+tcid);
	  System.out.println("test case description"+tcdesc);
	  
	 weUserName=driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	 weUserName.clear();
	 weUserName.sendKeys(uname);
	 
	 weUserpass=driver.findElement(By.xpath("//*[@id=\"usrPwd\"]"));
	 weUserpass.clear();
	 weUserpass.sendKeys(pass);
	 
	 weConfermpass=driver.findElement(By.xpath("//*[@id=\"cnfUsrPwd\"]"));
	 weConfermpass.clear();
	 weConfermpass.sendKeys(confpass);
	 
	 wePreLang=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div"));
	 wePreLang.click();
	 weEngLang=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span"));
	 weEngLang.click();
	 
	 weSecAns=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div"));
	 weSecAns.click();
	 weSecAnssel=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span"));
	 weSecAnssel.click();
	 
	 weSecAnsIn=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input"));
	 weSecAnsIn.clear();
	 weSecAnsIn.sendKeys(secansin);
	 // part of validation
	if("TC01".equalsIgnoreCase(tcid)) {
		String expected="User Name is required.";
		String actual=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[2]/div/div/span[1]")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println("Form validation passed with"+tcdesc);
	}else if ("TC02".equalsIgnoreCase(tcid)) {
		String expected2="Password is invalid.Min 8 character & Max 15 character. Password must contain at least one small & one capital alphabet and numeric digit.";
	String actual2=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[3]/div/div/span[2]")).getText();
	Assert.assertEquals(actual2, expected2);
	System.out.println("Form validation passed with"+tcdesc);
	}
	 
  }
  @DataProvider(name="login-data")
  public Object[][] loginData()
  {
	  return new Object[][] {
			  new Object[] {"TC01","userblank","","Atipune@143","Atipune@143","ati istitute"},  
			  new Object[] {"TC02","blankpassword","atipune11gmail","","Atipune@143","ati istitute"},
			  new Object[] {"TC03","blankconfpass","atipune11gmail","Atipune@143","","ati istitute"}, 
			  new Object[] {"TC04","blanksecans","atipune11gmail","Atipune@143","Atipune@143"," "}, 
			  new Object[] {"TC05","blankunameandpass","","","Atipune@143","ati istitute"}, 
			  new Object[] {"TC06","all filled","atipune11gmail","Atipune@143","Atipune@143","ati istitute"}, 

	                                            };
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.quit();
  }
  
}
