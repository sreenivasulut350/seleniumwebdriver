package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		String filepath=System.getProperty("user.dir")+"\\Testdata\\caldata.xlsx";
		int rows=Excelutils.getRowCount(filepath, "Sheet1");
		for(int i=1;i<=rows;i++)
		{
			//Read the data from excel
			String pri=Excelutils.getCellValue(filepath, "Sheet1", i,0);
			String rateofinterest = Excelutils.getCellValue(filepath, "Sheet1", i,1);
			String per1 = Excelutils.getCellValue(filepath, "Sheet1", i,2);
			String per2 = Excelutils.getCellValue(filepath, "Sheet1", i,3);
			String fre = Excelutils.getCellValue(filepath, "Sheet1", i,4);
			String maturity = Excelutils.getCellValue(filepath, "Sheet1", i,5);
			
			//pass above data into Application
		
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pri);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdropdown=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdropdown.selectByVisibleText(per2);
			
			Select fredropdown=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredropdown.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			// validation
			String act_maturity=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(act_maturity)==Double.parseDouble(maturity))
			{
				System.out.println("Test passed");
				Excelutils.SetCellValue(filepath,"Sheet1",i,7,"passed");
				Excelutils.setGreenColor(filepath, "Sheet1",i,7);
			}
			else
			{
				System.out.println("Test failed");
				Excelutils.SetCellValue(filepath,"Sheet1",i,7,"failed");
				Excelutils.setRedColor(filepath, "Sheet1",i,7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}	
		driver.quit();
	}

	
}
