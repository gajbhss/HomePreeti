package com.whirlpool.pages;

import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Helper.Helper_V10K;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Favorites_object extends Helper_V10K 
{
	//final AndroidDriver driver;
	
	public Favorites_object(AndroidDriver driver)
	{
		this.driver=driver;		
	}
	
	//Click on Appliance 
	By click_on_applince= By.id("com.whirlpool.android.wpapp:id/list_item_dashboard_appliance_icon_imageview");	
	
	//Washer Cycles option on Appliance dash board
	By Washer_Cycles= By.xpath("//android.widget.TextView[@text='Washer Cycles']");
	
	//Favorites Tab
	By Click_on_Favorites_Tab= By.xpath("//android.widget.TextView[contains(@resource-id,'psts_tab_title') and @text='Favorites']");
	
	//Click on Create Favorite
	By Click_on_Create_Favorite=By.xpath("//android.widget.Button[contains(@resource-id,'com.whirlpool.android.wpapp:id/create_fav_button') and @text='Create Favorite']");
	
	//Enter Favorite name
	By Enter_Favorite_name= By.xpath("//android.widget.EditText[contains(@resource-id,'com.whirlpool.android.wpapp:id/fragment_edit_appliance_appliance_name_edittext')]");
	
	//What to Wash- Mixed
	By What_to_Wash= By.xpath("//android.widget.Button[@text='Mixed']");
	
	//What to Wash- Modify- CLick on White text
	By What_To_Wash_Modify_Cycle_White= By.xpath("//android.widget.Button[contains(@resource-id,'list_item_cycle_settings_selected_button') and @text='Whites']");
	
	//What to Wash- Modify- CLick on White text to Delicates
	By What_TO_Wash_White_to_Delicates=By.xpath("//android.widget.TextView[contains(@resource-id,'com.whirlpool.android.wpapp:id/title') and @text='Delicates']");
	
	
	//How_TO_Wash_MOdify_Click on Normal Text
	By How_To_Wash_MOdify_Cycle_Normal= By.xpath("//android.widget.Button[contains(@resource-id,'com.whirlpool.android.wpapp:id/list_item_cycle_settings_selected_button') and @text='Normal']");
	
	
	//How_TO_Wash_Modify_clik on normal to Deep Water
	By How_To_wash_MOdify_Nomal_to_Deep_Water= By.xpath("//android.widget.TextView[contains(@resource-id,'com.whirlpool.android.wpapp:id/title') and @text='Deep Water']");
	
		
	//What to Wash- Select White
	By Select_Waht_To_Wash_White_Cycle= By.xpath("//android.widget.TextView[@text='Whites']");
		
	// How to Wash- Normal
	By How_to_Wash= By.xpath("//android.widget.Button[@text='Normal']");
		
		
	//How to Wash- Select Quick
	By Select_How_To_Wash_Quick_Cycle=By.xpath("//android.widget.TextView[@text='Quick']");
	
	//Temperature
	By Temperature= By.xpath("//android.widget.TextView[@text='Temperature']");
		
		
	//Soil Level
	By Soil_Level= By.xpath("//android.widget.TextView[@text='Soil Level']");
		
	//Spin Speed
	By Spin_Spid= By.xpath("//android.widget.TextView[@text='Spin Speed']");
		
	//Switch Toggle Button
	By Switch=By.xpath("//android.widget.Switch");

	//Save Button
	By Click_on_Save_Button=By.xpath("//android.widget.Button[contains(@resource-id,'save_button') and @text='Save']");
	
	//Back button
    By Back_Button= By.className("android.widget.ImageButton");
    
    
    //Created Favorite Cycle Name
    By created_Favorite_Cycle_name=By.xpath("//android.widget.TextView[contains(@resource-id,'list_item_cycle_result_name') and @text='Android_Test']");
    
    
    //Arrow sing
    By Arrow= By.id("list_item_cycle_result_info_button");
    
    //Delete Favorite
    By Click_On_Delete_Favorite=By.xpath("//android.widget.Button[contains(@resource-id,'com.whirlpool.android.wpapp:id/fragment_edit_appliance_delete_appliance_button') and @text='Delete Favorite']");
    
    //Delete button Confirm
    By Click_confirm_Delete= By.xpath("//android.widget.TextView[contains(@resource-id,'com.whirlpool.android.wpapp:id/buttonDefaultPositive') and @text='Delete']");
    
    //Blank Favorite
//    By no_Favorites= By.xpath("//android.widget.TextView[@text='You currently have no favorites saved.\r\n" + 
//    		"Click \"Create Favorite\" to begin.']");
    
    
    //Modify Favorites Save Button
    By Modify_Favorite_Save_button=By.xpath("//android.widget.TextView[contains(@resource-id,'com.whirlpool.android.wpapp:id/fragment_cycle_selection_save') and @text='Save']");
    
    //Modify_Cycle_Name
    By Modify_Cycle_Name=By.xpath("//android.widget.EditText[contains(@resource-id,'com.whirlpool.android.wpapp:id/list_item_cycle_settings_selected_text_field') and @text='Android_Test']");
    
    public void create_favorite() throws Exception 
    {
    	System.out.println("Driver po: "+driver);
    	waitForElement(driver.findElement(click_on_applince));
    	driver.findElement(click_on_applince).click();
//    	Thread.sleep(5000);
    	
    	forceWait(5000);
    	
    	driver.findElement(Washer_Cycles).click();
    	waitForElement(driver.findElement(Click_on_Favorites_Tab));
    	
    	driver.findElement(Click_on_Favorites_Tab).click();
//    	Thread.sleep(3000);
    	
    	driver.findElement(Click_on_Create_Favorite).click();
//    	Thread.sleep(2000);
    	forceWait(2000);
    	driver.findElement(Enter_Favorite_name).sendKeys("Android_Test");
    	driver.hideKeyboard();
    	driver.findElement(What_to_Wash).click();
    	driver.findElement(Select_Waht_To_Wash_White_Cycle).click();
    	driver.findElement(How_to_Wash).click();
    	driver.findElement(Select_How_To_Wash_Quick_Cycle).click();
    	
    	//Selecting temperature
    	for(int i=1;i<=3;i++)
    	{
    		driver.findElement(Temperature).click();
    	}
    	
    	//For scroll in Machine cycles
		
    			AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.RelativeLayout"));
    	        MobileElement listGroup = (MobileElement) list
    	                .findElement(MobileBy
    	                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
    	                                + "new UiSelector().text(\"Save\"));"));
    	        assertNotNull(listGroup.getLocation());

    	
    	//Selecting Soil Level
    	
    	for(int i=1;i<=2;i++)
    	{
    		driver.findElement(Soil_Level).click();
    	}

    	//Selecting Spin Speed
    	for(int i=1;i<=2;i++) {
    		driver.findElement(Spin_Spid).click();
    	}
    	
    	List<WebElement> switches=driver.findElements(Switch);
    	
    	//For extra Rinse - list[0]
        switches.get(0);
        switches.get(0).click();
//        Thread.sleep(3000);
        forceWait(3000);
        
        //For Presoak - List[1]
        switches.get(1);
        switches.get(1).click();
//        Thread.sleep(3000);
        forceWait(3000);
        
        //For Steam- List[2]
        switches.get(2);
        switches.get(2).click();
 //     Thread.sleep(3000);
        forceWait(3000);
        
        //For Oxi- List[3]
        switches.get(3);
        switches.get(3).click();
//        Thread.sleep(3000);
        forceWait(3000);
        
    	driver.findElement(Click_on_Save_Button).click();
    	
//    	Thread.sleep(6000);
    	forceWait(6000);
    	
    	waitForElement(driver.findElement(created_Favorite_Cycle_name));
    	System.out.println("Favorite created Successfully."+driver.findElement(created_Favorite_Cycle_name).getText());
    	
    	driver.findElement(Back_Button).click();
//    	Thread.sleep(3000);
    	forceWait(3000);
    	
    	
    	driver.findElement(Back_Button).click();
    	
    	forceWait(3000);
    	
    	System.out.println("Create Favorites pass successfully");  	
    	
    }
    
    public void Modify_Created_favorites()
    {
    	waitForElement(driver.findElement(click_on_applince));
    	driver.findElement(click_on_applince).click();
//    	Thread.sleep(5000);
    	forceWait(5000);
    	
    	driver.findElement(Washer_Cycles).click();
//    	Thread.sleep(3000);
    	forceWait(3000);
    	
    	waitForElement(driver.findElement(Click_on_Favorites_Tab));
    	driver.findElement(Click_on_Favorites_Tab).click();
    	
    	forceWait(3000);
    	
    	System.out.println("Clicking on Created Favorites");
    	
    	List<AndroidElement> Arrows=driver.findElements(Arrow);
    	Arrows.get(0);
    	Arrows.get(0).click();
    	
    	waitForElement(driver.findElement(Modify_Cycle_Name));
    	//driver.findElement(Modify_Cycle_Name).clear();
    	driver.findElement(Modify_Cycle_Name).sendKeys("Favorites_Modify");
    	driver.hideKeyboard();
    	forceWait(2000);
    	
    	driver.findElement(What_To_Wash_Modify_Cycle_White).click();
    	driver.findElement(What_TO_Wash_White_to_Delicates).click();
    	forceWait(2000);
    	
    	driver.findElement(How_To_Wash_MOdify_Cycle_Normal).click();
    	driver.findElement(How_To_wash_MOdify_Nomal_to_Deep_Water).click();
    	
    	
    	//Selecting temperature
    	for(int i=1;i<=3;i++)
    	{
    		driver.findElement(Temperature).click();
    	}
    	
    	//For scroll in Machine cycles
		
    			AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.RelativeLayout"));
    	        MobileElement listGroup = list
    	                .findElement(MobileBy
    	                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
    	                                + "new UiSelector().text(\"Delete Favorite\"));"));
    	        assertNotNull(listGroup.getLocation());

    	
    	//Selecting Soil Level
    	
    	for(int i=1;i<=2;i++)
    	{
    		driver.findElement(Soil_Level).click();
    	}

    	//Selecting Spin Speed
    	for(int i=1;i<=2;i++) {
    		driver.findElement(Spin_Spid).click();
    	}
    	
    	List<AndroidElement> switches=driver.findElements(Switch);
    	
    	//For extra Rinse - list[0]
        switches.get(0);
        switches.get(0).click();
