package com.pom.Pagefactory.Datadriven.TestNG.BaseClass.Utility.LisnersProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 
{
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement continuebtn;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//enter pin						
	public void enterpin(String pinValue)	//local variable can be with same or different name
	{
		pin.sendKeys(pinValue);
	}
			

//Continue button
	public void clickcntbtn()
	{
		continuebtn.click();
	}

}