package com.whirlpool.V10KWasher;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.Helper.Helper_V10K;
import com.whirlpool.pages.Add_Appliance_Page;
import com.whirlpool.pages.Delete_Appliance_objects;
import com.whirlpool.pages.Favorites_object;
import com.whirlpool.pages.Log_Out_objects;
import com.whirlpool.pages.Login_Page;
import com.whirlpool.pages.Sign_up_Page;
import com.whirlpool.pages.V10K_Washer_Appliance_DashBoard;
import com.whirlpool.pages.Washer_Cycles_Objects;

import io.appium.java_client.android.AndroidDriver;

public class Repository_V10K extends Helper_V10K
{
	public Repository_V10K(AndroidDriver driver)
	{
		this.driver=driver;
	}
	

	//Declearing objects
	public Add_Appliance_Page add_Appliance_Page; 
	public Delete_Appliance_objects delete_Appliance_objects;
	public Favorites_object favorites_object;
	public Log_Out_objects log_Out_objects;
	public Login_Page login_Page;
	public Sign_up_Page sign_up_Page;
	public V10K_Washer_Appliance_DashBoard v10K_Washer_Appliance_DashBoard;
	public Washer_Cycles_Objects washer_Cycles_Objects;
	
	
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
			
			System.out.println("App Launch Successfully....");

	
	
	add_Appliance_Page= new Add_Appliance_Page(driver);
	delete_Appliance_objects= new Delete_Appliance_objects(driver);
	favorites_object =new Favorites_object(driver);
	log_Out_objects= new Log_Out_objects(driver);
	login_Page= new Login_Page(driver);
	sign_up_Page= new Sign_up_Page(driver);
	v10K_Washer_Appliance_DashBoard= new V10K_Washer_Appliance_DashBoard(driver);
	washer_Cycles_Objects= new Washer_Cycles_Objects(driver);
	
	
	}
	
	public void login(String uname, String pass) throws Exception
	{
		
				
//		driver.findElement(username).sendKeys(uname);
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(remember_me).click();
//		driver.findElement(login_button).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
	//	forceWait(6000);	
		
		//Pull to refresh
		
		
		
	} 

	
	

	
	
	
	
}
