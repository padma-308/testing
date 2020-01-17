package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class checkbox {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.pepperfry.com/?gclid=Cj0KCQiAjfvwBRCkARIsAIqSWlNr0YhjV3FKlAlcyLaVx3m3W_W0pxNwYk6fAyfqzLbAuzwoRofsDUQaAvylEALw_wcB");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       WebElement Chkbox = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div[2]/div[2]/form/div[2]/div[4]/div/div/label"));
	       Chkbox.click();
	      
	       }
	}


