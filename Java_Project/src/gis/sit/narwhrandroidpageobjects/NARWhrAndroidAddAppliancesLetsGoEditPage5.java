package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage5 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage5(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Register Appliance]
	//@AndroidFindBy(name = "Register Appliance")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement registerApplianceTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - Complete the process. text
	//@AndroidFindBy(name = "Complete the process.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement completeTheProcessQuestionText;
	
	// Text - Complete the process instruction
	//@AndroidFindBy(name = "Pressing the button below will associate the appliance to your account.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement completeTheProcessInstructionText;
	
	// Button - Finish
	@AndroidFindBy(id = "provisioning_finish_success")
	public WebElement finishButton;

	// Text - Process Completed Disclaimer text [name = Adding an appliance to your account will also complete the product registration process for that appliance. For more information on product registration, visit here.]
	@AndroidFindBy(id = "provisioning_reg_disclaimer")
	public WebElement processCompletedDisclaimerText;
	

}
