package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidApplianceServiceAndSupport 
{
	
	public NARWhrAndroidApplianceServiceAndSupport(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/**************************************************************************
	 * 						Appliance : 1. Dryer							  *
	 * 			   						2. Washer
	 * 							  *		3. MOBDryer
	 * 									4. MOBWasher
	 **************************************************************************/
	
	// Text - Service & Support Text
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Service & Support']")
	public WebElement serviceAndSupportText;
	
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
	
	// Text - Extended Service Plan
	@AndroidFindBy(xpath = "//*[@text='Extended Service Plan']")
	public WebElement extendedServicePlan;
	
	//Buy Supplies
	@AndroidFindBy(xpath = "//*[@text='Buy Supplies']")
	public WebElement buySupplies;
	
	// Schedule Service
	@AndroidFindBy(xpath = "//*[@text='Schedule Service']")
	public WebElement scheduleService;
	
	// Send us a message.
	@AndroidFindBy(xpath = "//*[@text='Send us a message.']")
	public WebElement sendUsMessage;
	
	// Active Support Tickets
	@AndroidFindBy(xpath = "//*[@text='Active Support Tickets']")
	public WebElement activeSupportTickets;
		
	// Appliance Errors
	@AndroidFindBy(xpath = "//*[@text='Appliance Errors']")
	public WebElement applianceErrors;
	
	// Contact Customer Support
	@AndroidFindBy(id = "list_item_support_info_title_text_view")
	public WebElement contactCustomerSupport;
	
	// Phone title
	@AndroidFindBy(id = "list_item_support_info_phone_title_text_view")
	public WebElement PhoneText;
		
	// Hours title
	@AndroidFindBy(id = "list_item_support_info_hours_title_text_view")
	public WebElement hourstitle;
		
	// Phone Number
	@AndroidFindBy(id = "list_item_support_info_hours_title_text_view")
	public WebElement phoneNumberView;
	
	// Hours View
	@AndroidFindBy(id = "list_item_support_info_hours_text_view")
	public WebElement hoursView;
	
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
	
	//Wifi Logo
	@AndroidFindBy(id = "list_item_appliance_options_header_appliance_wifi")
	public WebElement wifiSign;
	
	/**************************************************************************
	 * 		Extended Warranty Plan :    1. Dryer							  *
	 * 			   						2. Washer
	 * 							  *		3. MOBDryer
	 * 									4. MOBWasher
	 **************************************************************************/

	//Extended Warranty Plan Text
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Extended Service Plan']")
	public WebElement extendedServicePlanScreenText;
		
	//Extended WarrantyText
	@AndroidFindBy(id = "list_item_supply_title_text")
	public WebElement extendedWarrantyText;
	
	//Extended Warranty Icon
	@AndroidFindBy(id = "list_item_supply_icon")
	public WebElement extendedWarrantyIcon;
	
	//Buy from Text
	@AndroidFindBy(xpath = "//*[@text='Buy From']")
	public WebElement buyfromText;
	
	//Buy Option Image
	@AndroidFindBy(id = "iv_buy_supply_icon")
	public WebElement buyOptionImage;
	
	/**************************************************************************
	 * 		Send A Message
	 **************************************************************************/
	//Buy Option Image
	@AndroidFindBy(id = "list_item_appliance_control_button_textview")
	public WebElement sendUsMsg;
		
	//We are here for you text
	@AndroidFindBy(id = "list_item_support_info_title_text_view")
	public WebElement weAreHereText;
		
	//contact Name
	@AndroidFindBy(id = "form_contact_name_edit_text")
	public WebElement contactName;
		
	//Contact Email
	@AndroidFindBy(id = "form_contact_email_edit_text")
	public WebElement contactEmail;
	
	//contact phone number
	@AndroidFindBy(id = "form_contact_phone_edit_text")
	public WebElement phoneNumber;
		
	//Message Text Box
	@AndroidFindBy(id = "form_message_edit_text")
	public WebElement messageBody;
		
	//Send Button
	@AndroidFindBy(id = "form_submit_button")
	public WebElement submitButton;
	
	//Message Content
	@AndroidFindBy(id = "content")
	public WebElement messageContent;
		
	//Ok Button
	@AndroidFindBy(id = "buttonDefaultPositive")
	public WebElement okButton;
	
}
