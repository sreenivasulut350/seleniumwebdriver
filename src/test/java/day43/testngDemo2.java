package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngDemo2 {
	
	@Test
	public void method1()
	{
		System.out.println("this is method1 out put...");
	}
    
	@BeforeClass
	void classmethod1()
	{
		System.out.println("this is before classmethod1 out put...");
	}
	
	@AfterClass
	void classmethod2()
	{
		System.out.println("this is after classmethod1 out put...");
	}
}
