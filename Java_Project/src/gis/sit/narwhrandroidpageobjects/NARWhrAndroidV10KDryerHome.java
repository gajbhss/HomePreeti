package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidV10KDryerHome {
	
	public NARWhrAndroidV10KDryerHome(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Appliance Name
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]	")
	public WebElement titleText;

	// Image - Appliance menu
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
	public WebElement applianceMenu;
	
	// Button - Back
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;

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
	
	// Button - Air Flow Status info
	@AndroidFindBy(id = "status_button_info")
	public WebElement airFlowStatusInfoButton;
	
	// Text - Dryer Cycles
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dryer Cycles']")
	public WebElement dryerCycles;
	
	// Text - Dryer Cycles
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dryness']")
	public WebElement dryness;
	
	// Text - ETR
	@AndroidFindBy(id="info_layout_time_based_appliance_minute_text_view")
	public WebElement ETR;
	
	// Text - Remote  Control
	//id="list_item_appliance_control_button_textview"
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement remoteControlText;
	
	// Button - Remote  Control
	@AndroidFindBy(id = "list_item_appliance_control_button_togglebutton")
	public WebElement remoteControlButton;
	
	// Text - Remote  Control
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement quietModeText;
	
	// Button - Remote  Control
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	public WebElement quietModeButton;
	
	// Text - Wrinkle Shield™
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement wrinkleShieldText;
	
	// Button - Remote  Control
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	public WebElement wrinkleShieldButton;
	
	// Text - Static Reduce
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement staticReduceText;
	
	// Button - Static Reduce
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	public WebElement staticReduceButton;
	
	// Text - EcoBoost™
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement ecoBoostText;
	
	// Button - EcoBoost™
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	public WebElement ecoBoostButton;
	
	// Text - Wrinkle Shield™ Cycle
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement wrinkleShieldCycleText;
	
	// Button - Wrinkle Shield™ Cycle
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ToggleButton[1]")
	public WebElement wrinkleShieldCycleButton;
	
	
	// Text - Auto Reorder
	@AndroidFindBy(id = "list_item_appliance_amazon_tip_to_start_title")
	public WebElement autoReorder;

	
	// Button - SETUP Auto Reorder
	@AndroidFindBy(id = "btn_manage_unsubscribe")
	public WebElement setupAutoReorder;
	
	
	
	// Text - Buy Supplies
	@AndroidFindBy(id = "list_item_appliance_control_button_textview_buy_Suuply")
	public WebElement buySupplies;

	
	// Text - Preferences
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement preferences;
	
	
	// Text - Auto Reorder
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[7]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement productManuals;

	
	// Button - SETUP Auto Reorder
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement serviceNSupport;
	
	
	// Text - Every day, care®
	@AndroidFindBy(id = "list_item_appliance_detail_smart_tip_title")
	public WebElement everyDayCare;
	
	// Button - Timed Dry
	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	public WebElement minuteButton;
	
	// Button - Timed Dry
	@AndroidFindBy(id = "list_item_cycle_settings_selected_button")
	public List<WebElement> imageButton;
	
	// Wrinkle Shiled - radio Buttons
	@AndroidFindBy(id = "control")
	public List<WebElement> controlRadioButtons;
	
	// Button - Timed Dry Minute Input
	@AndroidFindBy(id = "numberpicker_input")
	public List<WebElement> minuteInput;
	
	
	// Button - Timed Dry Minute Input
	@AndroidFindBy(id = "buttonDefaultPositive")
	public WebElement doneButton;
}
