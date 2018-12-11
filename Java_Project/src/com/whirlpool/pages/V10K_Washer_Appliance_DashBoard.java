package com.whirlpool.pages;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Helper.Helper_V10K;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class V10K_Washer_Appliance_DashBoard extends Helper_V10K 
{
	//final AppiumDriver driver;
	
	public V10K_Washer_Appliance_DashBoard(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Click on Appliance 
	By click_on_applince= By.id("com.whirlpool.android.wpapp:id/list_item_dashboard_appliance_icon_imageview");	
	
	//Energy Tab
	By Energy_Tab= By.xpath("//android.widget.TextView[@text='Energy']");
	
	//Every Day, care
	By Every_Day_Care= By.xpath("//android.widget.TextView[@text='Every day, care®']");
	
	//Remote start enabled icon
    By Remote_start_enable_icon= By.id("com.whirlpool.android.wpapp:id/info_layout_images_remote_start_imageview");
	
    //Remote Contorl Start button
    By Remote_control_Start_button= By.id("com.whirlpool.android.wpapp:id/list_item_appliance_control_button_togglebutton");
    
    //Back button
    By Back_Button= By.className("android.widget.ImageButton");
    
    
	
    public void appliance_Remote_Enabled() throws Exception
	{
    	waitForElement(driver.findElement(click_on_applince));
    	
    	driver.findElement(click_on_applince).click();
    	forceWait(3000);
		if(driver.findElement(Remote_start_enable_icon).isDisplayed() || driver.findElement(Remote_control_Start_button).isEnabled() )
		{
			System.out.println("Remote Start Enabled : "+driver.findElement(Remote_start_enable_icon).isDisplayed());
			System.out.println("Remote Control Start Button Enabled :"+driver.findElement(Remote_control_Start_button).isEnabled());
		}
		else
		{
			System.out.println("Remote Start is not enabled... Please Enable the remote start.");
		}
	
	}
	
	
	
	public void Verify_v10k_washer_Dashboard() throws Exception
	{	
		AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'fragment_appliance_detail_listview')]"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Service & Support\"));"));
            
        assertNotNull(listGroup.getLocation());
        //listGroup.click();	
        driver.findElement(Back_Button).click();
        forceWait(5000);
        
	}
	
	
	
	
}
