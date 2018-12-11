package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage3211 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage3211(AppiumDriver driver)
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Connection Confirm]
	//@AndroidFindBy(name = "Connection Confirm")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement connection2ConfirmTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - Can you see the connect light?on the appliance? Is it solid? text
	@AndroidFindBy(id = "provisioning_can_you_see_light")
	public WebElement canYouSeeLightText;
	
	// Text - Wifi network icon
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement wifiNetworkIcon;
	
	// Text - Wifi connection indicator instruction
	//@AndroidFindBy(name = "The connect light may go out briefly, but it will come back on and should remain lit.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement wifiConnectionIndicatorText;
	
	// Button - Yes
	@AndroidFindBy(id = "provisioning_confirm")
	public WebElement yesButton;		
									// REFER -> NARWhrAndroidAddAppliancesRegisterEditPage2
	
	// Text - Don't worry! You will still be able to setup!
	@AndroidFindBy(name = "Don't worry! You will still be able to setup!")
	public WebElement stillBeAbleToSetupText;
	
	// Button - No
	@AndroidFindBy(id = "provisioning_load_manual_wifi")
	public WebElement noButton;			
									// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage32112
}
