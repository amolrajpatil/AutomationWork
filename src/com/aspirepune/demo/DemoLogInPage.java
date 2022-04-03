package com.aspirepune.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DemoLogInPage 
{
	@FindBy(xpath="xpath") WebElement un;
	@FindBy(xpath="xpath2") WebElement pwd;
	@FindBy(xpath="xpath3") WebElement btn;
	public DemoLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setPassword()
	{
		pwd.sendKeys("amol@mane");
	}
	
	public void setUserName()
	{
		un.sendKeys("AMOLMANE");
	}
	public void ClickButton()
	{
		btn.click();
	}

}
