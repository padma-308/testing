package com.deloitte.selenium;


import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	
	 public static String fileWithPath;
	 
	public static void main(String[] args) throws InterruptedException , IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	//	   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	//	   capabilities.setCapability("marionette",true);
		   WebDriver driver = new ChromeDriver();


		    driver.manage().window().maximize();

		    System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");

		    driver.get("https://www.pepperfry.com/?gclid=EAIaIQobChMI5JHL3uWH5wIVWD5gCh0OkgLsEAAYASAAEgI46PD_BwE");

		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		    WebElement email_phone = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[2]/form/div[2]/div[1]/div/input"));

		    email_phone.sendKeys("your_email_phone");

		    driver.findElement(By.id("identifierNext")).click();

		    WebElement password = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[2]/form/div[2]/div[2]/div/input"));

		    WebDriverWait wait = new WebDriverWait(driver, 20);

		    wait.until(ExpectedConditions.elementToBeClickable(password));

		    password.sendKeys("your_password");

		    driver.findElement(By.id("passwordNext")).click();
	 
	 
	 
	       }
	}



	 
	 
	 
	       


