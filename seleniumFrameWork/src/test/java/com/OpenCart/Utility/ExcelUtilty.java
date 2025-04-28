package com.OpenCart.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilty {
	/**
	 * this method is used to read data from excel by providing sheetname,row and cell
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception 
	 * @throws EncryptedDocumentException 
	 * @throws Exception
	 */
	Workbook wb;
	public String ToReadDataFromExcel(String sheetname,int row,int col) throws Exception{ 
		FileInputStream fis= new FileInputStream(".\\TestData\\TestData.xlsx");
	    wb = WorkbookFactory.create(fis);

		String data = wb.getSheet(sheetname).getRow(row).getCell(col).toString();
		return data;
	}
	
}
