package com.vtiger.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		@FindBy(name="user_name")
		private WebElement usernameTb;
		
		@FindBy(name="user_password")
		private WebElement passwordTb;
		
		@FindBy(id="submitButton")
		private WebElement loginbtn;
		 
		@FindBy(xpath="//div[contains(text(),'You must specify a valid')]")
		private WebElement errormsg;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
//			usernameTb = driver.findElement(By.name("user_name"));
//			passwordTb = driver.findElement(By.name("user_password"));
//			loginbtn = driver.findElement(By.id("submitButton"));
//			errormsg = driver.findElement(By.xpath("//div[contains(text(),'You must specify a valid')]"));

		}
		
	 public WebElement getUsernameTb(){
		 return usernameTb;
	 }
	 public WebElement getPasswordTb(){
		 return passwordTb;
	 } 
	 public WebElement getLoginBtn(){
		 return loginbtn;
	 }
	// to Capture Hidden error msg when we try to Login without entering UN,PWD
	 public WebElement getErrormsg(){ 
		 return errormsg;
	 }
	public void loginToApp(String username, String password) {
		
		getUsernameTb().sendKeys(username);
		getPasswordTb().sendKeys(password);
		getLoginBtn().click();
	}
	
}

