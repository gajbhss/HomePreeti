package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidApplianceDetailsPage 
{
	
	public NARWhrAndroidApplianceDetailsPage(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/**************************************************************************
	 * 						Appliance : 1. Dryer							  *
	 * 			   						2. Washer							  *
	 **************************************************************************/
	
	// Text - Appliance type text
	@AndroidFindBy(name = "Clothes Dryer")
	public WebElement applianceClothesDryerText;
	
	// Text - Appliance type text
	@AndroidFindBy(name = "Clothes Washer")
	public WebElement applianceClothesWasherText;
	
	// View - Appliance icon image
	@AndroidFindBy(id = "info_layout_images_appliance_icon_imageview")
	public WebElement applianceIconImage;
	
	// View - Appliance state text
	@AndroidFindBy(id = "info_layout_time_based_appliance_state_text_view")
	public WebElement applianceStateText;
	
	// Button - Appliance status button color indicator
	@AndroidFindBy(id = "status_button_color_indicator")
	public WebElement applianceStateButtonColorIndicator;
	
	// Button - Appliance status button title 
	@AndroidFindBy(id = "status_button_title_text")
	public WebElement applianceStateButtonTitleText;
	
	// Button - Appliance status button status
	@AndroidFindBy(id = "status_button_status_text")
	public WebElement applianceStatusButtonStatusText;
	
	// View - Appliance control button 
	@AndroidFindBy(id = "list_item_appliance_control_button_textview")
	public WebElement applianceControlButtonText1;
	
	// Button - Appliance control button toggle button
	@AndroidFindBy(id = "list_item_appliance_control_button_togglebutton")
	public WebElement applianceControlToggleButton;
			
	// Text - Appliance control button text
	@AndroidFindBy(id = "list_item_appliance_control_button_textview")
	public WebElement applianceControlButtonText2;
				
	// Button - Appliance control switch button
	@AndroidFindBy(id = "list_item_appliance_control_switch_switch")
	public WebElement applianceControlSwitchButton;
	
	// Text - Energy power usage title text
	@AndroidFindBy(id = "list_item_energy_usage_power_usage_title_text_view")
	public WebElement applianceControlEnergyPowerUsageTitleText;
	
	// Text - Energy usage total cycle[odometer] title text
	@AndroidFindBy(id = "list_item_energy_usage_odometer_title_text_view")
	public WebElement applianceControlEnergyTotalCycleTitleText;
	
	// Text - Energy power usage text
	@AndroidFindBy(id = "list_item_energy_usage_power_usage_text_view")
	public WebElement applianceControlEnergyPowerUsageText;
	
	// Text - Energy usage total cycle[odometer] text
	@AndroidFindBy(id = "list_item_energy_usage_odometer_text_view")
	public WebElement applianceControlEnergyTotalCycleText;	
	
	// Tab - Appliance control button
	@AndroidFindBy(id = "list_item_appliance_control_button_textview")
	public WebElement applianceControlButton;
	
	// View - Appliance details smart tip title
	@AndroidFindBy(id = "list_item_appliance_detail_smart_tip_title")
	public WebElement applianceDetailsSmartTipTitleText;
	
	// View - Appliance details smart tip detail
	@AndroidFindBy(id = "list_item_appliance_detail_smart_tip_detail")
	public WebElement applianceDetailsSmartTipDetailText;
	
	/**************************************************************************
	 * 						Appliance : 3. Refrigerator						  *
	 * 			   															  *
	 **************************************************************************/
	
	// Text - Appliance type text
	@AndroidFindBy(name = "Refrigerator")
	public WebElement applianceClothesRefrigeratorText;
	
	// Image - Setting button
	@AndroidFindBy(xpath = "android.widget.ImageView[@index='0']")
	public WebElement applianceSettingButton;	
	
	// View - Appliance icon image
	// Note - Already defined under Dryer & Washer
	/*@AndroidFindBy(id = "info_layout_images_appliance_icon_imageview")
	public WebElement applianceIconImage;*/
	
	// Text - Appliance Freezer Temperature Text
	@AndroidFindBy(id = "info_layout_temperature_based_appliance_freezer_temp_text_view")
	public WebElement applianceFreezerTemperatureText;
	
	// Text - Appliance Refrigerator Temperature Text
	@AndroidFindBy(id = "info_layout_temperature_based_appliance_refrigerator_temp_text_view")
	public WebElement applianceRefrigeratorTemperatureText;
	
	// Text - Appliance freezer label text
	@AndroidFindBy(id = "info_layout_temperature_based_appliance_freezer_label_text_view")
	public WebElement applianceFreezerLabelText;
	
	// Text - Appliance refrigerator label text
	@AndroidFindBy(id = "info_layout_temperature_based_appliance_refrigerator_label_text_view")
	public WebElement applianceRefrigeratorLabelText;	
	
	// Text - Appliance freezer temperature unit text
	@AndroidFindBy(id = "info_layout_temperature_based_appliance_freezer_temp_unit_text_view")
	public WebElement applianceFreezerTemperatureUnitText;
	
	// Button - Appliance modify button
	@AndroidFindBy(id = "info_layout_temperature_based_appliance_modify_button")
	public WebElement applianceModifyButton;
	
	// Button - Appliance status button color indicator
	// Button - Appliance status button title
	// Button - Appliance status button status
	// View - Appliance control button
	// Button - Appliance control switch button
	// Text - Energy power usage title text
	// Text - Energy power usage text
	// View - Appliance control button 
	// Note - Already defined under Dryer & Washer
	
	// View - Appliance energy power usage unit text
	@AndroidFindBy(id = "list_item_energy_usage_power_usage_units_text_view")
	public WebElement appliancePowerEngergyUsageUnitsText;	
	
	/**************************************************************************
	 * 						Engergy : 1. Dryer								  *
	 * 			   				   	  2. Washer			     				  *
	 **************************************************************************/
	

}
