package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage32112 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage32112(AppiumDriver driver)
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
	
	// Text - Open your Wifi settings. instruction title text
	//@AndroidFindBy(name = "Open your Wifi settings.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement instructionsTitleText;
	
	// Text - On your mobile device, laptop or desktop. instruction description
	//@AndroidFindBy(name = "On your mobile device, laptop or desktop.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement instructionsDescriptionText;
	
	// Text - First instruction text
	//@AndroidFindBy(name = "1.Look for a network named similarly to WP_11_22_33_44.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[3]")
	public WebElement instruction1Text;
	
	// Text - First instruction description text
	//@AndroidFindBy(name = "(The number will match the MAC ID on your SAID label)")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[4]")
	public WebElement instruction1DescriptionText;
	
	
	// Text - Second instruction text
	//@AndroidFindBy(name = "2.Connect to network.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[5]")
	public WebElement instruction2Text;
	
	// Text - Second instruction description text[name = The network password will be the SAID.If you'd like yo can copy the SAID to the clipboard and paste it in to the password field(mobile device).]
	@AndroidFindBy(id = "provisioning_copy_said_new")
	public WebElement instruction2DescriptionText;
	
	// Text - Third instruction text
	//@AndroidFindBy(name = "3.Open the browser.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[7]")
	public WebElement instruction3Text;
	
	// Text - Third instruction description text
	//@AndroidFindBy(name = "Go to the address 192.168.10.1 ?Enter your network credentials into the webpage.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[8]")
	public WebElement instruction3DescriptionText;
	
	// Button - Next
	@AndroidFindBy(id = "provisioning_next_page")
	public WebElement nextButton;	
								// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage321121

}
