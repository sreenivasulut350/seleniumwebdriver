package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramtest {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		case "firefox":driver=new FirefoxDriver();break;
		default: System.out.println("invalid browser");return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void login()
	{
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		if (status==true)
		{
			System.out.println("creadential aren't correct");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
