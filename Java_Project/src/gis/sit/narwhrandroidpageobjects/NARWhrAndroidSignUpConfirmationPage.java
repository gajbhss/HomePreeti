package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSignUpConfirmationPage 
{
	public NARWhrAndroidSignUpConfirmationPage(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// View - Welcome message
	@AndroidFindBy(id="fragment_create_member_instructions_text_view")
	public WebElement createMemberInstructionText;
	
	// View - Welcome message
	@AndroidFindBy(id="fragment_email_verification_view_dashboard_button")
	public WebElement viewDashboardButton;
	

}
