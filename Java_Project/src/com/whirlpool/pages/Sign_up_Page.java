package com.whirlpool.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Sign_up_Page {
	
	final AppiumDriver driver;
	
	By sign_up_button=By.id("fragment_login_sign_up_button");	
	By first_name=By.id("form_member_first_name_edit_text");
	By last_name=By.id("form_member_last_name_edit_text");
	By email_addres=By.id("form_member_email_edit_text");
	By more_option=By.xpath("android.widget.ImageView[@content-desc='More options']");
	
	
	
	public Sign_up_Page(AppiumDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void sign_up(String Fname,String Lname) throws Exception
	{
		driver.findElement(sign_up_button).click();
		Thread.sleep(4000);
		driver.findElement(first_name).sendKeys(Fname);
		driver.findElement(last_name).sendKeys(Lname);
		Thread.sleep(3000);
		
		
		//driver.quit();
		
	
		
	
	}
	
	
	

}
