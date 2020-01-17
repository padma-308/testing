package com.deloitte.selenium;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.pepperfry.com/bed-bath-pillows.html?type=homepage_banner4");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Select drpsort = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[5]/div[2]/div/div[2]/div/div[2]/div/div[2]/ul/li")));
	       drpsort.selectByVisibleText("NEWEST");
	       }
	}


