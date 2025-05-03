package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//im using apache poi library
public class Excelreading {

    @Test
    public void test() throws IOException {
        //locate the excel file
        FileInputStream fis=new FileInputStream(Propertyfilereading.getProperty("excelpath"));
        XSSFWorkbook workbook=new XSSFWorkbook(fis);//used to read xlsx files
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        //how to get row count
        int rowCount=sheet.getPhysicalNumberOfRows();
        //how to get colCount
        int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Row count is "+rowCount);
        System.out.println("Col count is "+colCount);

        //read the data
        String name=sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(name);

        //loop used to read the data
        for(int i=0; i<rowCount; i++){
            for(int j=0; j<colCount; j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
            }
            System.out.println();
        }
    }
}
//You are going to create this method as static method that is going to return string array
//
// whatever you are reading from Excel that need to be stored in that array