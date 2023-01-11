package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
	public void excelData(int row,int cell,String sheet1) throws Throwable
	{
	DataFormatter de=new DataFormatter();
	FileInputStream stream=new FileInputStream("");
	Workbook book=WorkbookFactory.create(stream);
	Sheet sh=book.getSheet(sheet1);
	String c=de.formatCellValue(sh.getRow(row).getCell(cell));
	}
	public int totalrow(String sheet2) throws Throwable
	{
		FileInputStream str=new FileInputStream("");
		Workbook book1=WorkbookFactory.create(str);
		Sheet s=book1.getSheet(sheet2);
		int num=s.getLastRowNum();
		return num;
	}
	public int totalcell(String sheet3,int row) throws Throwable
	{
		FileInputStream str1=new FileInputStream("");
		Workbook book2=WorkbookFactory.create(str1);
		Sheet sh=book2.getSheet(sheet3);
		Row r=sh.getRow(row);
		int cellnum=r.getLastCellNum();
		return cellnum;
	}
}