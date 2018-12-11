package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSignUpPage2 
{
	public NARWhrAndroidSignUpPage2(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// View - Create home
	//@AndroidFindBy(name="Create Home")
	@AndroidFindBy(xpath = "//*[@text='Create Home']")
	public WebElement createHome;
	
	// View - Create home instruction
	//@AndroidFindBy(name="Create your home by entering your address and phone number")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement createHomeInstructionText;
	
	// Enter - Home name
	@AndroidFindBy(id="form_location_name")
	public WebElement homeName;
	
	// Enter - Address 1
	@AndroidFindBy(id="form_location_address_1")
	public WebElement address1;
	
	// Enter - Address 2(Optional)
	@AndroidFindBy(id="form_location_address_2")
	public WebElement address2;
	
	// Enter - City
	@AndroidFindBy(id="form_location_city")
	//@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[4]")
	public WebElement city;
	
	// Select - State
	@AndroidFindBy(id="form_location_state")
	public WebElement state;
	
	// Text - Country
	@AndroidFindBy(id="form_location_country")
	public WebElement country;
	
	// Enter - Zip
	@AndroidFindBy(id="form_location_zip")
	public WebElement zip;
	
	//Enter - Mobile number
	@AndroidFindBy(id="form_location_mobile_number")
	public WebElement mobileNumber;	

	// Text - Terms and Conditions 
	@AndroidFindBy(id = "form_member_terms_checkbox")
	public WebElement termsAndConditionsText;

	// Text - Terms and Conditions 
	@AndroidFindBy(id = "form_member_info_button")
	public WebElement infoButtonIcon;
	
	// Button - Next
	@AndroidFindBy(id = "layout_pager_control_buttons_next_button")
	public WebElement nextButton;
}
