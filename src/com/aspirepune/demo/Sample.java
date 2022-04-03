package com.aspirepune.demo;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample
{
@AfterMethod
public void method3()
{
System.out.println("mane");
}

@Test	
public void method1()
{
	Reporter.log("Hiiii", true);
System.out.println("Hiiiii");
}

@BeforeMethod
public void method2()
{
System.out.println("amol");	
}



}