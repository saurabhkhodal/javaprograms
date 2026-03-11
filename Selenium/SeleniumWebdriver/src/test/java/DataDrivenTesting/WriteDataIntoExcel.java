package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\writeExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook ();
	    XSSFSheet sheet =	workbook.createSheet("Data");
	
	XSSFRow row1 = sheet.createRow(0);
    row1.createCell(0).setCellValue("Product Name");
    row1.createCell(1).setCellValue("Batch Number");
    row1.createCell(2).setCellValue("Quantity");
    
    XSSFRow row2 = sheet.createRow(1);
    row2.createCell(0).setCellValue("DOLO 650MG 1X10 TAB");
    row2.createCell(1).setCellValue("DOBS3184");
    row2.createCell(2).setCellValue("20");
    
    XSSFRow row3 = sheet.createRow(2);
    row3.createCell(0).setCellValue("PARACIP 650MG 1X15 TAB");
    row3.createCell(1).setCellValue("CX7465");
    row3.createCell(2).setCellValue("35");
    
    workbook.write(file);
    System.out.println("The file has been created");
    workbook.close();
    file.close();
	}

}
