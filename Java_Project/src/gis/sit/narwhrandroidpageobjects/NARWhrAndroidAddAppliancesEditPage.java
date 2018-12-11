package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesEditPage 
{

	public NARWhrAndroidAddAppliancesEditPage(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		// narWhrAndroidAddAppliancesEditPage
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Setup Appliance]
	//@AndroidFindBy(xpath = "//android.widget.TextView[index='1']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement setupApplianceTitleText;
	
	// Button - Back
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel") // path = ""
	public WebElement closeButton;
	
	// Button - Cancel
	@AndroidFindBy(id = "buttonDefaultNegative")
	public WebElement cancelButton;
	
	// Text - Get Started text
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement getStartedText;
	
	// Text - Get Started instruction OR CLAIMING INSTRUCTIONS
	//@AndroidFindBy(name = "Ok, once you've got your appliance installed let's get it connected to internet.Watch the video below to see an example of the steps to get online.")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement getStartedInstructionText;

	// Button - Video button
	@AndroidFindBy(id = "provisioning_video_button") // xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.ImageButton[1]"
	public WebElement videoButton;
	
	// Button - Let's Go
	@AndroidFindBy(id = "provisioning_next_page") // xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"
	public WebElement letsGoButton;		// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage1
	
	// Button - Register Appliance OR ALREADY CONNECTED
	@AndroidFindBy(id = "provisioning_skipto_confirm_main") // xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"
	public WebElement registerApplianceButton;
										// REFER -> NARWhrAndroidAddAppliancesRegisterEditPage1

	// Button - Manually Enter Code
	@AndroidFindBy(id = "provisioning_scan_text3") // xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"
	public WebElement manuallyEnterCode;
	
	// Button - Manually Enter Code
	@AndroidFindBy(xpath = "//*[contains(@text, 'Scan SAID')]") 
	public WebElement scanSAIDScreen;
	
	// SAID Image
	@AndroidFindBy(className = "android.widget.ImageView") 
	public WebElement SAIDImage;
	
	// Button - Can't Find Code ?
	@AndroidFindBy(id = "provisioning_scan_text1") 
	public WebElement cantFindCode;
	
	// Button - Can't Find Code ?
	@AndroidFindBy(id = "zxing_viewfinder_view") 
	public WebElement QRCamera;
}
