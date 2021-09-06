package com.vtiger.genericLib;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.vtiger.elementrepository.LoginPage;

public class BaseClass {

			public WebDriver driver;
			public DataUtility du = new DataUtility();
			public static WebDriver monitorDriver;
			
			// Batch Execution && Parallel Execution && Group Execution
			@BeforeClass(alwaysRun = true)
			public void lanuchBrowser() {
					
					System.out.println("Chrome Browser");
					System.setProperty("webdriver.chrome.driver",
							"D:\\Browser Driver\\chromedriver.exe" );
					driver = new ChromeDriver();
					monitorDriver = driver;
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			// Cross Browser Execution && Enhancement Execution
//			@Parameters("browser")
//			@BeforeClass(alwaysRun = true)
//			public void lanuchBrowser(String browser) {
//			
//			if(browser.equals("chrome")) {
//				
//				System.out.println("Chrome Browser");
//				System.setProperty("webdriver.chrome.driver",
//						"D:\Browser Driver\chromedriver.exe" );
//				driver = new ChromeDriver();
//				}
//			else if(browser.equals("edge")) {
//				
//				System.out.println("Edge Browser");
//				System.setProperty("webdriver.edge.driver",
//						"D:\Browser Driver\msedgedriver.exe" );
//				driver = new EdgeDriver();
//				}
//			else if(browser.equals("opera")) {
//						
//				System.out.println("Opera Browser");
//				System.setProperty("webdriver.opera.driver",
//							"D:\Browser Driver\operadriver.exe" );
//				driver = new OperaDriver();
//					}
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			}
			
			@BeforeMethod(alwaysRun = true)
			public void login() throws IOException {

				System.out.println("Login into App");
				driver.get(du.getDataFromProperty("url"));
				
				LoginPage lp = new LoginPage(driver);
				
//				lp.getUsernameTb().sendKeys(du.getDataFromProperty("username"));
//				lp.getPasswordTb().sendKeys(du.getDataFromProperty("password"));
//				lp.getLoginBtn().click();
				
				lp.loginToApp(du.getDataFromProperty("username"),du.getDataFromProperty("password"));

			}
			
			@AfterMethod(alwaysRun = true)
			public void logout() {
				System.out.println("LogOut from App");
				WebElement signOutDD = driver.findElement(By.xpath
						("//span[text()=' Administrator']/../following-sibling::td[1]/img"));
				Actions act = new Actions(driver);
				act.moveToElement(signOutDD).perform();
				
				driver.findElement(By.linkText("Sign Out")).click();
			}
			
			@AfterClass(alwaysRun = true)
			public void closeBrowser() 
			{
				System.out.println("Close Browser");
				driver.quit();
			}
	}


