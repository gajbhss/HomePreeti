package com.guru99.mainMethod;

import org.testng.annotations.Test;

import com.guru99.objects.Guru99_Dashboard;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Main_Method_Run extends guru99_Repository
{
	
	@BeforeTest()
	public void beforeTest() throws Exception 
	{
		guru99_Repository.Login_Page();
		System.out.println("WebSite successfully launched...");		
	}
	
	@Test (priority=1)
	public static void login_with_Valid_Credentials() throws Exception 
	{
		guru99_Repository.login_with_valid();		
	}
	
	@Test(priority=2)
	public static void verify_title() throws Exception
	{
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
		Guru99_Dashboard.logout.click();
		guru99_Repository.alert_accept();
	}
	
	
	@Test(priority=3)
	public static void Login_with_Invalid_Username() throws Exception
	{
		guru99_Repository.invalid_username();	
	}
	
	

	@AfterTest
	public void afterTest() 
	{
		guru99_Repository.Close_window();
	}
	
	
}
