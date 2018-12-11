package com.guru99.mainMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.guru99.objects.guru99_LoginPage_Objects;

import junit.framework.Assert;

public class guru99_Repository extends Helper
{
	
	//for login valid user name & valid password
	public static void login_with_valid() throws Exception
	{
		try
		{
		Helper.Excel_input();
		guru99_LoginPage_Objects.submit_button.click();
		Thread.sleep(5000);	
		boolean b=driver.findElement(By.xpath("//a[@href='Logout.php' or text()='Log out']")).isDisplayed();
		System.out.println("Login successfull : "+b);	
		}	
		catch(Exception e)
		{
			System.out.println("Login unsuccsesfull....");
			e.printStackTrace();
			guru99_Repository.getscreenshot();
		}
	}
	
	//For Invalid username and Valid password
	public static void invalid_username() throws Exception
	{
		try {
		guru99_Repository.invalid_username_excel();
		Thread.sleep(5000);
		guru99_LoginPage_Objects.submit_button.click();
		Thread.sleep(5000);	
		boolean b=driver.findElement(By.xpath("//a[@href='Logout.php' or text()='Log out']")).isDisplayed();
		System.out.println("Login successfull : "+b);	
		}	
		catch(Exception e)
		{
			System.out.println("Login unsuccsesfull....");
			e.printStackTrace();
			guru99_Repository.getscreenshot();
		}
		
		finally
		{
		guru99_Repository.alert_accept();	
		Thread.sleep(4000);
		}
		
	}
		
	
}
