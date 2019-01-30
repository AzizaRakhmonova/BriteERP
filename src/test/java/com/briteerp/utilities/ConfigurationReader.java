package com.briteerp.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        //this is the path to the location of the file
        String path = "configuration";
        try {
            // java cannot read files directly, it needs inputStream to read files
            //inputStream takes the location of the file as a constructor
            FileInputStream fileInputStream = new FileInputStream(path);
            //Properties is used to read specifically
            properties = new Properties();
            //file contents are loaded to properties from the inputstream
            properties.load(fileInputStream);
            //all input streams must be closed
            fileInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //returns the value of specific property
    public static String getProperty(String property){ //make it static
        return properties.getProperty(property);
    }

}


