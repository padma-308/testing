package com.deloitte.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selwebdriver {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi");
		
 WebElement chkbox = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/div/section[3]/div[1]/label/div[1]"));
chkbox.click();
 }
	}
