/**
 * 
 */
package com.whirlpool.pages;

import static org.testng.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.Helper.Helper_V10K;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author intel 123
 *
 */
public class Delete_Appliance_objects extends Helper_V10K 
{
	//final AndroidDriver driver;
	
	//Click on Appliance 
	By click_on_applince= By.id("com.whirlpool.android.wpapp:id/list_item_dashboard_appliance_icon_imageview");	

	
	//Delete Button
	By delete_Appliance= By.xpath("//android.widget.Button[contains(@resource-id,'fragment_edit_appliance_delete_appliance_button') and @text='Delete Appliance']");
		
	// Delete Appliance Warning OK button
	By Ok= By.xpath("//android.widget.TextView[contains(@resource-id,'buttonDefaultPositive') and @text='Okay']");
	
	
	
	
	
	public Delete_Appliance_objects(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void delete_appliance() throws Exception
	{
		waitForElement(driver.findElement(click_on_applince));
		
		driver.findElement(click_on_applince).click();
//		Thread.sleep(4000);
		forceWait(4000);
		
		AndroidElement list = (AndroidElement) driver.findElement(By.xpath("//android.widget.ListView[contains(@resource-id,'fragment_appliance_detail_listview')]"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Preferences\"));"));
            
        assertNotNull(listGroup.getLocation());
       
        //Click on Preferences
        listGroup.click();
        
//        Thread.sleep(3000);
        forceWait(3000);
        
        driver.findElement(delete_Appliance).click();
//        Thread.sleep(4000);
        forceWait(4000);
        driver.findElement(Ok).click();
        driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
        
        
        
	}
	
	
	
}
