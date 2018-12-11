package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidEnergySettingsEditPagePopUp {
	public NARWhrAndroidEnergySettingsEditPagePopUp(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Energy Report details page
	@AndroidFindBy(id = "title") // xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]
	public WebElement companyUtilityTitleText;
		
	// Image - Energy report details appliance image
	@AndroidFindBy(id = "list_item_energy_provider_name") // xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]
	public WebElement companyUtilitySelect;
		
	// YOUR RATE PLANS
	// Title - Your Rate Plan
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement ratePlansTitleText;
		
	// Select - First Rate Plans
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement selectFirstRatePlan;
	
	// Select - Second Rate Plans
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
	public WebElement selectSecondRatePlan;


}
