package com.hospitality.amzn.GenericsUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtilities {
	
	public String getPropertyvalueforkey(String key) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mullasal\\Desktop\\Newworkspace\\MKT\\config.properties");
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

}
