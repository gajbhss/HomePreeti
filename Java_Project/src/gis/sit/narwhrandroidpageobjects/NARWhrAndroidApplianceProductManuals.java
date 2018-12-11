package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidApplianceProductManuals 
{
	
	public NARWhrAndroidApplianceProductManuals(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/**************************************************************************
	 * 						Appliance : 1. Dryer							  *
	 * 			   						2. Washer
	 * 							  *		3. MOBDryer
	 * 									4. MOBWasher
	 **************************************************************************/
	
	// Text - Product Manual Text
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Product Manuals']")
	public WebElement productManualText;
	
	// Text - Appliance type text
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_name_text_view")
	public WebElement applianceNameText;
	
	// Text - Model Title
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_model_title_text_view")
	public WebElement applianceModelText;
	
	// View - Appliance Model Number
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_model_text_view")
	public WebElement applianceModelNumber;
	
	// Serial Text
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_serial_title_text_view")
	public WebElement applianceSerialText;
	
	// Serial Number View
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_serial_text_view")
	public WebElement applianceSerialNumber;
	
	// SAID text
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_said_title_text_view")
	public WebElement applianceSaidText;
	
	// View - Appliance SAID
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_said_text_view")
	public WebElement applianceSAID;
	
	// Appliance Start Date Text
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_start_date_title_text_view")
	public WebElement applianceStartDateText;
			
	// Appliance Start Date
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_start_date_text_view")
	public WebElement applianceStartDate;
				
	// Appliance image
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_image_view")
	public WebElement applianceImage;
	
	// Text - Smart Supplement
	@AndroidFindBy(xpath = "//*[@text='Smart Supplement']")
	public WebElement smartSupplement;
	
	//smart start guide
	@AndroidFindBy(xpath = "//*[@text='Smart Start Guide']")
	public WebElement smartStartGuide;
	
	// FCC information Form
	@AndroidFindBy(xpath = "//*[@text='FCC Information Form']")
	public WebElement fccInformationForm;
	
	// Use & care Guide
	@AndroidFindBy(xpath = "//*[@text='Use & Care Guide']")
	public WebElement useAndCareGuide;	
	
	// Installation Instrument
	@AndroidFindBy(xpath = "//*[@text='Installation Instructions']")
	public WebElement installationInstructions;
	
	// Text - Quick Reference Guide
	@AndroidFindBy(xpath = "//*[@text='Quick Reference Guide']")
	public WebElement quickReference;
		
	// Text - Smart Supplement
	@AndroidFindBy(xpath = "//*[@text='Warranty']")
	public WebElement warranty;
		

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
	
	

}
