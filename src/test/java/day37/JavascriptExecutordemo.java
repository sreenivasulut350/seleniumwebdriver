package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutordemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement textbox= driver.findElement(By.xpath("//input[@id='name']"));
		WebElement button = driver.findElement(By.xpath("//input[@id='male']"));
		
		// Need to write upcasting for driver variable 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//To enter the text in textbox by using javascript instead of webdriver method(SendKey() method)
		js.executeScript("arguments[0].setAttribute('value','John')",textbox);
		
		// To Click the radio by using the javascript instead of webdriver method(Click() method)
		js.executeScript("arguments[0].click()",button);
		


	}

}
