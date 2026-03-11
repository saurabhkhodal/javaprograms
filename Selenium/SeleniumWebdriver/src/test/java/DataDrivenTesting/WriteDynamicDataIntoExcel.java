package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\DynamicData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows you want to have: ");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter how many cells you want to enter into the row: ");
		int noOfCells = sc.nextInt();
		
		for(int rows =0; rows<=noOfRows; rows++) {
			XSSFRow row = sheet.createRow(rows);
			for(int cells =0; cells<noOfCells; cells++) {
				XSSFCell cell = row.createCell(cells);
				cell.setCellValue(sc.next());
			}
		}
		System.out.println("The dynamic sheet has been created");
		workbook.write(file);
		workbook.close();
		file.close();
		
		

	}

}
