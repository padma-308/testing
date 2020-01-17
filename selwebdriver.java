package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class selwebdriver {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   
		   
		   driver.get("https://www.pepperfry.com/?gclid=Cj0KCQiAjfvwBRCkARIsAIqSWlNr0YhjV3FKlAlcyLaVx3m3W_W0pxNwYk6fAyfqzLbAuzwoRofsDUQaAvylEALw_wcB");
    	
	       driver.findElement(By.id("search")).sendKeys("Recliners");
	
	}

}