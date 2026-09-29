package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwaitcommand2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	 // Waiting 30 seconds for an element to be present on the page, checking
	   // for its presence once every 5 seconds.
	   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30))
	       .pollingEvery(Duration.ofSeconds(5))
	       .ignoring(NoSuchElementException.class);
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		

	   WebElement txtusername = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(By.id("//input[@placeholder='Username']"));
	     }
	   });
	txtusername.sendKeys("Admin");
	driver.quit();
	}

}
