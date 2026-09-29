package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stacticwebtable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		//To find number of rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of Rows:" +rows);
		//driver.close();
		
		//To find the clomuns
		int column= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of Columns:" + column);
		
		//To print the table
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2;r<=rows;r++ )
		{
			for(int c=1;c<=column;c++)
			{
				String cell=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(cell+ "\t");
			}
			System.out.println();
		}*/
		
		//To get bookname details which are wrtittn by Mukesh
		
		/*for(int r=2;r<=rows;r++)
		{
			String cell=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if (cell.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookname+"\t"+"Mukesh");
			}
		}*/
		
		//Total price calculation
		int Total=0;
		for(int r=2;r<=rows;r++)
		{ 
			String cell=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			Total=Total+Integer.parseInt(cell);
		}
		
		System.out.println(Total);
	}

}
