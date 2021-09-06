package com.vtiger.testscripts;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
 

public class CreateNewProduct extends BaseClass {
	
			@Test(groups={"smoke"})
			public void newCreateProduct() throws IOException {
					
				driver.findElement(By.linkText("Products")).click();
				driver.findElement(By.cssSelector("img[title='Create Product...']")).click();
				driver.findElement(By.name("productname")).sendKeys(du.getDataFromExcel("Mobile", 1, 2),Keys.ENTER);
				System.out.println("Create New Product");
		}
	}



