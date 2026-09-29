package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencemethodintestng {
	
	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods= {"openapp","login"})
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"openapp","login"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5)
	void logout()
	{
		Assert.assertTrue(true);
	}

}
