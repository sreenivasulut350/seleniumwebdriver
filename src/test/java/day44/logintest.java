package day44;

import org.testng.annotations.Test;

public class logintest {
	
	@Test(priority=1,groups={"sanity"})
	void loginbyemail()
	{
		System.out.println("this is login by email...");
	}
	
	@Test(priority=2,groups={"sanity"})
	void loginbyfacebook()
	{
		System.out.println("this is login by facebook...");
	}
	
	@Test(priority=3,groups={"sanity"})
	void loginbytwitter()
	{
		System.out.println("this is login by twitter...");
	}

}
