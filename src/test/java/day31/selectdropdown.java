package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement optionpl=driver.findElement(By.xpath("//select[@id='country-list']"));
		
		Select options=new Select(optionpl);
		//options.selectByVisibleText("India");
		
		//options.selectByValue("1");
		//options.selectByIndex(3);
		
		List<WebElement> op=options.getOptions();
		System.out.println("Number of options:"+ op.size());
		for(WebElement op2:op)
		{
			System.out.println(op2.getText());
		}
		

	}

}
