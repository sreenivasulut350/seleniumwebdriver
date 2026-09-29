package day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement section= driver.findElement(By.id("Wikipedia1_wikipedia-search-results"));
		//System.out.println(section);
		List<WebElement> links= section.findElements(By.tagName("a"));		
		//System.out.println(links.size());
		System.out.println(links);
		for(WebElement link:links) {
			
			System.out.println("link text:"+link.getText());
			link.click();
		}
		Set<String> webid= driver.getWindowHandles();
		System.out.println(webid);
		for(String id:webid) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
			if (title.equals("Selenium - Wikipedia")||title.equals("Selenium (software) - Wikipedia"))
			{	
				System.out.println("closing window:" +title);
				driver.close();
			}
		}
		
	}

}
