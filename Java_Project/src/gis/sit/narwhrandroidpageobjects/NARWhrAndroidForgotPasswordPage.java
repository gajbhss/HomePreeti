package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidForgotPasswordPage 
{
	// Constructor
	public NARWhrAndroidForgotPasswordPage(AndroidDriver ad) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(ad), this);
	}

	// Text - Forgot password back navigation icon
	@AndroidFindBy(xpath = "android.widget.ImageButton[@index='0'])")
	public WebElement forgotPasswordBackIcon;
	
	// Text - Forgot password title text
	@AndroidFindBy(name = "Reset Password")
	public WebElement forgotPasswordTitleText;
	
	// Text - Forgot password instruction text
	@AndroidFindBy(id = "fragment_forgot_password_instructions_text_view")
	public WebElement forgotPasswordInstructionText;
	
	// Input - Email address
	@AndroidFindBy(id = "fragment_forgot_password_email_edit_text")
	public WebElement forgotPasswordEmailText;
	

	// Button - Forgot password reset button
	@AndroidFindBy(id = "fragment_forgot_password_reset_button")
	public WebElement forgotPasswordResetButton;
	
	
	// Need to discuss for "Invalid email format"
}
