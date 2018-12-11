/**
 * 
 */
package com.whirlpool.pages;

import static org.testng.Assert.assertNotNull;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
public class Washer_Cycles_Objects extends Helper_V10K  {
	
	//final AppiumDriver driver;
	
	public Washer_Cycles_Objects(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



//	public void Washer_Cycles_Objects(AppiumDriver driver)
//	{
//		this.driver=driver;
//	}
	
	//Click on Appliance 
	By click_on_applince= By.id("com.whirlpool.android.wpapp:id/list_item_dashboard_appliance_icon_imageview");	
		
	
	//Washer Cycles option on Appliance dash board
	By Washer_Cycles= By.xpath("//android.widget.TextView[@text='Washer Cycles']");
	
	
	//What to Wash- Mixed
	By What_to_Wash= By.xpath("//android.widget.Button[@text='Mixed']");
	
	//What to Wash- Select White
	By Select_Waht_To_Wash_White_Cycle= By.xpath("//android.widget.TextView[@text='Whites']");
	
	// How to Wash- Normal
	By How_to_Wash= By.xpath("//android.widget.Button[@text='Normal']");
	
	
	//How to Wash- Select Quick
	By Select_How_To_Wash_Quick_Cycle=By.xpath("//android.widget.TextView[@text='Quick']");
	
	
	//Utility Tools
	By Select_Cycle= By.xpath("//android.widget.Button[@text='Select Cycle']");
	
	//Utility Tools- Select Rinse & Spin
	By Utility_Tools_Select_Rinse_Spin=By.xpath("//android.widget.TextView[@text='Rinse & Spin']");
	
	//Temperature
	By Temperature= By.xpath("//android.widget.TextView[@text='Temperature']");
	
	
	//Soil Level
	By Soil_Level= By.xpath("//android.widget.TextView[@text='Soil Level']");
	
	//Spin Speed
	By Spin_Spid= By.xpath("//android.widget.TextView[@text='Spin Speed']");
	
	//Switch Toggle Button
	By Switch=By.xpath("//android.widget.Switch");
	
	//Send Button
	By Send_Button=By.id("com.whirlpool.android.wpapp:id/send_button");	
	
	//Send to Appliance
	By Send_to_Appliance= By.xpath("//android.widget.TextView[@text='Send to Appliance']");
	
	//Cycle name
	By Cycle_Name= By.xpath("//android.widget.TextView[@text='Whites - Quick']");
	
	//Back button
    By Back_Button= By.className("android.widget.ImageButton");
    
    //Start button
    By Start_button=By.xpath("//android.widget.ToggleButton[contains(@resource-id,'com.whirlpool.android.wpapp:id/list_item_appliance_control_button_togglebutton') and @text='Start']");
    
    //Notification OK button
    By Notification_OK_Button= By.xpath("//android.widget.TextView[contains(@resource-id,'com.whirlpool.android.wpapp:id/buttonDefaultPositive') and @text='OK']");
                                   
	
	public void select_cycle() throws Exception 
	{
		driver.findElement(click_on_applince).click();
//		Thread.sleep(4000);
		forceWait(5000);
		waitForElement(driver.findElement(Washer_Cycles));
		driver.findElement(Washer_Cycles).click();
		driver.findElement(What_to_Wash).click();
		driver.findElement(Select_Waht_To_Wash_White_Cycle).click();
		driver.findElement(How_to_Wash).click();
		driver.findElement(Select_How_To_Wash_Quick_Cycle).click();	
		
		for(int i=0; i<=3;i++)
		{
			driver.findElement(Temperature).click();
		}
		
		for(int i=0;i<=2;i++)
		{
			driver.findElement(Soil_Level).click();
		}
		
		for(int i=0;i<=2;i++)
		{
			driver.findElement(Spin_Spid).click();
		}
		
		
		//For scroll in Machine cycles
		
		AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.RelativeLayout"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Send\"));"));
        assertNotNull(listGroup.getLocation());

        
        
      
        List<AndroidElement> switches=(List<AndroidElement>) driver.findElements(Switch);
        
        //For extra Rinse - list[0]
        switches.get(0);
        switches.get(0).click();
        Thread.sleep(3000);
        
        //For Presoak - List[1]
        switches.get(1);
        switches.get(1).click();
        Thread.sleep(3000);
        
        //For Steam- List[2]
        switches.get(2);
        switches.get(2).click();
        Thread.sleep(3000);
        
        //For Oxi- List[3]
        switches.get(3);
        switches.get(3).click();
        Thread.sleep(3000);
        
        
        //Click on Send button
        driver.findElement(Send_Button).click();
        Thread.sleep(2000);
        
        //Click on Send to Appliance 
        driver.findElement(Send_to_Appliance).click();
//      Thread.sleep(7000);
        forceWait(7000);
        
        //Find out Cycle name which we sent
        waitForElement(driver.findElement(Cycle_Name));
        System.out.println("Cycle name : "+driver.findElement(Cycle_Name).getText());
        System.out.println("Cycle Sent successfully....!!");
        
        
        //Click on Back button 
        driver.findElement(Back_Button).click();
//        Thread.sleep(5000);      
		forceWait(5000);
	}
	
	
	public void Send_and_Start_Cycle() throws Exception
	{
		driver.findElement(click_on_applince).click();
		//Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.findElement(Washer_Cycles).click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(Select_Cycle).click();
		Thread.sleep(2000);
		
		//Select Rinse & Spin
		driver.findElement(Utility_Tools_Select_Rinse_Spin).click();
		
		for(int i=0;i<=1;i++)
		{
			driver.findElement(Spin_Spid).click();
		}

		//Scroll to dis select extra Rinse
		AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.RelativeLayout"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Send\"));"));
        assertNotNull(listGroup.getLocation());

        
     
        List<AndroidElement> switches=(List<AndroidElement>) driver.findElements(Switch);
        
        //For extra Rinse - list[0]
        switches.get(0);
        switches.get(0).click();
        Thread.sleep(3000);

        driver.findElement(Send_Button).click();
        driver.findElement(Send_to_Appliance).click();
        //driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
        Thread.sleep(7000);
        //System.out.println("Sent Cycle Name : "+driver.findElement(Cycle_Name).getText());
        
        List<AndroidElement> Starting= driver.findElements(Start_button);
        Starting.get(0);
        Starting.get(0).click();
        
        Thread.sleep(6000);
        System.out.println("Cycle Started  : ");
        System.out.println("Wait for notfication : 180 Seconds");
        
        //Wait for push notification
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        //Thread.sleep(40000);
        
        
        if(driver.findElement(Notification_OK_Button).isDisplayed())
        {
        	Thread.sleep(5000);
        	System.out.println("Notification received");
        	driver.findElement(Notification_OK_Button).click();
        }
        else
        {
        	System.out.println(" Notification fail");
        }
        
        
        Thread.sleep(2000);
        driver.findElement(Back_Button).click();
        Thread.sleep(5000);
        
	}
	
	
	
	
}
