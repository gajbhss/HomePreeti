package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage2 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage2(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	/*
	 * 
	 * APPLIANCE TYPE >>>> WASHER
	 * 
	 */
	// Text - Title text [name = Select Appliance]
	//@AndroidFindBy(name = "Select Appliance")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement selectApplianceTitleText;
	
	// Button - Back
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - What is the model number? text
	//@AndroidFindBy(name = "What is the model number?")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement modelNumberQuestionText;
	
	// Text - Model number instruction
	//@AndroidFindBy(name = "What is the model of the washer you'd like to add.You can normally find this on the use & care guide or on a label under the lid or door of the appliance.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement modelNumberInstructionText;

	// Radio button - First appliance from list
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[1]")
	public WebElement selectWasherCabrioWTW8700EC0;
	
	// Radio button - Second appliance from list
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]")
	public WebElement selectWasherDuetWFL98HEBU0;
	
	// Button - Next
	@AndroidFindBy(id = "provisioning_skipto_confirm")
	public WebElement nextButton;		// REFER -> NARWhrAndroidAddAppliancesRegisterEditPage1
	
	/*
	 * 
	 * APPLIANCE TYPE >>>> DRYER
	 * 
	 */
	
	//
	@AndroidFindBy(id = "control1")
	public WebElement selectDryerCabrioWED8700EC0_Elec;
	
	//
	@AndroidFindBy(id = "control2")
	public WebElement selectDryerCabrioWGD8700EC0_Gas;
	
	//
	@AndroidFindBy(id = "control3")
	public WebElement selectDryerDuetWEL98HEBU0;
	
	/*
	 * 
	 * APPLIANCE TYPE >>>> Refrigerator
	 * 
	 */
	
	//
	@AndroidFindBy(id = "control1")
	public WebElement selectRefrigeratorGSS26C4XXY0;
	
	//
	@AndroidFindBy(id = "control2")
	public WebElement selectRefrigeratorWRF995FIFZ00;
	

	
}
