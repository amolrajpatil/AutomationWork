package pomPagefactoryDatadrivenTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestClass 
{
	WebDriver driver=null;
	Workbook wbf;
	LoginPage lp;
	PinPage pp;
	HomePage hp;
	
	
	@BeforeClass
	public void browserlaunch() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //20000
												//either of (Duration.ofSeconds(20)) or (20, TimeUnit.SECONDS)
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	
		String filepath="C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\testdata\\ProjectData.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		wbf = WorkbookFactory.create(file);
		lp= new LoginPage(driver);
		pp = new PinPage(driver);
		hp = new HomePage(driver);
	}
	
	@BeforeClass
	public void loginToApp() 
	{
		lp.enterUserName(wbf.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue());
		lp.enterPassword(wbf.getSheet("Sheet1").getRow(10).getCell(2).getStringCellValue());
		lp.clickloginButton();
		
		pp.enterpin(wbf.getSheet("Sheet1").getRow(10).getCell(3).getStringCellValue());
		pp.clickcntbtn();
		
	}
	
	@Test
	public void verificationOfLogo()
	{
		hp.verifylogo(wbf.getSheet("Sheet1").getRow(10).getCell(6).getBooleanCellValue());
		
	}
	@Test
	public void verificationOfInitials()
	{
		hp.verifyInitialName(wbf.getSheet("Sheet1").getRow(10).getCell(4).getStringCellValue());
	}	
	
	@AfterClass
	public void closeBrowser() 
	{
		
		driver.close();
	}
	
			
}