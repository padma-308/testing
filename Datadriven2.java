package com.deloitte.selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.collect.Table.Cell;
//import com.sun.rowset.internal.Row;


public class Datadriven2 {

	public static void main(String[] args) throws  InterruptedException , IOException {
		try
		{
			FileInputStream fi = new FileInputStream("c:\\test\\test3.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sh = wb.getSheetAt(0);
			XSSFRow r = sh.getRow(0);
			Cell c = r.getCell(0);
			System.out.println(c);
			int rowcount=0;
			XSSFRow newRow = sh.createRow(rowcount+1);
			for(int j=0;j<r.getLastCellNum();j++){
				Cell cell = newRow.createCell(j);
				cell.setCellValue("new data");
			}
			fi.close();
			FileOutputStream outputStream = new FileOutputStream("c:\\test\\test3.xlsx");
			wb.write(outputStream);
			outputStream.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	}

