package gis.sit.narwhrandroidpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NARWhrAndroidSignUpPage1PopUp 
{
	
	public NARWhrAndroidSignUpPage1PopUp(AndroidDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// Narendra - Task
	// Add Info button - Pop up & Elements
	
	// Text - PopUp Title Text [name = "Which do you want to view?"]
	@AndroidFindBy(id = "title")
	public WebElement titleText;
	
	// Radio Button - for Terms and Conditions 
	@AndroidFindBy(id = "control")
	public WebElement radioButton;
	
	// Text - Privacy Statement 
	@AndroidFindBy(name = "Privacy Statement")
	public WebElement privacyStatementText;
	
	// Button - Cancel
	@AndroidFindBy(id = "buttonDefaultNegative")
	public WebElement cancelButton;
	
	// Button - Yes
	@AndroidFindBy(id = "buttonDefaultNegative")
	public WebElement yesButton;

}
