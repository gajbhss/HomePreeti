package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSignUpPage1 
{

	//Constructor
	public NARWhrAndroidSignUpPage1(AppiumDriver driver) throws Exception
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}

	// View - Create account
	//@AndroidFindBy(name="Create Account")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement createAccount;
	
	// View - Welcome text
	//@AndroidFindBy(name="Welcome")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement welcomeText;
	
	// View - Instruction text
	@AndroidFindBy(id="fragment_create_member_instructions_text_view")
	public WebElement instructionText;
		
	// Enter - First name
	@AndroidFindBy(id="form_member_first_name_edit_text")
	public WebElement firstName;
	
	// Enter - Last name
	@AndroidFindBy(id="form_member_last_name_edit_text")
	public WebElement lastName;
	
	// Enter - Email address
	@AndroidFindBy(id="form_member_email_edit_text")
	public WebElement emailAddress;
			
	// View - Password instructions
	@AndroidFindBy(id="form_member_sign_up_password_text_view")
	public WebElement passwordInstructionText;
	
	// Enter - New password
	@AndroidFindBy(id="form_member_password_edit_text")
	public WebElement newPassword;
	
	// Enter - Confirm password
	@AndroidFindBy(id="form_member_confirm_password_edit_text")
	public WebElement confirmPassword;
	
	// Check - Terms & Conditions and Privacy Statement
	@AndroidFindBy(id="form_member_terms_checkbox")
	public WebElement termsAndConditionCheckBox;
	
	// Info button
	@AndroidFindBy(id="form_member_info_button")
	public WebElement infoButton;
	
	// Button - Back
	@AndroidFindBy(id="layout_pager_control_buttons_back_button")
	public WebElement backButton;
	
	// Button - Next
	@AndroidFindBy(id="layout_pager_control_buttons_next_button")
	public WebElement nextButton;
	
}
