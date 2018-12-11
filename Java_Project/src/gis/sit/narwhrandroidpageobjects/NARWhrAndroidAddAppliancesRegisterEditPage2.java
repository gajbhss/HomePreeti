package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesRegisterEditPage2 
{

	public NARWhrAndroidAddAppliancesRegisterEditPage2(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Register Appliance]
	//@AndroidFindBy(name = "Register Appliance")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement registerApplianceTitleText;

	// Button - Back
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;

	// Text - Instruction Title text [name = Complete the process.]
	//@AndroidFindBy(name = "Complete the process.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement instructionTitleText;

	// Text - Instruction description text[name = Pressing the button below will associate the appliance to your account.]
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement instructionDescriptionText;

	// Button - Finish
	@AndroidFindBy(id = "provisioning_finish_success")
	public WebElement finishButton;
	
	// Button - Next
	@AndroidFindBy(id="find_info_scan_button")
	public WebElement nextButon;
	
	// SAID check
	@AndroidFindBy(id="list_item_appliance_options_header_appliance_said_text_view")
	public WebElement SAIDView;
	
	// SKIP - Button
	@AndroidFindBy(id="fragment_amazon_skip")
	public WebElement skipButton;
	
	// Setup Complete - Description
	@AndroidFindBy(id="txt_congrats_desc")
	public WebElement congratsDescription;
	
	// ADRS - Ok Button
	@AndroidFindBy(id="adrs_congrats_ok")
	public WebElement okButton;
	
	// Text - Register disclaimer text
	@AndroidFindBy(id = "provisioning_reg_disclaimer")
	public WebElement registerDisclaimerText;
}
