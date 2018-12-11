package gis.sit.narwhrandroidpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class NARWhrAndroidSignUpPage3 
{
	public NARWhrAndroidSignUpPage3(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// View - Confirm Email
	//@AndroidFindBy(name="Confirm Email")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement confirmEmail;
	
	// View - Welcome message
	@AndroidFindBy(id="fragment_email_verification_instructions_textview")
	public WebElement welcomeMessage;
	
	// View - Didn't hear from Us
	//@AndroidFindBy(name="You didn't hear from us?")
	@AndroidFindBy(id = "fragment_email_verification_resend_textview")
	public WebElement notHearFromUs;
		
	// Button - Resend that Email
	@AndroidFindBy(id="fragment_email_verification_resend_button")
	public WebElement resendEmailButton;
		
	// View - Not a good time? message
	@AndroidFindBy(id="fragment_email_verification_logout_textview")
	public WebElement notGoodTimeMessage;
		
	// Button - Sign Out
	@AndroidFindBy(id="fragment_email_verification_logout_button")
	public WebElement signOut;


}
