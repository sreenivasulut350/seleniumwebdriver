package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file-->workbook-->sheet-->row-->cell
public class readthedatafromexcel {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\file1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalrow= sheet.getLastRowNum();
		
		int totalcells= sheet.getRow(0).getLastCellNum();
		System.out.println("Total Rows:"+totalrow);
		System.out.println("Total cells for row:"+totalcells);
		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow row= sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell=row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		file.close();
		workbook.close();

	}

}
