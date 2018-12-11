package com.whirlpool.V10KWasher;


import static org.testng.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.whirlpool.pages.Add_Appliance_Page;
import com.whirlpool.pages.Delete_Appliance_objects;
import com.whirlpool.pages.Favorites_object;

import com.whirlpool.pages.Log_Out_objects;
import com.whirlpool.pages.Login_Page;
import com.whirlpool.pages.Sign_up_Page;
import com.whirlpool.pages.V10K_Washer_Appliance_DashBoard;
import com.whirlpool.pages.Washer_Cycles_Objects;

//import Whirlpool_Home.Login_Page_Objects;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Whirlpool_V10K_Washer_Run {
	
	 public static AndroidDriver driver;
	//AppiumDriver driver;
	
	 @BeforeTest
	  public void Launch_Whirlpool_App() throws MalformedURLException 
	{
		 DesiredCapabilities capabilities = new DesiredCapabilities();				 
		 
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");	 
			capabilities.setCapability("deviceName", "Samsung Galaxy Note4");		 
			capabilities.setCapability("platformVersion", "6.0.1");		 
			capabilities.setCapability("platformName", "Android");	 
			capabilities.setCapability("appPackage", "com.whirlpool.android.wpapp");
			capabilities.setCapability("appActivity", "com.whirlpool.android.smartgrid.controller.home.LaunchActivity"); 
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   		

	}

	//Login 
	 
	@Test (priority=1, alwaysRun=true )
	public void LoginTOWhirlpool() throws Exception
	{
		Login_Page obj=new Login_Page(driver);
		obj.login("newprod@mailinator.com","Smart2000");
		System.out.println("Login Successfull ");
	}
	
	
	//Add an appliance
	
	@Test (priority=2, alwaysRun=true, dependsOnMethods={"LoginTOWhirlpool"})
	public void Add_Applince() throws Exception 
	{
		
		Add_Appliance_Page obj=new Add_Appliance_Page(driver);
		obj.Adding_an_appliance();
		System.out.println("Appliance Added Successfully ");
	}
	
	
	//Verify Remote start button enable or not
	
	@Test (priority=3, alwaysRun=true, dependsOnMethods={"Add_Applince"})
	public void Verify_Remote_Start_enabled() throws Exception
	{
		V10K_Washer_Appliance_DashBoard obj=new V10K_Washer_Appliance_DashBoard(driver);
		obj.appliance_Remote_Enabled();	
	}
	
	
	//Verifying V10K Washer Dash board screen
	
	@Test (priority=4, alwaysRun=true, dependsOnMethods={"Verify_Remote_Start_enabled"})
	public void Verify_Appliance_DashBoard() throws Exception
	{
		V10K_Washer_Appliance_DashBoard obj=new V10K_Washer_Appliance_DashBoard(driver);
		obj.Verify_v10k_washer_Dashboard();		
	}
	
	
	//Send Cycle
	@Test (priority=5, alwaysRun=true, dependsOnMethods={"Verify_Appliance_DashBoard"})
	public void Send_Cycle() throws Exception
	{
		Washer_Cycles_Objects obj=new Washer_Cycles_Objects(driver);
		obj.select_cycle();
		System.out.println("Cycle send Successfully ");
	}
	
	//Send & Start Rinse & Spin Cycle
	@Test (priority=6, alwaysRun=true, dependsOnMethods={"Send_Cycle"})
	public void Receive_Notification() throws Exception
	{
		Washer_Cycles_Objects obj=new Washer_Cycles_Objects(driver);
		obj.Send_and_Start_Cycle();
		System.out.println("Notification received Successfully ");
	}
	
	
	//Create Favorites Cycles
	@Test (priority=7, alwaysRun=true, dependsOnMethods={"Receive_Notification"})
	public void Create_Favorite_Cycle() throws Exception
	{
		Favorites_object obj=new Favorites_object(driver);
		obj.create_favorite();
		System.out.println("Favorites Created Successfully ");
	}
	
	//MOdify Created Favorites cycles
	@Test (priority=8, alwaysRun=true, dependsOnMethods={"Create_Favorite_Cycle"})
	public void Modify_Favorites()
	{
		Favorites_object obj=new Favorites_object(driver);
		obj.Modify_Created_favorites();
		System.out.println("Favorites Modified Successfully");
	} 
	
	
	//Create Favorites Cycles
	@Test (priority=9, alwaysRun=true, dependsOnMethods={"Modify_Favorites"})
	public void Delete_Favorite_Cycle() throws Exception
	{
		Favorites_object obj=new Favorites_object(driver);
		obj.Delete_Favorite();
		System.out.println("Created Favoriate Deleted Successfully");
	}
	
	//Delete Appliance
	@Test (priority=10, alwaysRun=true, dependsOnMethods={"Delete_Favorite_Cycle"})
	public void Delete_Appliance() throws Exception
	{
		Delete_Appliance_objects obj=new Delete_Appliance_objects(driver);
		obj.delete_appliance();
		System.out.println("Appliance Deleted Successfully");
	}
	
	
	//Log out
	@Test (priority=11, alwaysRun=true, dependsOnMethods={"Delete_Appliance"})
	public void Log_out_Account() throws Exception
	{
		Log_Out_objects obj=new Log_Out_objects(driver);
		obj.sign_out_account();
		System.out.println("Log Out Successfully");
	}
	
	
	@AfterTest
	public void close()
	{
		driver.closeApp();
	}

}
