package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paginationtable {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com");
	driver.manage().window().maximize();
	int row=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
	int num_pages= driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
	for(int t=1;t<=num_pages;t++)
	{
		if(t>1)
		{
			driver.findElement(By.xpath("//ul[@id='pagination']//li["+t+"]")).click();
			Thread.sleep(3000);
		}
	for(int p=1;p<=row;p++)
	{
		String id=driver.findElement(By.xpath("//table[@id='productTable']//tr["+p+"]//td[1]")).getText();
		String Name=driver.findElement(By.xpath("//table[@id='productTable']//tr["+p+"]//td[2]")).getText();
		String Price=driver.findElement(By.xpath("//table[@id='productTable']//tr["+p+"]//td[3]")).getText();
		driver.findElement(By.xpath("//table[@id='productTable']//tr["+p+"]//td[4]/input[@type='checkbox']")).click();
		System.out.println(id+"\t"+Name+"\t"+Price);
		
	}
	}
	}

}
