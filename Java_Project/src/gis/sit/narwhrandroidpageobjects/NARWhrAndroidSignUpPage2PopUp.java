package gis.sit.narwhrandroidpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NARWhrAndroidSignUpPage2PopUp 
{

	public NARWhrAndroidSignUpPage2PopUp(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// Narendra - Implement SignUpPage2PopUp elements
	
	// Text - PopUp title [name = "Select State"]
	@AndroidFindBy(id = "alertTitle")
	public WebElement titleText;
	
	// Select - Country
	@AndroidFindBy(id = "country_selection")
	public WebElement selectCountry;
	
	// Select - State
	@AndroidFindBy(id = "select_button")
	public WebElement selectState;
	
	// Select State - AP
	@AndroidFindBy(id="text1")
	public WebElement stateAP;
	
	// Text - Loading [name = "Creating Account"]
	@AndroidFindBy(name = "Creating Account")
	public WebElement titleCreatingAccountText;
	
	// ProgressBar - Rotating spinner image
	@AndroidFindBy(id = "progress")
	public WebElement progressBar;
	
	// Error
	@AndroidFindBy(id = "title")
	public WebElement errorTitle;
	
	// Text - Content [name = "Saving your account details"]
	@AndroidFindBy(id = "content")
	public WebElement errorContent;	
	
	// Button - OK
	@AndroidFindBy(id = "buttonDefaultNeutral")
	public WebElement okButton;

}
