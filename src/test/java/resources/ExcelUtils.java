package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public ExcelUtils(String excelPath, String sheetName) throws IOException {
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);
	}
	
	
	private static XSSFWorkbook workbook = null;
	public static String path = System.getProperty("user.dir") + "testData\\TestData.xlsx";
	private static XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	
	public void getRowCount() throws IOException {
	
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows: "+ rowCount);
	}
	
	
	public void getCellData(int rowNum, int colNum) throws IOException {
			
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
	}
	
	

}
