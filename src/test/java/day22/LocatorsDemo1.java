package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<WebElement> imgs= driver.findElements(By.tagName("img"));
		System.out.println(imgs.size());
		driver.findElement(By.linkText("Next")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
