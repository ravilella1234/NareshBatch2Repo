package excelOperations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:/Users/DELL/Desktop/testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell ;
		
		int cellindex = -1;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase("Password"))
			{
				cellindex = i;
			}
		}
		
		row = sheet.getRow(1);
		cell = row.getCell(cellindex);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wb.close();
		fis.close();
				
	}

}
