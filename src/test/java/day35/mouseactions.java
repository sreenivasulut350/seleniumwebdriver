package day35;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2= driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		WebElement drag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act= new Actions(driver);
		box1.clear();
		box1.sendKeys("welcome");
		
		// for double click and then Text comparison 
		act.doubleClick(button).perform();
		
		
		String text = box2.getAttribute("value");
		System.out.println(text);
		if(text.equals("welcome"))
		{
			System.out.println("Text coppied correctly");
		}
		else
		{
			System.out.println("Text not coppied correctly");
		}
		
		// for drag and drop avtion
		String text2= drag.getText();
		
		act.dragAndDrop(drag, drop).perform();
		System.out.println(drop.getText());
		
	}

}
