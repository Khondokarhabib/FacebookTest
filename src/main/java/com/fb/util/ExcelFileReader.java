package com.fb.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {
	
	public static Object[][]value=null;
	
	public static Object[][] readWorkBook(String filePath, String sheetName) {
		DataFormatter format= new DataFormatter();
		try {
			FileInputStream file= new FileInputStream(new File(filePath));
			XSSFWorkbook book=new XSSFWorkbook(file);
			XSSFSheet sheet=book.getSheet(sheetName);
			int rowSize=sheet.getPhysicalNumberOfRows();
			int colSize =sheet.getRow(0).getLastCellNum();
			
			value = new Object[rowSize][colSize];
			
			Iterator <Row> rowIterator= sheet.rowIterator();
			int rowNum=0;
			while(rowIterator.hasNext()){
				Row row=rowIterator.next();
				Iterator<Cell> cellIterator= row.cellIterator();
				int colNum=0;
				while(cellIterator.hasNext()) {
				Cell cell=cellIterator.next();
				 format.formatCellValue(cell).trim();
				 colNum++;}
				
				
				rowNum++;	}
			
			}catch(Exception e) 
			{System.out.println(e.getMessage());}
		
		
		return value;
	}
	
	

}
