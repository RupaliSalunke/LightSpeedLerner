package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static int getRowCount() throws IOException
	
	{
		String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";

		File src = new File(path);

		// to load the excel file

		FileInputStream fis = new FileInputStream(src);

		// accessing the workbook

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");
		int rowCOunt = sh1.getPhysicalNumberOfRows();
		System.out.println("Last no of row: "+sh1.getLastRowNum());
		System.out.println("Total no of rows: "+rowCOunt);
		
		short columnCount = sh1.getRow(1).getLastCellNum();
		System.out.println("Total no of column are: "+columnCount);
		for(int row=0; row<rowCOunt; row++)
		{
			for(int col=0; col<columnCount; col++)
			{
				DataFormatter df = new DataFormatter();

				String formatteddatavalue = df.formatCellValue(sh1.getRow(row).getCell(col));
//				System.out.println("read data from excel: "+formatteddatavalue);
		        System.out.println("Read data from Excel - Row: " + row + ", Column: " + col + ", Value: " + formatteddatavalue);

			}
		}
		
		return rowCOunt;
	}

	public static String readData(int row, int column) throws IOException
	{
		String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";

		File src = new File(path);

		// to load the excel file

		FileInputStream fis = new FileInputStream(src);

		// accessing the workbook

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

		//		String value = sh1.getRow(row).getCell(column).getStringCellValue();
		//		
		//		System.out.println(value);

		DataFormatter df = new DataFormatter();

		String formatteddatavalue = df.formatCellValue(sh1.getRow(row).getCell(column));
		System.out.println("read data from excel: "+formatteddatavalue);
		return formatteddatavalue;

	}

	public static void writeData() throws IOException {
		String path = System.getProperty("user.dir") + "\\excel\\TestData.xlsx";

		File src = new File(path);

		// to load the excel file

		FileInputStream fis = new FileInputStream(src);


		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

		File fout = new File(path);

		FileOutputStream fo = new FileOutputStream(fout);


		// for existing row and column

			sh1.getRow(8).getCell(1).setCellValue("write operation");

		// for existing row and non existing column

			sh1.getRow(0).createCell(5).setCellValue("fifth column data");

		// for non existing row and  existing column

//		sh1.createRow(18).createCell(1).setCellValue("Eighteen row");
//
//		sh1.getRow(3).createCell(10).setCellValue("10th cell");
//
//		sh1.createRow(12).createCell(2).setCellValue("12 row");

		wb.write(fo);


	}

	public static void main(String[] args) throws IOException {
//		readData(1, 0);
//		writeData();
		getRowCount();
		
	}
}
