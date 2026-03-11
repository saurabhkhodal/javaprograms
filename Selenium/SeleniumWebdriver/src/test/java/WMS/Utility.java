package WMS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utility {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	

	public static int getRowCount(String excelFile, String excelSheet) throws IOException {
		
		fi = new FileInputStream (excelFile);
		wb = new XSSFWorkbook (fi);
		sheet = wb.getSheet(excelSheet);
		int rowCount = sheet.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;
	}
	
	public static int cellCount(String excelFile, String excelSheet, int rowNum) throws IOException {
		fi = new FileInputStream(excelFile);
		wb = new XSSFWorkbook (fi);
		sheet = wb.getSheet(excelSheet);
		row = sheet.getRow(rowNum);
		int CellCount = row.getLastCellNum();
		wb.close();
		fi.close();
		return CellCount;
	}
	
	public static String getCellData (String excelFile,String excelSheet, int rowNum, int cellNum) throws IOException {
		fi= new FileInputStream (excelFile);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(excelSheet);
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);
		
		String data = cell.toString();
		wb.close();
		fi.close();

		return data;
	}
}
