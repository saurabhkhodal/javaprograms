package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle cs;
	
	public static int getRowCount(String excelFile, String excelSheet) throws IOException {
		fi = new FileInputStream(excelFile);
		wb = new XSSFWorkbook (fi);
		ws = wb.getSheet(excelSheet);
		int rowCount = ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowCount;
	}
	
	public static int getCellCount (String excelFile, String excelSheet, int rowNum) throws IOException {
		fi = new FileInputStream (excelFile);
		wb = new XSSFWorkbook (fi);
		ws = wb.getSheet(excelSheet);
		row = ws.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fi.close();

		return cellCount;
	}
	
	public static String getCellData(String excelFile, String excelSheet, int rowNum, int colNum) throws IOException {
		fi = new FileInputStream(excelFile);
		wb = new XSSFWorkbook (fi);
		ws = wb.getSheet(excelSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);
		
		String data;
		try {
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);        //returns a formatted value of the cell as a string format. we can also use cell.toString(); method
		}
		catch (Exception e) {
			data = "";
		}
		wb.close();
		fi.close();
		return data;
	}

	public static void setCellData(String excelFile,String excelSheet, int rowNum, int colNum, String data)throws IOException{
		fi = new FileInputStream(excelFile);
		wb = new XSSFWorkbook (fi);
		ws = wb.getSheet(excelSheet);
		row = ws.getRow(rowNum);
		
		cell = row.createCell(colNum);
		cell.setCellValue(data);
		
		fo = new FileOutputStream(excelFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();

	}
	
	public static void fillGreenColor(String excelFile, String excelSheet, int rowNum, int colNum) throws IOException{
		fi = new FileInputStream(excelFile);
		wb = new XSSFWorkbook (fi);
		ws = wb.getSheet(excelSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);
		
		cs =wb.createCellStyle();
		cs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(cs);
		fo = new FileOutputStream(excelFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
	public static void fillRedColor(String excelFile, String excelSheet, int rowNum, int colNum) throws IOException{
		fi = new FileInputStream(excelFile);
		wb = new XSSFWorkbook (fi);
		ws = wb.getSheet(excelSheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);
		
		cs =wb.createCellStyle();
		cs.setFillForegroundColor(IndexedColors.RED.getIndex());
		cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(cs);
		fo = new FileOutputStream(excelFile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}

}
