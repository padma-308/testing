package com.deloitte.selenium;


import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class addtocart {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.pepperfry.com/kosmo-blaze-queen-bed-with-box-storage-by-spacewood-1704278.html?type=clip&pos=1:1&catname=Modern+Queen+Size+Beds&total_result=131&variation_id=200075");
//		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		   WebElement linktext = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[6]/div[1]/div[3]/a[2]"));
		   linktext.click();
		   
	 
	 
	 
	       }
	}



	 
	 
	 
	       


