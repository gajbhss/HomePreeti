package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSettingsPage 
{
	public NARWhrAndroidSettingsPage(AppiumDriver driver) {
		// TODO Auto-generated constructor stub
		// narWhrAndroidSettingsPage
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Settings page back navigation icon
	//@AndroidFindBy(xpath = "android.widget.ImageButton[@index='0'])")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement settingsBackIcon;
	
	// Text - Settings page title text
	//@AndroidFindBy(name = "Settings")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement settingsTitleText ;
	
	// Clickable Text - Account settings
	//@AndroidFindBy(name = "Account Profile")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsAccountSettingsText;
	
	// Clickable Text - Add appliance
	//@AndroidFindBy(name = "Add Appliance")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsAddApplianceText;		// NARWhrAndroidAddAppliancesEditPage
	
	// Clickable Text - Energy settings
	//@AndroidFindBy(name = "Energy Settings")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsEnergySettingsText;
	
	// Clickable Text - Works with Nest?
	//@AndroidFindBy(name = "Works with Nest?")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	//@AndroidFindBy(name = "(languageProps.getProperty("worksWithNest"))")
	public WebElement settingsWorksWithNestText;
	
	// Clickable Text - Auto Reorder
	@AndroidFindBy(name = "Auto Reorder")
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsAutoReorderText;
	
	// Clickable Text - About
	//@AndroidFindBy(name = "About")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsAboutText_En;

	
	// Clickable Text - About
	//@AndroidFindBy(name = "About")
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[1]/android.widget.TextView[1]")
	public WebElement settingsAboutText_Fr;

	
	// Clickable Text - Sign out
	//@AndroidFindBy(name = "Sign Out")
	@AndroidFindBy(xpath = "//*[@text='Log Out']")
	public WebElement settingsSignOutText_En;
	
	// Clickable Text - Sign out
	//@AndroidFindBy(name = "Sign Out")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsSignOutFrenchText_fr;

}
