package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidEnergySettingsEditPage 
{
	
	public NARWhrAndroidEnergySettingsEditPage(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	// Text - Title text [name = Energy Advisor]
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement energyAdvisorText;
	
	// Button - Cancel
	@AndroidFindBy(id = "view_edit_mode_action_bar_negative_text_view")
	public WebElement cancelButton;
	
	// Button - Save view_edit_mode_action_bar_positive_text_view
	@AndroidFindBy(id = "view_edit_mode_action_bar_positive_text_view")
	public WebElement saveButton;

		// Narendra - Pending Task
		// Add all elements, available on screen

	// Button - Energy Advisor
	@AndroidFindBy(id ="form_energy_advisor_switch")
	//(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]/android.widget.Switch[1]")
	//(id ="form_energy_advisor_switch")
	public WebElement energyAdvisorButton;
	
	// Container - Engergy Settings
	@AndroidFindBy(id="form_energy_provider_utility_company_container")
	public WebElement energyContainer;
	
	// Text  - Select Utility?
	@AndroidFindBy(id = "form_energy_provider_selection_text_view")
	public WebElement selectUtilityText;

	// Text - Select Your Rate Plans
	@AndroidFindBy(id = "form_time_of_use_rate_plan_selection_text_view")
	public WebElement selectYourRatePlanText;
	


}
