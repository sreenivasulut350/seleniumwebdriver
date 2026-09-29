package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. lunch chrome browser
 2. open url https://demo.nopcommerce.com
 3. validate the title as "nopCommerce demo store. Home page title"
 4, close the page
 */

public class firsttestcase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		String title= driver.getTitle();
		
		System.out.println(title);
		
		if (title.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}

		driver.quit();
	}

}
