package com.OpenCart.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProperetiesUtility {

	Properties pro;
   	public String ToReadDataProperties(String key) throws IOException {
		FileInputStream fis= new FileInputStream(".\\Confoguration\\Cong.perpereties");
		 pro= new Properties();
		pro.load(fis);
		String getData = pro.getProperty(key);
		return getData;
	}
}
