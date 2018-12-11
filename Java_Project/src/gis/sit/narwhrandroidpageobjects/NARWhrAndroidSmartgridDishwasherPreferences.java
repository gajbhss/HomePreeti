package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSmartgridDishwasherPreferences {
	
	public NARWhrAndroidSmartgridDishwasherPreferences(AppiumDriver driver) 
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


	// Text - Dishes Clean
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement dishesCleanText;

	// Button - Dishes Clean
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement dishesCleanButton;
	
	// Text - Affresh® Nudge
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement affreshNudgeText;

	// Button - Affresh® Nudge
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.Switch[1]")
	public WebElement affreshNudgeButton;

	// Text - Delete Appliance
	@AndroidFindBy(id="fragment_edit_appliance_delete_appliance_button")
	public WebElement deleteAppliance;
}
