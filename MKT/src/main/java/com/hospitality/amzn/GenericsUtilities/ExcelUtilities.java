package com.hospitality.amzn.GenericsUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/*
 * 
 * @saleem
 * 
 */

public class ExcelUtilities implements PConstants {
	
	//getting data from excel
	public static String getTheData(String sheet, int row, int coloum) throws Throwable {
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
		return value;
		}

	//getting total row count
	public static int getrowCount(String sheet) throws Throwable {
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook wb = WorkbookFactory.create(fis);
		int row = wb.getSheet(sheet).getLastRowNum();
		return row;
		}
	
	//Setting value to excel
	public static void setCellData(String sheet, int row, int columnnum, String data) throws Throwable {
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(columnnum).setCellValue(data);
		FileOutputStream fout=new FileOutputStream(Excel_path);
		wb.write(fout);
		}
	


}
