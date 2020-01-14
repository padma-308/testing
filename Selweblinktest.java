package com.deloitte.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selweblinktest {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Hyperlink");
 WebElement linktext = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div/p[2]/a[1]"));
linktext.click();

 }
	}

