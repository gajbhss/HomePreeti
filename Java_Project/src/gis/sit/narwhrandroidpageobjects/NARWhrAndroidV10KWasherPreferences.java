package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidV10KWasherPreferences {
	
	public NARWhrAndroidV10KWasherPreferences(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Button - Cancel
	@AndroidFindBy(id="view_edit_mode_action_bar_negative_text_view")
	public WebElement cancelButton;

	// Button - Save
	@AndroidFindBy(id="view_edit_mode_action_bar_positive_text_view")
	public WebElement saveButton;

	// Image - Appliance
	@AndroidFindBy(id="list_item_appliance_options_header_appliance_image_view")
	public WebElement applianceImage;

	// Text - SAID 
	@AndroidFindBy(id="list_item_appliance_options_header_appliance_said_text_view")
	public WebElement SAIDText;

	// Text - Appliance Name Title
	@AndroidFindBy(id="fragment_edit_appliance_appliance_name_textview")
	public WebElement applianceNameTitle;

	// Text - Appliance Name
	@AndroidFindBy(id="ev_appliance_name")
	public WebElement applianceName;

	// Text - Push Notification Preferences Title Text
	@AndroidFindBy(id="fragment_edit_appliance_notifications_textview")
	public WebElement pushNotificationPreferenceTitleText;

	// Text - System Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement systemAlertText;

	// Button - System Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement systemAlertButton;

	
	
	
	// Text - Clothes clean
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement clothesCleanText;

	// Button - Clothes Clean
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement clothesCleanButton;

	
	
	
	// Text - Oversuds Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement oversudsAlertText;

	// Button - Oversuds Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement oversudsAlertButton;

	
	
	
	// Text - Overloaded Washer Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement overloadedWasherAlertText;

	// Button - Overloaded Washer Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement overloadedWasherAlertButton;

	
	
	
	// Text - Unbalanced Load Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[5]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement unbalancedLoadAlertText;

	// Button - Unbalanced Load Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[5]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement unbalancedLoadAlertButton;

	
	
	
	// Text - Paired Appliances
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement pairedAppliancesText;

	// Button - Unbalanced Load Alert
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.Button[1]")
	public WebElement pairedAppliancesButton;
	
	
	
	
	// Text - Delete Appliance
	@AndroidFindBy(id="fragment_edit_appliance_delete_appliance_button")
	public WebElement deleteAppliance;

	
	/*
	 * 
	 * CONFIRMATION POP UP
	 * 
	 */
	
	// Text - Warning
	@AndroidFindBy(id="title")
	public WebElement popUpTitle;

	// Button - Cancel
	@AndroidFindBy(id="buttonDefaultNegative")
	public WebElement popUpCancel;

	// Text - Service & Support
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement popUpOk;
//
//	// Text - Product Manuals
//	@AndroidFindBy()
//	public WebElement registerApplianceTitleText;
//
//	// Text - Service & Support
//	@AndroidFindBy()
//	public WebElement registerApplianceTitleText;
//
//	// Text - Product Manuals
//	@AndroidFindBy()
//	public WebElement registerApplianceTitleText;
//
//	// Text - Service & Support
//	@AndroidFindBy()
//	public WebElement registerApplianceTitleText;
//
//	// Text - Product Manuals
//	@AndroidFindBy()
//	public WebElement registerApplianceTitleText;
//
//	// Text - Service & Support
//	@AndroidFindBy()
//	public WebElement registerApplianceTitleText;

}
