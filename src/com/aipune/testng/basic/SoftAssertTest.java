package com.aipune.testng.basic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	SoftAssert sa=new SoftAssert(); 
  @Test
  public void softAssertCase() {
	System.out.println("soft assert statment pass.....");
	sa.assertEquals(true, true);
	//execute next as it's soft assert
	System.out.println("soft assert statment2 fail.....");
	sa.assertEquals("c", "e");
	System.out.println("soft assert statment3 pass.....");
	sa.assertEquals(true, true);
	System.out.println("soft assert statment4 fail.....");
	sa.assertEquals("c", "a");
	sa.assertAll();
  }
  @Test
  public void hardAssertTestCase(){
	  System.out.println("hard assert statment1 pass...");
	  Assert.assertEquals("same", "same");
	  System.out.println("hard assert statment2 fail.....");
	  Assert.assertEquals("same1", "smae2");
	  //not execute next as fails above hard assert
	  System.out.println("after fail in hard assert");
	  Assert.assertEquals("same", "same");
	  
	  
	  
}
}