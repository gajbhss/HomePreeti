package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSmartgridDryerHome {
	
	public NARWhrAndroidSmartgridDryerHome(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Appliance Name
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement titleText;

	// Image - Appliance menu
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
	public WebElement applianceMenu;
	
	// Button - Back
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;
	
	// ETA Time 
	@AndroidFindBy(id="info_layout_time_based_appliance_minute_text_view")
	public WebElement ETR;


	// Image - Remote enable icon
	@AndroidFindBy(id="info_layout_images_remote_start_imageview")
	public WebElement remoteEnableicon;

	
	// Button - Appliance status button color indicator
	@AndroidFindBy(id = "status_button_color_indicator")
	public WebElement colorButtonIndicator;
	
	// Button - Air Flow Status
	@AndroidFindBy(id = "status_button_title_text")
	public WebElement stateButtonTitleText;
	
	// Button - Good
	@AndroidFindBy(id = "status_button_status_text")
	public WebElement statusText;

	
	
	// Text - Remote  Control
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement remoteControlText;
	
	// Button - Remote  Control
	@AndroidFindBy(id = "list_item_appliance_control_button_togglebutton")
	public WebElement remoteControlButton;

	
	
	
	// Text - Wrinkle Shield™
	@AndroidFindBy(xpath = "//*[contains(@text,'Wrinkle Shield™')]")
	public WebElement wrinkleShieldText;
	
	// Button - Wrinkle Shield™
	@AndroidFindBy(id = "list_item_appliance_control_switch_switch")
	public WebElement wrinkleShieldButton;
	
	
	
	
	// Text - Buy Supplies
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement buySupplies;
	
	// Text - Preferences
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement preferences;
	
	// Text - Product Manuals
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement productManuals;
	
	// Text - Service and Support
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[7]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement ServiceNSupport;
}
