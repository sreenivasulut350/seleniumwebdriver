package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class cssselectordemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("TEST");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("TEST");
		
		//tag class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Test2");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Test2");
		
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Test3");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Test3");
		
		//tag class attribute
		
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("test4");		
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("test4");
	

	}

}
