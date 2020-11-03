package com.crmautomation.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader1 {
	public Properties getProperty() throws IOException
	{
		FileInputStream inputStream=new FileInputStream("D:\\CRM_BDD_TestNG\\src\\test\\resources\\resources\\browser-config.properties");
        Properties properties = new Properties();
        try {        	 
            properties.load(inputStream);
           
        } catch (Exception e) {
            System.out.println("Exception: " + e);
       } 
         return properties;	
	}


}
