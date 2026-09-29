package day44;

import org.testng.annotations.Test;

public class paymenttest {
	
	@Test(priority=1,groups={"sanity","regression","payment"})
	void paymentbyrupee()
	{
		System.out.println("payment in rupee");
	}
	
	@Test(priority=2,groups={"sanity","regression","payment"})
	void paymentbydollar()
	{
		System.out.println("payment in dollar");
	}

}
