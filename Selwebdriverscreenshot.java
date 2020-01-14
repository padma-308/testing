package com.deloitte.selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.TakesScreenshot;
 
public class Selwebdriverscreenshot {

	private static String fileWithPath;

	public static void main(String[] args) throws InterruptedException,IOException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
				//DesiredCapabilities capabilities =DesiredCapabilities
				WebDriver driver= new ChromeDriver();
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File("C:/Selenium/Error.png"));
	}
}


