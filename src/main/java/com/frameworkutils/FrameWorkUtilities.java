package com.frameworkutils;

import com.enums.FileDetails;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FrameWorkUtilities {
    public String getConfigDetails(String key){
        String data=null;
        try {
            File f = new File(FileDetails.PROPERTIES_FILE.getValue());
            FileInputStream fis = new FileInputStream(f);
            Properties properties=new Properties();
            properties.load(fis);
            data=properties.getProperty(key);
            System.out.println(data);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return data;
    }
}
