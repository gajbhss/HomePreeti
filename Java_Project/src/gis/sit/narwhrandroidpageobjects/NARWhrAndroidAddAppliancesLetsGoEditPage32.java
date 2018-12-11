package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage32 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage32(AppiumDriver driver)
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Connect To WiFi]
	//@AndroidFindBy(name = "Connect To WiFi")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement connect2WifiTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - Connect to your appliance WiFi text
	@AndroidFindBy(id = "provisioning_can_you_see_light")
	public WebElement connect2ApplianceWifiQuestionText;
	
	// Text - Connect to your appliance wifi instruction
	//@AndroidFindBy(name = "Before your appliance is connected, it will act as a WiFi network.You must follow the steps on next screen,then return to the app.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement connect2ApplianceWifiInstruction1Text;

	// Button - Let's Go.
	@AndroidFindBy(id = "provisioning_load_connect_wifi")
	public WebElement letsGoButton;					
									// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage321

	// Button - Connect to the appliance manually
	@AndroidFindBy(id = "provisioning_load_manual_wifi")
	public WebElement connectToApplianceManuallyButton;
									// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage32112

}
