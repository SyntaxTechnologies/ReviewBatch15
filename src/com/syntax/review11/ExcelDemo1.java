package com.syntax.review11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo1 {
    public static void main(String[] args) {

        String path="Files/Book1.xlsx";

        try {
            FileInputStream fis=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
            Sheet sheet1=xssfWorkbook.getSheet("Sheet1");

            int noOfRows=sheet1.getPhysicalNumberOfRows();
           // var excelData=new ArrayList<Map<String,String>>();
            List<Map<String,String>> excelData=new ArrayList<>();
            Row row0=sheet1.getRow(0);
            for (int i = 1; i < noOfRows; i++) {
                LinkedHashMap<String, String> rowMap=new LinkedHashMap<>();
                Row row=sheet1.getRow(i);

                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j < noOfCells; j++) {
                    String key=row0.getCell(j).toString();
                    String values=row.getCell(j).toString();
                    rowMap.put(key,values);
                }
                excelData.add(rowMap);

            }

            System.out.println(excelData);
        } catch (Exception e) {
            System.out.println("Please check the path of the file");

        }
    }
}
