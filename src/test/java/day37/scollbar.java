package day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scollbar {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,1000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll down the page to visible this element -Pagination Web Table]
		/*WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
       */
		
		// To scroll down to end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// To scroll to initial page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}

}
