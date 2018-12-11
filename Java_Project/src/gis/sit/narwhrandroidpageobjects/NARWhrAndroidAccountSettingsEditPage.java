package gis.sit.narwhrandroidpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NARWhrAndroidAccountSettingsEditPage 
{
	public NARWhrAndroidAccountSettingsEditPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Account Information]
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement accountInformationTitleText;
	
	// Button - Cancel
	@AndroidFindBy(id = "view_edit_mode_action_bar_negative_text_view")
	public WebElement cancelButton;
	
	// Button - Save
	@AndroidFindBy(id = "view_edit_mode_action_bar_positive_text_view")
	public WebElement saveButton;
	// User will be navigated on - NARWhrAndroidAccountSettingsEditPopUpPage

	// Update - First name
	@AndroidFindBy(id="form_member_first_name_edit_text")
	public WebElement updateFirstName;
	
	// Update - Last name
	@AndroidFindBy(id="form_member_last_name_edit_text")
	public WebElement updateLastName;
	
	// Update - Email address
	@AndroidFindBy(id="form_member_email_edit_text")
	public WebElement emailAddress;
			
	// View - Password instructions
	@AndroidFindBy(id="form_member_sign_up_password_text_view")
	public WebElement passwordInstructionText;
	
	// Update - New password
	@AndroidFindBy(id="form_member_password_edit_text")
	public WebElement newPassword;
	
	// Update - Confirm password
	@AndroidFindBy(id="form_member_confirm_password_edit_text")
	public WebElement confirmPassword;

	
	
	// Text - Title text [name = Home Information]
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement homeInformationTitleText;
	
	// Enter - Home name
	@AndroidFindBy(id="form_location_name")
	public WebElement updateHomeName;
	
	// Enter - Address 1
	@AndroidFindBy(id="form_location_address_1")
	public WebElement updateAddress1;
	
	// Enter - Address 2(Optional)
	@AndroidFindBy(id="form_location_address_2")
	public WebElement updateAddress2;
	
	// Enter - City
	@AndroidFindBy(id="form_location_city")
	public WebElement updateCity;
	
	// Select - State
	@AndroidFindBy(id="form_location_state")
	public WebElement updateState;
	
	// Enter - Zip
	@AndroidFindBy(id="form_location_zip")
	public WebElement updateZip;
	
	//Enter - Mobile number
	@AndroidFindBy(id="form_location_mobile_number")
	public WebElement updateMobileNumber;
	
	// Button - Delete Account
	@AndroidFindBy(id = "fragment_account_settings_delete_account_button")
	public WebElement deleteAccountButton;

}
