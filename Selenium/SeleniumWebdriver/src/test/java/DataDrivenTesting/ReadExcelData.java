package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "\\TestData\\GE_TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("GE");
		// XSSFSheet sheet = workbook.getSheetAt(0);              //index of the sheet incase multiple sheets present in workbook
		
		int totalRows = sheet.getLastRowNum();
		System.out.println("Total Rows: " +totalRows);
		int totalCells = sheet.getRow(1).getLastCellNum();
		System.out.println("Total Columns: "+totalCells);
		
		for(int rows =0; rows<=totalRows; rows++) {
			XSSFRow readRows = sheet.getRow(rows);
			for(int cells =0; cells<totalCells; cells++) {
				XSSFCell readCells = readRows.getCell(cells);
				System.out.print(readCells.toString() + "\t");
			}
			System.out.println();
		}

	}

}
