package com.fb.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyRead {
	public static Properties prop;
	
	public static String propertyreader(String chabi) {
		
		prop= new Properties();
		
	try {	
		FileInputStream fileInput= new FileInputStream(new File (".\\src\\main\\resources\\Property&TestDataStorage\\config.properties"));
		
		prop.load(fileInput);
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	String value=prop.getProperty(chabi).toString();
			return value;
	}
	

}