//        Thread.sleep(3000);
        forceWait(3000);
        
        //For Presoak - List[1]
        switches.get(1);
        switches.get(1).click();
//        Thread.sleep(3000);
        forceWait(3000);
        
        //For Steam- List[2]
        switches.get(2);
        switches.get(2).click();
 //     Thread.sleep(3000);
        forceWait(3000);
        
        //For Oxi- List[3]
        switches.get(3);
        switches.get(3).click();
//        Thread.sleep(3000);
        forceWait(3000);
        
        driver.findElement(Modify_Favorite_Save_button).click();
        
        forceWait(6000);
        
        
    	System.out.println("Favorite MOdified Successfully.");
    	
    	driver.findElement(Back_Button).click();
//    	Thread.sleep(3000);
    	forceWait(3000);
    	
    	
    	driver.findElement(Back_Button).click();
    	
    	forceWait(3000);
    	
    	

    }
    
    
    public void Delete_Favorite() throws Exception
    {
    	waitForElement(driver.findElement(click_on_applince));
    	driver.findElement(click_on_applince).click();
//    	Thread.sleep(5000);
    	forceWait(5000);
    	
    	driver.findElement(Washer_Cycles).click();
//    	Thread.sleep(3000);
    	forceWait(3000);
    	
    	waitForElement(driver.findElement(Click_on_Favorites_Tab));
    	driver.findElement(Click_on_Favorites_Tab).click();
    	
    	forceWait(3000);
    	
    	System.out.println("Clicking on Created Favorites");
    	
    	List<AndroidElement> Arrows=driver.findElements(Arrow);
    	Arrows.get(0);
    	Arrows.get(0).click();
    	
    	Thread.sleep(4000);
    	
    	driver.hideKeyboard();
    	
    	//For scroll in Machine cycles
		
		AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.RelativeLayout"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Delete Favorite\"));"));
        assertNotNull(listGroup.getLocation());
        
//        Thread.sleep(3000);
        	forceWait(3000);
        
        driver.findElement(Click_On_Delete_Favorite).click();    	
        Thread.sleep(2000);
        driver.findElement(Click_confirm_Delete).click();
        
//        Thread.sleep(5000);
        forceWait(5000);
        
//    	if(driver.findElement(no_Favorites).isDisplayed())
//    	{
//    		System.out.println("Favorites deleted Successfully");
//    		System.out.println("Delete Favoires Passed ");
//    	}
//    	else
//    	{
//    		System.out.println("Delete Favories Failed");
//    	}
    	
    	
    	driver.findElement(Back_Button).click();
 //   	Thread.sleep(3000);
    	forceWait(4000);
    	
    	driver.findElement(Back_Button).click();
 //   	Thread.sleep(3000);
    	
    	forceWait(4000);
    	
    	
    	
    }
	
	
	
	
	
}
