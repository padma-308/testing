package com.deloitte.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	
	public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
	   WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pepperfry.com/?gclid=Cj0KCQiAjfvwBRCkARIsAIqSWlNr0YhjV3FKlAlcyLaVx3m3W_W0pxNwYk6fAyfqzLbAuzwoRofsDUQaAvylEALw_wcB");
		  driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //  WebElement Email = driver.findElement(By.cssSelector("#identifierId"));
	     //  Email.sendKeys("samplemail@gmail.com");
	      // Email.click();
		
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("C:/Selenium/Error.png"));
	   
	  
	}
}