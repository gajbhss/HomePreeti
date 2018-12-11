package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage321121 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage321121(AppiumDriver driver)
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Manually Connect]
	//@AndroidFindBy(name = "Manually Connect")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement manuallyConnectTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - Verify appliance is connected text
	//@AndroidFindBy(name = "Verify appliance is connected")
	@AndroidFindBy(id = "provisioning_wifi_manual_title")
	public WebElement instructionsTitleText;
	
	// Text - 1.Look for solid WiFi icon. text
	@AndroidFindBy(id = "provisioning_wifi_detail")
	public WebElement wifiDetailText;
	
	// Text - Instruction description text
	@AndroidFindBy(id = "provisioning_wifi_manual_desc")
	public WebElement instruction1Text;
	
	// Image - Wifi icon image
	@AndroidFindBy(id = "provisioning_wifi_manual_image")
	public WebElement wifiIconImage;
	
	// Button - Next
	@AndroidFindBy(id = "provisioning_next_page")
	public WebElement nextButton;				
								// REFER -> NARWhrAndroidAddAppliancesRegisterEditPage2

}
