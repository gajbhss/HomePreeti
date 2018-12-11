package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSmartgridDishwasherPreferencesPopUp {
	
	public NARWhrAndroidSmartgridDishwasherPreferencesPopUp(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Popup - Title
	@AndroidFindBy(id="title")
	public WebElement popupTitle;

	// Popup - Ok button
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement okButton;


}
