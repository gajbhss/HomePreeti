package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidHomePage 
{
	public NARWhrAndroidHomePage(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Tab - Appliances
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement appliancesTabText;
	
	//Tabs - Appliance and Energy
	@AndroidFindBy(id ="psts_tab_title" )
	public List<WebElement> tabTexts;
	
	// Tab - Energy
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement energyTabText;	
	
	// Image - Menu button[Vertical dots]
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
	public WebElement menuButtonImage;
	
	// Action Bar - "Appliances, Connect to Care, Energy
	@AndroidFindBy(id="activity_dashboard_tab_strip")
	public WebElement actionBar;
	
	/**************************************************************************
	 * 						New & Fresh user account						  *
	 * 			   	[User has no appliances added in to app]				  *
	 **************************************************************************/
	// Appliances: Default - Text "+"
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement applianceDefaultPlusText;
	
	// Appliances: Default - Text "No Appliances"
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement applianceDefaultNoAppliancesText;

	// Appliances: Default - Text "Once you're ready, tap to add."
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement applianceDefaultTapToAddText;

	// Energy: Default - Text "*A compatible, connected appliance must be added in order to use the energy features of the application."
	@AndroidFindBy(id="text_note_add_appliance")
	public WebElement energyDefaultTapToAddText;
	
	/**************************************************************************
	 * 						Selected Tab : Expand Floating Button					  *
	 * 			   						 									  *
	 **************************************************************************/
	@AndroidFindBy(id="fab_expand_menu_button")
	public WebElement expandFloatingButton;
	
	@AndroidFindBy(xpath="//*[contains(@text, 'Add New Appliance')]")
	public WebElement addNewApplianceText;
	
	@AndroidFindBy(id="activity_dashboard_fab_item_add_appliance")
	public WebElement plusIcon;
	
	@AndroidFindBy(id="activity_dashboard_fab_item_global_function")
	public WebElement mySuite;
	
	/**************************************************************************
	 * 						Selected Tab : My Suite					  *
	 * 			   						 									  *
	 **************************************************************************/
	// Mode name text
	@AndroidFindBy(id="list_item_globalgov_control_button_textview")
	public List<WebElement> modeNameMySuite;
	
	//Swtiches of My suite
	@AndroidFindBy(id="list_item_globalgov_control_switch_switch")
	public List<WebElement> modeSwitchMySuite;
	
	//My Suite text on header
	@AndroidFindBy(id="view_edit_mode_action_bar_negative_text_view")
	public WebElement mySuiteText;
	
	//Save button of My suite
	@AndroidFindBy(id="view_edit_mode_action_bar_positive_text_view")
	public WebElement saveButtonMySuite;
	
	//Mode description of My suite
	@AndroidFindBy(id="list_item_globalgov_text_description")
	public WebElement modeDesc;
	
	//Get Started Button
	@AndroidFindBy(id="scan_to_cook_welcome_fragment_scanbutton")
	public WebElement getStartedButton;
		
	//welcome description Text	
	@AndroidFindBy(id="welcome_desc_textview")
	public WebElement welcomeToMySuiteDescription;
	
	//welcome header text
	@AndroidFindBy(id="welcome_header_textview")
	public WebElement welcomeText;
	
	
	/**************************************************************************
	 * 						Selected Tab : Appliances						  *
	 * 			   						 									  *
	 **************************************************************************/
	
	// Text - Appliance type text
	@AndroidFindBy(xpath="//*[contains(@text, 'MOBWasher')]")
//	(name="MOBWasher")
	public WebElement applianceMOBWasher;
	
	// Text - Appliance type text
	@AndroidFindBy(xpath="//*[contains(@text, 'MOBDryer')]")
//	(name="MOBDryer")
	public WebElement applianceMOBDryer;
	
//	Appliance Cycle Info
	@AndroidFindBy(id="info_layout_time_based_appliance_cycle_text_view")
	public WebElement applianceCycleInfo;
	
	
	// Text - Appliance type text
//	@AndroidFindBy(name="V10KDryer")
	@AndroidFindBy(xpath="//*[contains(@text, 'V10KDryer')]")
	public WebElement applianceV10KDryer;
	
	// Text - Apliance type text
	@AndroidFindBy(xpath="//*[contains(@text, 'V10KWasher')]")
//	(name="V10KWasher")
	public WebElement applianceV10KWasher;
	
	
	// Text - Apliance type text
	@AndroidFindBy(xpath="//*[contains(@text, 'MOBRefrigerator')]")
//	(name="MOBRefrigerator")
	public WebElement applianceMOBRefrigerator;
	
	
	// Text - Apliance type text
	@AndroidFindBy(xpath="//*[contains(@text, '3XRefrigerator')]")
	public WebElement appliance3XRefrigerator;
	
	// Text - Apliance type text
	@AndroidFindBy(xpath="//*[contains(@text, 'VestaOven')]")
	public WebElement applianceVestaOven;
	
	// Text - Appliance type text
	@AndroidFindBy(xpath="//*[contains(@text, 'MHC76')]")
	public WebElement applianceMHC76;
	
	// Text - Appliance Dishwasher
	@AndroidFindBy(name="MOBDishwasher")
	public WebElement applianceMOBDishwasher;
	
	// Text - Appliance Clean Connect Dishwasher
	@AndroidFindBy(xpath="//*[contains(@text, 'CCDishwasher')]")
	public WebElement applianceCCDishwasher;
	
	// View - Appliance icon
	@AndroidFindBy(id = "list_item_dashboard_appliance_icon_imageview")
	public WebElement applianceIcon;
	
	// View - Appliance name [Clothes Dryer,Clothes Washer,Refrigerator]
	@AndroidFindBy(id = "list_item_time_appliance_appliance_title_textview")
	public WebElement applianceNameText;
	
	
	// ETA Time 
	@AndroidFindBy(id="info_layout_time_based_appliance_minute_text_view")
	public WebElement ETR;

	// View - Appliance state
	@AndroidFindBy(id = "list_item_time_appliance_cycle_state_textview")
	public WebElement applianceStateText;	
	
	// View - Appliance freezer temperature text
	@AndroidFindBy(id = "list_item_temperature_appliance_freezer_temp_textview")
	public WebElement applianceFreezerTemperatureText;
		
	
	// View - Appliance refrigerator temperature text
	@AndroidFindBy(id = "list_item_temperature_appliance_refrigerator_temp_textview")
	public WebElement applianceRefrigeratorTemperatureText;
		
	
	// View - Appliance freezer text
	@AndroidFindBy(id = "list_item_temperature_appliance_freezer_textview")
	public WebElement applianceFreezerText;
	
	
	// View - Appliance refrigerator text
	@AndroidFindBy(id = "list_item_temperature_appliance_refrigerator_textview")
	public WebElement applianceRefrigeratorText;
	
	//Switches
	@AndroidFindBy(xpath="//android.widget.Switch")
	public List<WebElement> switches; 

	/**************************************************************************
	 * 						Selected Tab : Energy							  *
	 * 			   						 									  *
	 **************************************************************************/
			
	// Text - Energy Report [id=list_item_energy_report_title_text]
	@AndroidFindBy(name = "Energy Report")
	public WebElement energyReportText;

	// Image - Energy report appliance icon
	@AndroidFindBy(id = "list_item_energy_report_appliance_image_view")
	public WebElement energyReportApplianceImageIcon;
	
	// Text - Appliance name [Clothes Dryer,Clothes Washer,Refrigerator]
	// Note - Already defined under Appliances

	// Text - Energy report last cycle text
	@AndroidFindBy(id = "list_item_energy_report_last_cycle_text")
	public WebElement energyReportLastCycleText;	
	
	// Text - Energy report energy usage text
	@AndroidFindBy(id = "list_item_energy_report_energy_usage_text")
	public WebElement energyReportEnergyUsageText;
	
	// Appliance is added and Energy  Settings ON
	// Text - Energy Advisor
	@AndroidFindBy(id = "list_item_rate_revealer_title_text_view")
	public WebElement energyReportOnRevelearText;
	
	// Text - Estimated Demand
	@AndroidFindBy(id = "list_item_rate_revealer_rate_title_text_view")
	public WebElement energyReportOnRevelearRateText;
	
	// Text - Estimated Demand
	@AndroidFindBy(id = "list_item_rate_revealer_rate_text_view")
	public WebElement energyReportOnRevelearRateTextView;
	
	// Text - Utility Description
	@AndroidFindBy(id = "list_item_rate_revealer_utility_and_plan_text_view")
	public WebElement energyReportOnRevelearutilityText;
	
	//Time of the day
	@AndroidFindBy(id = "list_item_rate_revealer_date_text_view")
	public WebElement energyReportOnRevelearTimeOfDay;
	
	//Time of the day
	@AndroidFindBy(id = "list_item_rate_revealer_time_title_text_view")
	public WebElement energyReportOnRevelearTimeTitleText;
	//Time of the day
	@AndroidFindBy(id = "list_item_rate_revealer_time_text_view")
	public WebElement energyReportOnRevelearTimeTextView;
	
	//Chart bar Energy report
	@AndroidFindBy(xpath = "//android.view.View")
	public WebElement energyReportOnChart;
	
	/*** Appliance Controls ***/
	//Appliance Control Text View
	@AndroidFindBy(id = "list_item_appliance_control_button_textview")
	public List<WebElement> applianceControlText;
	
	//Appliance Control Info Buttons
	@AndroidFindBy(id = "list_item_info_button")
	public List<WebElement> applianceControlInfoButtons;
}
