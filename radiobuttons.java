package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class radiobuttons {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.pepperfry.com/furniture-sale.html?order=updated_at&dir=desc&p=1&cat=3");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebElement radio = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[6]/div[3]/div/div[1]/div[1]/div[19]/ul/div/div[1]/li[1]/label"));
	       radio.click();
	      
	       }
	}


