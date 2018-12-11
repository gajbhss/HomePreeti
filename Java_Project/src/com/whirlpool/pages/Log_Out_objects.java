package com.whirlpool.pages;

import org.openqa.selenium.By;

import com.Helper.Helper_V10K;

import io.appium.java_client.android.AndroidDriver;

public class Log_Out_objects extends Helper_V10K{

	//final AndroidDriver driver;
	
	//Setting more option button
	public By more_option=By.className("android.widget.ImageView");
			
	//Click on Setting 
	public By setting=By.id("com.whirlpool.android.wpapp:id/title");

	//Log Out
	public By Click_on_Log_Out=By.xpath("//android.widget.TextView[contains(@resource-id,'com.whirlpool.android.wpapp:id/list_item_settings_title') and @text='Log Out']");
	
	//Log in button
	public By login_button= By.id("form_login_button");
	
	public Log_Out_objects(AndroidDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	public void sign_out_account()
	{
		driver.findElement(more_option).click();
		forceWait(2000);
		driver.findElement(setting).click();
		forceWait(2000);
		driver.findElement(Click_on_Log_Out).click();
		
		if(driver.findElement(login_button).isDisplayed())
		{
			System.out.println("Log out successfully");
			System.out.println("Log out test case pass successfully");
		}
		
		else
		{
			System.out.println("NOt able to log out");
		}
	}
	
	
	
	
}
