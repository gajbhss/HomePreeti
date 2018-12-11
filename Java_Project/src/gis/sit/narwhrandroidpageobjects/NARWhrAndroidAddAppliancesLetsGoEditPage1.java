package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage1 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage1(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Select Appliance]
	//@AndroidFindBy(name = "Select Appliance")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement selectApplianceTitleText;
	
	// Button - Back
	@AndroidFindBy (xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - What type of appliance are you connecting? text
	//@AndroidFindBy(name = "What type of appliance are you connecting?")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement applianceTypeQuestionText;
	
	// Text - Appliance connection instruction
	//@AndroidFindBy(name = "Ok, once you've got your appliance installed let's get it connected to internet.Watch the video below to see an example of the steps to get online.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement applianceConnectionInstructionText;

	// Radio button - Washer
	//@AndroidFindBy(name = "Washer")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]")
	public WebElement washerRadioButton;

	// Radio button - Dryer
	//@AndroidFindBy(name = "Dryer")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]")
	public WebElement dryerRadioButton;

	// Radio button - Refrigerator
	//@AndroidFindBy(name = "Refrigerator")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[3]")
	public WebElement refrigeratorRadioButton;
	
	// Radio button - Dishwasher
	//@AndroidFindBy(name = "Dishwasher")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[4]")
	public WebElement dishwasherRadioButton;
	
	// Button - Next
	@AndroidFindBy(id = "provisioning_finish_success1")
	public WebElement nextButton;			// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage2

}
