package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProperties {

		public static void main(String[] args) throws IOException {
			
			FileInputStream fis = new FileInputStream("E:\\DataStorage\\File.properties");
			Properties pobj = new Properties();
			pobj.load(fis);
	
			String URL = pobj.getProperty("url");
			String Username = pobj.getProperty("username");
			String Password = pobj.getProperty("password");
			String Browser = pobj.getProperty("browser");
			
			System.out.println(URL);
			System.out.println(Username);
			System.out.println(Password);
			System.out.println(Browser);
			
			System.setProperty("webdriver.chrome.driver", "D:\\Browser Driver\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.name("user_name")).sendKeys(Username);
			driver.findElement(By.name("user_password")).sendKeys(Password);
			driver.findElement(By.id("submitButton")).click();
			driver.close();
			
	}
}

