package com.deloitte.selenium;


import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class popups {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.pepperfry.com/furniture-bedroom-furniture.html?type=hover-bedroom");
		   Thread.sleep(5000);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   WebElement linktext = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/div[1]/div/div/div/div[1]/ul/li[1]"));
		   linktext.click();
		   
	 
	       Alert alert = driver.switchTo().alert();
		   
	       System.out.println(alert.getText());
	 
	       alert.accept();
	       }
	}



	 
	 
	 
	       


