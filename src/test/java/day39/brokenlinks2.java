package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks2 {	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		//System.out.println(totallinks);
		
		int brokenlinks=0;
		/*for(WebElement links:totallinks)
		{
			
			String linkshref1 = links.getText();
			//System.out.println(linkshref);
			if(linkshref1==null || linkshref1.isEmpty())
			{
				System.out.println("this link is empty link");
				continue;
			}
			*/
			//To Hit URL to server
			try{
				//String linkshref1="https://testautomationpractice.blogspot.com";
				URL ln = new URL("https://testautomationpractice.blogspot.com");
				HttpURLConnection conn=(HttpURLConnection) ln.openConnection();
				conn.connect();
			}catch(Exception e)
			{
				
			}
			
		
		}
	}		
	

	

