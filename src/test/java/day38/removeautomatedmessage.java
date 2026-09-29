package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class removeautomatedmessage {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
				
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();

	}

}
