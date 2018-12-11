/**
 * 
 */
package com.whirlpool.pages;

import static org.testng.Assert.assertNotNull;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import com.Helper.Helper_V10K;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

/**
 * @author intel 123
 *
 */
public class Login_Page extends Helper_V10K
{

	// final AppiumDriver driver;
		
	public Login_Page(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	
	//normal oops concepts

	//Enter email address for user name
	public By username= By.id("form_login_email_edittext");
	
	//Enter password for login 
	public By password= By.id("form_login_password_edittext");
	
	//Remember me check box
	public By remember_me= By.id("form_login_remember_me_checkbox");
	
	//Login button
	public By login_button= By.id("form_login_button");
	
		
	//User names
//		@AndroidFindBy (id="form_login_email_edittext")
//		public WebElement username;
//		
//	//Password
//	@AndroidFindBy (id="form_login_password_edittext")
//	public WebElement password;
//
//	//Remember me
//	@AndroidFindBy (id="form_login_remember_me_checkbox")
//	public WebElement Remember_Me;
//	
//	//Login button
//	@AndroidFindBy (id="form_login_button")
//	public WebElement login_button;
	
	
	
	public void login(String uname, String pass) throws Exception
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(remember_me).click();
		driver.findElement(login_button).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		forceWait(6000);	
		
		//Pull to refresh
		

		
	} 

	

}
