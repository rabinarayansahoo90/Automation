package com.vtiger.testscripts;
import java.io.IOException;
import com.vtiger.genericLib.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
	public class CreateNewLeads extends BaseClass {


	  // cpature Screen shot code
			
			@Test
			public void newCreateLead() throws IOException {
					
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();
				driver.findElement(By.name("lastname")).sendKeys(du.getDataFromExcel("Mobile", 2, 3));
				driver.findElement(By.name("company")).sendKeys(du.getDataFromExcel("Mobile", 2, 4),Keys.ENTER);
				System.out.println("Created New Lead");
			}
		}


