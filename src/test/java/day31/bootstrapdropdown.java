package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		//driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		System.out.println(" Number of Options:"+ options.size());
		/* for(WebElement op:options)
		{
			System.out.println(op.getText());
		}*/
		
		// select multiple values
		for(WebElement op:options)
		{
			String r=op.getText();
			if(r.equals("Java")||r.equals("Python"))
			{
				op.click();
			}
		
		}
		

	}	

}
