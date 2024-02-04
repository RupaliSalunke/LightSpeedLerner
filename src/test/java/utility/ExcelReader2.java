package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\excel\\TestData.xlsx";
		File src=new File(path);
		
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		String value = sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	
	
	}
}
