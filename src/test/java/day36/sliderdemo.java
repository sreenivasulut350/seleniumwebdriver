package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderdemo {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	driver.manage().window().maximize();
	WebElement min_slider =driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	System.out.println(min_slider.getLocation());// to get the min co-ordinates 
	System.out.println(max_slider.getLocation());// to get the max co-ordinates
	Actions act = new Actions(driver);
	act.dragAndDropBy(min_slider, 100, 0).perform();// to move the min slider upto 100 points
	act.dragAndDropBy(max_slider, -100, 0).perform();// To reduce the max slider upto 100 points
	}

}
