package day39;


import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	
	
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		//System.out.println(totallinks);
		
		int brokenlinks=0;
		for(WebElement links:totallinks)
		{
			
			String linkshref = links.getText();
			//System.out.println(linkshref);
			if(linkshref==null || linkshref.isEmpty())
			{
				System.out.println("this link is empty link");
				continue;
			}
			
			//To Hit URL to server
						
			try {
				URL urllinks = new URL(linkshref);
				HttpURLConnection conn=(HttpURLConnection) urllinks.openConnection();
				conn.connect();
				
				if (conn.getResponseCode()>=400)
				{
					System.out.println(linkshref+"===>It is Broken link");
					brokenlinks++;
				}else
				{
				System.out.println(linkshref+"Not Broken link: ");
			    }
			
				}
			catch(Exception e){
				
				}			
			}
		System.out.println("Total broken lins"+brokenlinks);
		
	}
	}

