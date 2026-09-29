package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//move to frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));  //Used WebElement
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		driver.switchTo().defaultContent(); // Move to Home page
		
		//move to frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']")); // used WebElement
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");
		
		//Move to Iframe
		driver.switchTo().frame(0);  // used index
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		
	}

}
