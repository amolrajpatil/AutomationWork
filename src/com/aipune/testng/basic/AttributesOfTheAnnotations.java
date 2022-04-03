package com.aipune.testng.basic;

import org.testng.annotations.Test;

public class AttributesOfTheAnnotations {
	
	//priority
	//non priority
	
	
	
  @Test
  public void a()
  {
	
	System.out.println("a");  
  }
  @Test(timeOut=1,threadPoolSize=3,invocationCount=5)
  public void b()
  {
	System.out.println("b");
	  
  }
  @Test(alwaysRun=true,priority=3,dependsOnMethods= {"e","x"})
  public void c()
  {
	
	System.out.println("c");  
  }
  @Test(priority=-1,groups="regression")
  public void d()
  {
	
	  System.out.println("d");
  }
  @Test(enabled=true)
  public void e()
  {
	
	  System.out.println("e");
  }
  @Test(priority=-2,dependsOnGroups= {"regression"})
  public void P()
  {
	
	  System.out.println("P");
  }
  @Test(priority=5,invocationCount=3,invocationTimeOut=1)
  public void x()
  {
	
	  System.out.println("x");
  }
  @Test(priority=1,dependsOnMethods= {"a"})
  public void m()
  {
	
	  System.out.println("m");
  }
  @Test(priority=2,groups={"smoke","regression"})
  public void s()
  {
	
	 System.out.println("s"); 
  }
}
