package com.whirlpool.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class Alert_Code 
{
	AppiumDriver driver;
	
	public Alert_Code(AppiumDriver driver)
	{
		this.driver=driver;		
	}
	
	
	By not_now_button= By.xpath("//android.widget.TextView[@text='Not now']");
	
	
	
	public void handle_alert(AppiumDriver driver) 
	{
		try 
		{		
			driver.findElement(not_now_button).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}
		catch(Exception E)
		{
			System.out.println("No Aleart....!!");
		}
	}
}
