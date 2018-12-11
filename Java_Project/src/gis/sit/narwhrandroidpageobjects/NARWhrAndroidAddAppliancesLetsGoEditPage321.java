package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage321 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage321(AppiumDriver driver)
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Connect To WiFi]
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement connect2WifiTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - WiFi Network (SSID) text
	//@AndroidFindBy(name = "WiFi Network (SSID)")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement wifiNetworkText;
	
	// Text - Connect to your appliance wifi instruction
	@AndroidFindBy(id = "fragment_provisioning_wifi_button")
	public WebElement wifiNetworkInputBox;
	
	// Text - Password
	//@AndroidFindBy(name = "Password")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement passwordText;
	
	// Text - Password input
	@AndroidFindBy(id = "provisioning_inapp_password_edittext")
	public WebElement passwordInputBox;
	
	// Text - Network Security
	//@AndroidFindBy(name = "Network Security")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[3]")
	public WebElement networkSecurityText;
	
	// Checkbox - Remember WIFI details
	@AndroidFindBy(id = "provisioning_inapp_remember_wifi")
	public WebElement rememberWifiDetailsCheckbox;
	
	// Button - Next
	@AndroidFindBy(id = "provisioning_inapp_connect_to_appliance")
	public WebElement nextButton;			
									// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage3211


}
