package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		WebElement optional=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select departure=new Select(optional);
		//System.out.println(departure);
		departure.selectByVisibleText("Boston");
		WebElement ar=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destination= new Select(ar);
		destination.selectByVisibleText("Rome");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		int row=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		int column=driver.findElements(By.xpath("//table[@class='table']//th")).size();
		for(int r=2;r<=row;r++)
		{
			String price1=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//th[6]")).getText();
			int price=Integer.parseInt(price1);
			
		}
		

	}

}
