package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Openthelinkinnewtab {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	//To open the window in new tab
	WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
	
	//switch to new window
	List<String> ids=new ArrayList(driver.getWindowHandles());
	System.out.println(ids);
	driver.switchTo().window(ids.get(1));
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ram");
	
	//Switch back to home window
	driver.switchTo().window(ids.get(0));
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("welcom");

	}

}
