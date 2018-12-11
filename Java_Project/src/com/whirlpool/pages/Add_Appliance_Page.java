/**
 * 
 */
package com.whirlpool.pages;

import org.openqa.selenium.By;

import com.Helper.Helper_V10K;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * @author intel 123
 *
 */
public class Add_Appliance_Page extends Helper_V10K
{
	//final AndroidDriver driver;
	
	public Add_Appliance_Page(AndroidDriver driver)
	{
		this.driver=driver;
	}

		//Setting more option button
		By more_option=By.className("android.widget.ImageView");
		
		//Click on Setting 
		By setting=By.id("com.whirlpool.android.wpapp:id/title");
		
		//Click on Add appliance 
		By add_appliance=By.xpath("//android.widget.TextView[@text='Add Appliance']");

		//CLick on Manually Enter Code
		By Manuall_Enter_Code= By.id("com.whirlpool.android.wpapp:id/provisioning_scan_text3");
		
		
		//Enter SAID
		By Enter_SAID =By.id("com.whirlpool.android.wpapp:id/enter_manual_said_text");
		
		
		//Enter MAC ID
		By Enter_MAC_ID= By.id("com.whirlpool.android.wpapp:id/enter_manual_mac_text");
		
		//Click on Next button
		By Next_Button =By.id("com.whirlpool.android.wpapp:id/provisioning_scan_next_button");
		
		//Register Appliance Save appliance name
		By Appliance_Name= By.id("com.whirlpool.android.wpapp:id/ev_appliance_name");

		//Finish Button
		By Finish_Button= By.xpath("//android.widget.Button[@text='Finish']");
		
		//Auto Reorder Skip button
		By Skip=By.xpath("//android.widget.TextView[@text='Skip']");
		
		//Setup Complete OK button
		By ok_button= By.id("com.whirlpool.android.wpapp:id/adrs_congrats_ok");
		
		public void Adding_an_appliance() throws Exception
		{
			
			driver.findElement(more_option).click();		
			driver.findElement(setting).click();
			driver.findElement(add_appliance).click();
			Thread.sleep(3000);
			driver.findElement(Manuall_Enter_Code).click();
			driver.findElement(Enter_SAID).sendKeys("33338VPR49");	
			Thread.sleep(3000);
			//driver.getKeyboard().pressKey(67);
			driver.hideKeyboard();
			driver.findElement(Enter_MAC_ID).sendKeys("FF:FF:FF:FF:FF:FF");
			driver.hideKeyboard();
			driver.findElement(Next_Button).click();
//			Thread.sleep(6000);
			forceWait(6000);
			driver.findElement(Appliance_Name).clear();
			driver.findElement(Appliance_Name).sendKeys("V10K Washer");
			driver.findElement(Finish_Button).click();
//			Thread.sleep(5000);
			forceWait(6000);
			driver.findElement(Skip).click();
			driver.findElement(ok_button).click();
//			Thread.sleep(6000);
			forceWait(6000);
			
			System.out.println("Appliance Added successfullyyy.....!!!");

		}

}
