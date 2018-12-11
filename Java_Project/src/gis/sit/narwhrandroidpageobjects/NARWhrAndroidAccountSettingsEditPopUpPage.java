package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAccountSettingsEditPopUpPage 
{
	public NARWhrAndroidAccountSettingsEditPopUpPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Alert]
	@AndroidFindBy(id = "title")
	public WebElement TitleText;
	
	// Text - Description
	@AndroidFindBy(id = "content")
	public WebElement titleDescription;


	// Button - Cancel
	@AndroidFindBy(id = "buttonDefaultNegative")
	public WebElement cancelButton;
	
	// Button - Ok
	@AndroidFindBy(id = "buttonDefaultPositive")
	public WebElement okButton;

}
