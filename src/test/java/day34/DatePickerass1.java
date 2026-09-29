package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerass1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		
		//To select values
		String year="2026", month="Sep", date="15";
		
	
		driver.findElement(By.xpath("//input[@id='dp1750121854381']")).click();
		
		//To Select the year dropdown
		WebElement py= driver.findElement(By.xpath("//select[@aria-label='Select year']"));		
		Select y = new Select(py);
		y.selectByVisibleText(year);

	}

}
