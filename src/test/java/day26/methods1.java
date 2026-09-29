package day26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class methods1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//get methods
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//button[@id='PopUp']")).click();
		System.out.println(driver.getWindowHandles());
		
		//Conditional Methods
		System.out.println(driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//input[@id='name']")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isSelected());
		driver.findElement(By.xpath("//input[@id='male']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='male']")).isSelected());
		
		//Browser Methods
		//driver.close();
		driver.quit();

	}

}
