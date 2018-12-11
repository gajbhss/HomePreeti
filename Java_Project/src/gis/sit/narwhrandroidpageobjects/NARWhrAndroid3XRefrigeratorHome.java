package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroid3XRefrigeratorHome {
	public NARWhrAndroid3XRefrigeratorHome(AppiumDriver driver) 
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
	
	
	// Button - CHange
	@AndroidFindBy(id="info_layout_temperature_based_appliance_modify_button")
	//(id="info_layout_temperature_based_appliance_modify_button")
	//xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[1]"
	public WebElement changeTemperatureButton;


	// Text - Refrigerator
	@AndroidFindBy(xpath="//*[contains(@text, 'Refrigerator')]")
	public WebElement setRefrigerator;
	
	// Text - Freezer 
	@AndroidFindBy(xpath="//*[contains(@text, 'Freezer')]")
	public WebElement setFreezer;
	
	
	// Text - Deli Drawer
	@AndroidFindBy(xpath="//*[contains(@text, 'Deli Drawer')]")
	public WebElement setDeliDrawer;
	
	
	// Refrigerator Current Temperature
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	@AndroidFindBy(id="info_layout_temperature_based_appliance_refrigerator_temp_text_view")
	public WebElement refrigeratorCurrentTemp;
	
	// Refrigerator Current Temperature Text
	@AndroidFindBy(id="info_layout_temperature_based_appliance_refrigerator_label_text_view")
	public WebElement refrigeratorCurrentTempLabel;

	// Freezer Current Temperature 
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
	@AndroidFindBy(id="info_layout_temperature_based_appliance_freezer_temp_text_view")
	public WebElement freezerCurrentTemp;
	
	// Freezer Current Temperature text
	@AndroidFindBy(id="info_layout_temperature_based_appliance_freezer_label_text_view")
	public WebElement freezerCurrentTempLabel;
	
	// Deli Drawer Current Temperature
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	@AndroidFindBy(id="info_layout_temperature_based_appliance_pantry_temp_text_view")
	public WebElement deliDrawerCurrentTemp;
	
	// Deli Drawer Current Temperature Text
	@AndroidFindBy(id="info_layout_temperature_based_appliance_pantry_label_text_view")
	public WebElement deliDrawerCurrentTempLabel;
	
	// Temperature Unit
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	//(id="modify_temperature_current_title_text_view")
	public WebElement tempUnits;
	
	// Text - Reduce Temperature
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.Button[1]")
	@AndroidFindBy(xpath="//android.widget.Button[@index='0']")
	public WebElement reduceTemp;
	
	
	// Text - Selected Temperature
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.EditText[1]")
	@AndroidFindBy(id="numberpicker_input")
	public WebElement currentTemp;
		
	
	// Text - Increase Temperature
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.Button[2]")
	@AndroidFindBy(xpath="//android.widget.Button[@index='1']")
	public WebElement increaseTemp;
	
	//Increase Temp Level 2
	@AndroidFindBy(xpath="//android.widget.Button[@index='2']")
	public WebElement increaseTempLevelTwo;
	
	// Button - Save
	@AndroidFindBy(id="view_edit_mode_action_bar_positive_text_view")
	public WebElement saveButton;
	
	
	// Indocator - Appliance status button color indicator for Door Status
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]")
	public WebElement colorButtonIndicatorForDoorStatus;
	
	//Info Icon
	@AndroidFindBy(id="status_button_info")
	public List<WebElement> infoIcon;
	
	// Text - Door Status
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	@AndroidFindBy(id="status_button_title_text")
	public WebElement stateButtonTitleTextForDoorStatus;
	
	// Text - OPEND/CLOSED
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	@AndroidFindBy(id="status_button_status_text")
	public WebElement statusTextForDoorStatus;
	
	// Indocator - Appliance status button color indicator for Water Filter Status
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.view.View[1]")
	@AndroidFindBy(id="status_button_color_indicator")
	public WebElement colorButtonIndicator;
	
	//Header validation
	@AndroidFindBy(id="fragment_appliance_status_header_textview")
	public WebElement StatusText;
	
	//Door Open Text Description
	@AndroidFindBy(id="fragment_appliance_status_tip_textview")
	public WebElement doorStatusDescription;
	
	//Door Open Text
	@AndroidFindBy(xpath="//*[contains(@text,'Door Open')]")
	public WebElement doorOpenText;
	
	//Door Open Text
	@AndroidFindBy(xpath="//*[contains(@text,'Water Filter Status')]")
	public WebElement waterFilterText;
	
	//Air Filter  Text
	@AndroidFindBy(xpath="//*[contains(@text,'Air Filter Status')]")
	public WebElement airFilterText;
	
	//Water Filter - Related Products Text
	@AndroidFindBy(id="text_Related_products")
	public WebElement relatedProductswaterFilter;
	
	//Water Filter - Related Products Image
	@AndroidFindBy(id="list_item_supply_icon")
	public WebElement relatedProductsIcon;
	
	//Water Filter - Related Products supply text
	@AndroidFindBy(id="list_item_supply_title_text")
	public WebElement relatedProductssupplyText;
	
	//Water Filter - Related Products Purchase Button
	@AndroidFindBy(id="list_item_supply_purchase_button")
	public WebElement relatedProductsPurchaseButton;
	
	// Reject To Open Link To Browser
	@AndroidFindBy(id = "buttonDefaultNegative")
	public WebElement openBrowserNo;
	
	// Accept To Open Link To Browser
	@AndroidFindBy(id = "buttonDefaultPositive")
	public WebElement openBrowserYes;
	
	//Launch Browser Text
	@AndroidFindBy(id = "title")
	public WebElement launchBrowserText;
	
	//Content
	@AndroidFindBy(id = "content")
	public WebElement contentMessage;
	
	// Text - Water Filter Status
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement stateButtonTitleTextForWaterFilterStatus;
	
	// Text - Good
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement statusTextForWaterFilterStatus;
	
	
	// Indocator - Appliance status button color indicator for Air Filter Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.view.View[1]")
	public WebElement colorButtonIndicatorForAirFilterStatus;
	
	// Text - Air Filter Status
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement stateButtonTitleTextForAirFilterStatus;
	
	// Text - Good
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement statusTextForAirFilterStatus;
	
	//Buttons appliance control
	@AndroidFindBy(id="list_item_appliance_control_switch_switch")
	public List<WebElement> applianceControlSwitch;
	
	//Info Button appliance control
	@AndroidFindBy(id="list_item_info_button")
	public List<WebElement> infoButtonApplianceControl;
	
	//List of appliance control Texts
	@AndroidFindBy(id="list_item_appliance_control_button_textview")
	public List<WebElement> applianceControlText;
	
	// Button - Fast Cool
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Switch[1]")	
	public WebElement fastCoolButton;
	
	//Fast Cool Text
	@AndroidFindBy(xpath="//*[contains(@text,'Fast Cool')]")
	public WebElement fastCoolText;
	
	// Button - Fast Ice
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	public WebElement fastIceButton;

	//Fast ice
	@AndroidFindBy(xpath="//*[contains(@text,'Fast Ice')]")
	public WebElement fastIceText;
	
	
	// Button - Party Mode
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.Switch[1]")
	public WebElement partyModeButton;
	
	//Party Mode Text
	@AndroidFindBy(xpath="//*[contains(@text,'Party Mode')]")
	public WebElement partyModeText;
	
	
	/****Info button verification ***/
	/******** Fast Cool *****/
	
	//Fast cool / Fast Ice/ Party Mode text
	@AndroidFindBy(id="title_text_View")
	public WebElement infoTitle;
	
	//Fast cool / Fast Ice/ Party Mode description 
	@AndroidFindBy(id="lock_mode_intro")
	public WebElement infoDescription;
	
}
