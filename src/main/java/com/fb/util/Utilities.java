package com.fb.util;

import org.testng.annotations.DataProvider;



public class Utilities {

	@DataProvider(name="info")
	public Object[][] readData() {
	Object[][] data=ExcelFileReader.readWorkBook("‪C:\\Users\\hp\\Documents\\DataTest.xlsx", "Sheet1");
	/*for(int i=1; i<data.length; i++) {
		for(int j=0; j<data[i].length; j++) {
			System.out.println(data[i][j]);
		}
	}*/
	return data;
	
	}
}