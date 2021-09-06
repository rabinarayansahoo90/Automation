package com.vtiger.testscripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

public class CreateNewContact extends BaseClass {




		
		@Test(groups = {"smoke","system"})
		public void newCreateContact() throws IOException {
				
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
			driver.findElement(By.name("lastname")).sendKeys(du.getDataFromExcel("Mobile", 2, 3),Keys.ENTER);
			System.out.println("Create New Contact");
		}
	}


