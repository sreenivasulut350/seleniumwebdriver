package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionsdemo {
	@Test
	void test1()
	{
		//Assert.assertEquals(20, 20);//HardAssertions
		
		//softAssertions
		SoftAssert as=new SoftAssert();
		as.assertEquals(20, 40);
		System.out.println("Resut of Test1 Method");
		as.assertAll();
		
	}

}
