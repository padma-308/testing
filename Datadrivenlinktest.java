package com.deloitte.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.collect.Table.Cell;
//import com.sun.rowset.internal.Row;

public class Datadrivenlinktest {

	public static void main(String[] args) throws IOException {
		try
		{
			FileInputStream f1 = new FileInputStream("c:\\test\\test1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(f1);
			XSSFSheet sh = wb.getSheetAt(0);
			XSSFRow r = sh.getRow(0);
			Cell c = r.getCell(0);
			System.out.println(c);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Hyperlink");
 WebElement linktext = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/p[2]/a[1]"));
linktext.click();


	}

}


