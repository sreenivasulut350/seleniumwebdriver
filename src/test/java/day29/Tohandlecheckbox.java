package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tohandlecheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
		//WebElement section=driver.findElement(By.id("productTable"));
		List<WebElement> checkboxs =driver.findElements(By.xpath("//table[@id='productTable']//input"));  //used descendants xpath
		
		/*for(WebElement check:checkboxs) {
			check.click();
		}*/
		
		for(int i=0;i<checkboxs.size()-3;i++)
		{
			checkboxs.get(i).click();
			
		}
		
		Thread.sleep(5000);
		for (int i=0; i<checkboxs.size();i++)
		{
			if(checkboxs.get(i).isSelected())
			{
				checkboxs.get(i).click();
			}
		}

	}

}
