package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage5PopUp {
	
	public NARWhrAndroidAddAppliancesLetsGoEditPage5PopUp(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Register Appliance]
	//@AndroidFindBy(name = "Register Appliance")
	@AndroidFindBy(id = "title")
	public WebElement popUpErrorTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "content")
	public WebElement popUpErrorDescriptionText;
	
	// Button - Cancel
	@AndroidFindBy(id = "buttonDefaultNegative")
	public WebElement cancelButton;

	// Button - OK
	@AndroidFindBy(id = "buttonDefaultPositive")
	public WebElement okButton;

}
