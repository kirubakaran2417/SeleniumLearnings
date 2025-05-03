package org.example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfilereading {

  public static String getProperty(String key) throws IOException {
      FileInputStream fileInputStream = new FileInputStream("E:\\GIRI\\Workspaces\\Aravind sessions\\SeleniumLearnings\\src\\test\\resources\\config\\config.properties");
      Properties properties = new Properties();
      properties.load(fileInputStream);
      return properties.getProperty(key);
  }




}
