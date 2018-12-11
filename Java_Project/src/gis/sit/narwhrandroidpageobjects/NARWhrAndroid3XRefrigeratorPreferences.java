package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroid3XRefrigeratorPreferences {
	public NARWhrAndroid3XRefrigeratorPreferences(AppiumDriver driver) 
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
	@AndroidFindBy(id="fragment_edit_appliance_appliance_name_edittext")
	public WebElement applianceName;

	
	
	// Text - Push Notification Preferences Title Text
	@AndroidFindBy(id="fragment_edit_appliance_notifications_textview")
	public WebElement pushNotificationPreferenceTitleText;

	// Text - Door Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement doorStatusText;

	// Button - Door Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement doorStatusButton;

	
	
	// Text - Water Filter Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement waterFilterStatusText;

	// Button - Water Filter Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement waterFilterStatusButton;

	
	
	// Text - Air Filter Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement airFilterStatusText;

	// Button - Air Filter Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement airFilterStatusButton;

	
	
	
	// Text - Power/Wi-Fi Outage
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement powerOutageText;

	// Button - Power/Wi-Fi Outage
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement powerOutageButton;


	
	
	
	// Text - Power Restored
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[5]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement powerRestoredText;

	// Button - Power Restored
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[5]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement powerRestoredButton;


	// Text - Delete Appliance
	@AndroidFindBy(id="fragment_edit_appliance_delete_appliance_button")
	public WebElement deleteAppliance;

	
}
