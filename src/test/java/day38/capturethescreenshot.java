package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturethescreenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//Take full screenshot
		/*TakesScreenshot ts= (TakesScreenshot)driver;
		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);//copy the sourcefile to Targetfile
		*/
		//Take the screen shot specific area of page
		WebElement staticweb=driver.findElement(By.xpath("//div[@id='HTML1']"));
		File sourcefile=staticweb.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\specificarea.png");
		sourcefile.renameTo(targetfile);//copy the sourcefile to Targetfile
		
		// specific WebElement 
		
		WebElement web=driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		File sourcefile1=web.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\specificwebelement.png");
		sourcefile1.renameTo(targetfile1);//copy the sourcefile to Targetfile

	}

}
