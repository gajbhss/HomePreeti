package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage4 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage4(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Connection with WPS]
	//@AndroidFindBy(name = "Connection with WPS")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement connect2WPSTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - Press the WPS button on your router. text
	@AndroidFindBy(id = "provisioning_wps_support_connect_title")
	public WebElement pressWPSButtonQuestionText;
	
	// Text - Press WPS button instruction
	@AndroidFindBy(id = "provisioning_wps_support_indicatorlight")
	public WebElement pressWPSButtonInstruction1Text;

	// Image - Router image
	@AndroidFindBy(id = "provisioning_wps_support_indicatorlight_image")
	public WebElement routerConnectImage;

	// Text - WIFI icon instruction
	@AndroidFindBy(id = "provisioning_wps_support_wifi")
	public WebElement pressWPSButtonInstruction2Text;

	// Image - WIFI icon image
	@AndroidFindBy(id = "provisioning_wps_support_wifi_image")
	public WebElement wifiIconImage;

	// Text - Paired instruction
	//@AndroidFindBy(name = "The lights may turn off breifly,but once paired,both will stop blinking and the WiFi icon on the appliance will remain lit")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[4]")
	public WebElement pressWPSButtonInstruction3Text; 

	// Button - Light Is Solid,Next.
	@AndroidFindBy(id = "provisioning_finish_wps")
	public WebElement nextButton;		
								// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage5
	
	// Button - Light Is Off.Try Something Else?Try Something Else? [id = provisioning_open_wifi_help]
	@AndroidFindBy(id = "provisioning_open_wifi_help")
	public WebElement trySomethingElseButton;	
								// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage32

}
