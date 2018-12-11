package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidCCDishwasherHome {
	
	public NARWhrAndroidCCDishwasherHome(AppiumDriver driver) 
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


	// Image - Remote enable icon
	@AndroidFindBy(id="info_layout_images_remote_start_imageview")
	//xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement remoteEnableicon;
	
	//Start Now button
	@AndroidFindBy(id = "start_remote_cycle")
	public WebElement startNowButton;
	
	// Button - Appliance status button color indicator for affresh® Status
	@AndroidFindBy(id = "status_button_color_indicator")
	public WebElement colorButtonIndicatorForAffresh;
	
	// Text - affresh® Status
	@AndroidFindBy(xpath = "//*[@text='affresh Status']")
	public WebElement textForAffresh;
	
	// Button - affresh® Status
	@AndroidFindBy(id = "status_button_title_text")
	public WebElement stateButtonTitleTextForAffresh;
	
	// Button - Good
	@AndroidFindBy(id = "status_button_status_text")
	public WebElement statusTextForAffresh;
	
	// affresh dishwasher text
	@AndroidFindBy(id = "fragment_appliance_status_header_textview")
	public WebElement affreshDishwasherText;
	
	// affresh dishwasher description
	@AndroidFindBy(id = "fragment_appliance_status_tip_textview")
	public WebElement affreshDishwasherDescription;
	
	// affresh dishwasher Note
	@AndroidFindBy(id = "fragment_appliance_status_note_textview")
	public WebElement affreshDishwasherNote;
		
	// Related Products Text
	@AndroidFindBy(id = "text_Related_products")
	public WebElement relatedProductsText;
		
	// related Product image
	@AndroidFindBy(id = "list_item_supply_icon")
	public WebElement relatedProductsImage;
	
	// related Product image
	@AndroidFindBy(id = "list_item_supply_purchase_button")
	public WebElement purchaseButton;
		
	// related Product image
	@AndroidFindBy(id = "list_item_supply_title_text")
	public WebElement relatedProductsSupplyText;
	
	// Button - info for Affresh and Filter status
	@AndroidFindBy(id = "status_button_info")
	public List<WebElement> infoForAffreshFilter;
	
	// Button - Appliance status button color indicator for Filter Status
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.view.View[1]")
	public WebElement colorButtonIndicatorForFilter;
	
	// Button - Filter® Status
	@AndroidFindBy(id = "status_button_title_text")
	public WebElement stateButtonTitleTextForFilter;
	
	// Text - Filter® Status
	@AndroidFindBy(xpath = "//*[@text='Filter Status']")
	public WebElement textForFilterStatus;
	
	// Button - Good
	@AndroidFindBy(id = "status_button_status_text")
	public WebElement statusTextForFilter;
	
	// Text to Clean Filter
	@AndroidFindBy(id = "fragment_appliance_status_header_textview")
	public WebElement textToCleanFilter;
	
	// Filter Description
	@AndroidFindBy(id = "fragment_appliance_status_tip_textview")
	public WebElement cleanFilterDescription;
	
	// Filter Video Button
	@AndroidFindBy(id = "provisioning_video_button")
	public WebElement filterVideoButton;
	
//	// Text - Control Lock
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	@AndroidFindBy(xpath = "//*[@text='Control Lock']")
	public WebElement controlLockText;
	
	// Button - Control Lock
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	
	public WebElement controlLockButton;
	
	
	
	// Text - Remote Control
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	@AndroidFindBy(xpath = "//*[@text='Remote Control']")
	public WebElement remoteControlText;
	
	// Button - Remote Control
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ToggleButton[1]")
	public WebElement remoteControlButton;
	
	/*** Quiet Mode ***/
	
	// Quiet Mode Screen Header text
	@AndroidFindBy(xpath = "//*[@text='Quiet Mode']")
	public WebElement quietModeText;

	// All Mode Verify Text
	@AndroidFindBy(id = "title_text_View")		
	public WebElement verifyTextInfo;
		
	
	// All Mode description
	@AndroidFindBy(id = "lock_mode_intro")
	public WebElement verifyDescriptionInfoButton;
	
	/*** Related Videos ***/
	
	// Quiet Mode description
	@AndroidFindBy(id = "list_item_support_faq_videos_title_text_view")
	public WebElement relatedVideoText;
	
	
	/*** Dishwasher Cycle ***/
	// Set Dishwasher
	@AndroidFindBy(id = "list_item_name_text_view1")
	public WebElement selectCycle;
	
	// Cycle Setting Text titles
	@AndroidFindBy(id = "list_item_cycle_settings_title")
	public List<WebElement> CycleSettingTitle;
	
	// Cycle Setting Switches
	@AndroidFindBy(id = "list_item_cycle_settings_switch")
	public List<WebElement> CycleSettingSwitches;
	
	// Cycle Setting Info Buttons
	@AndroidFindBy(id = "list_item_info_button")
	public List<WebElement> CycleSettingInfoButtons;
	
	// Send Button
	@AndroidFindBy(id = "send_button")
	public WebElement sendButton;
	
	/**** Info Button Information ***/
	
	// sani Rinse Header Text
	@AndroidFindBy(xpath = "//*[@text='Sani Rinse']")
	public WebElement saniRinseHeaderText;
	
	// Target Clean Header Text
	@AndroidFindBy(xpath = "//*[@text='Turbo Zone']")
	public WebElement turboZoneHeaderText;
	
	// Heat Dry Header Text
	@AndroidFindBy(xpath = "//*[@text='Heat Dry']")
	public WebElement heatDryHeaderText;
	
	// Hi Temp Wash Header Text
	@AndroidFindBy(xpath = "//*[@text='Hi Temp Wash']")
	public WebElement hiTempWashHeaderText;
	
	// All Title  Text
	@AndroidFindBy(id = "title_text_View")
	public WebElement infoTitleText;
		
	// All Description Text
	@AndroidFindBy(id = "lock_mode_intro")
	public WebElement infoDescriptionText;
	
	// Download and Go
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Download & Go™']")
	public WebElement downloadAndGoTab;
	
	//Download and Go info buttons
	@AndroidFindBy(id = "list_item_cycle_result_info_button")
	public List<WebElement> downloadAndGoInfo;
	
	//Appliance Instruction
	@AndroidFindBy(id = "instruction_set_text")
	public WebElement instructionSet;
	
	//Appliance Instruction definition
	@AndroidFindBy(id = "instruction_set_text_desc")
	public WebElement instructionSetDesc;
	
	
}
