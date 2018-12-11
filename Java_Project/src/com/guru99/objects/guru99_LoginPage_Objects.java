package com.guru99.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99_LoginPage_Objects 
{
	WebDriver driver;
	
	public guru99_LoginPage_Objects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	// for WebSite Testing Tool Link
	@FindBy(xpath="//a[text()='Website Testing Tools']")
	public static WebElement Website_Testing_Tools;
	
	
	//For Free Online Banking Link
	@FindBy(xpath="//a[text()='Free Online Banking']")
	public static WebElement Free_Online_Banking;
	
		
	//For Internet Banking Updates link
	@FindBy(xpath="//a[text()=\"Internet Banking Updates\"]")
	public static WebElement Internet_Banking_Updates;
	
	
	//For Linux Cloud Hosting link
	@FindBy(xpath="//a[text()=\"Linux Cloud Hosting\"]")
	public static WebElement Linux_Cloud_Hosting;
	
	
	@FindBy(xpath="//a[text()='Amazon Cloud Computing']")
	public static WebElement Amazon_Cloud_Computing;
	
	@FindBy(xpath="Data Analytics Training")
	public static WebElement Data_Analyatics_Training;
		

	//For username
	@FindBy(name="uid")
	public static WebElement username; 
	
	//For Password
	@FindBy(name="password")
	public static WebElement password;
	
	//Login button
	@FindBy(name="btnLogin")
	public static WebElement submit_button;
	
	
	
	
}
