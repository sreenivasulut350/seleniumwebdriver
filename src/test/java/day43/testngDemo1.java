package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo1 {
	
	private static final String Preference = null;

	@Test(priority=1)
	public void A()
	{
		System.out.println("Output of method A.....");
	}
    
	@Test(priority=2)
	public void B()
	{
		System.out.println("Output of methos B....");
	}
	
	@BeforeMethod
	public void C()
	{
		System.out.println("Before method...");
	}
	
	@AfterMethod
	public void D()
	{
		System.out.println("After method...");
	}
	
	@BeforeClass
	void BC()
	{
		System.out.println("This is Before class method...");
	}
	
	@AfterClass
	void AC()
	{
		System.out.println("This is After class method...");
	}
	
	@BeforeTest
	void BT()
	{
		System.out.println("This is Before Test method...");
	}
	
	@AfterTest
	void AT()
	{
		System.out.println("This is After Test method...");
	}
	
	@BeforeSuite
	void BS()
	{
		System.out.println("This is Before suite method...");
	}
	
	@AfterSuite
	void AS()
	{
		System.out.println("This is Afetr suite method...");
	}
}
