package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSmartgridRefrigeratorHomePopUp {
	public NARWhrAndroidSmartgridRefrigeratorHomePopUp(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// Text - Preferences
	@AndroidFindBy(xpath="//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement preferences;

	// Text - Product Manuals
	@AndroidFindBy(xpath="//android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement productManuals;

	// Text - Service & Support
	@AndroidFindBy(xpath="//android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement serviceAndSupport;



}
