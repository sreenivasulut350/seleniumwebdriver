package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writethedatainexcelfilebyuserinput {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\file3.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Data");
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many rows do you want?");
		int row= sc.nextInt();
		System.out.println("How Many cells do you want?");
		int cell= sc.nextInt();
		
		for(int r=0;r<=row;r++)
		{
			XSSFRow rw=sheet.createRow(r);
			for(int c=0;c<cell;c++)
			{
				XSSFCell ce= rw.createCell(c);
				//System.out.println("Please enter the cell values");
				ce.setCellValue(sc.next());
			}
		}
		workbook.write(file);
		System.out.println("File is created successfully");
		file.close();
		workbook.close();
	}

}
