package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidAddAppliancesLetsGoEditPage3 
{
	public NARWhrAndroidAddAppliancesLetsGoEditPage3(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Connect To WiFi]
	//@AndroidFindBy(name = "Connect To WiFi")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement connectToWifiTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - Is your router WPS compatible? text
	//@AndroidFindBy(name = "Is your router WPS compatible?")
	@AndroidFindBy(id = "provisioning_wps_support_query")
	public WebElement routerCompatibleQuestionText;
	
	// Text - Router compatible instruction
	//@AndroidFindBy(name = "Most modern routers have ability to connect to WiFi devices automatically by pressing a WPS button. While the location may vary by device,the button should have this symbol below.Did you find it?")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public WebElement routerCompatibleInstructionText;

	// Image - Processing image
	//@AndroidFindBy(xpath = "android.widget.ImageView[index='2']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement processImageButton;
	
	// Button - Yes,I have WPS. text
	@AndroidFindBy(xpath = "provisioning_next_page")
	public WebElement haveWPSButton;		
									// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage4
	
	// Button - No/Don't Know.Try Something Else? [id = provisioning_open_wifi_help]
	@AndroidFindBy(id = "provisioning_open_wifi_help")
	public WebElement trySomethingElseButton;		
									// REFER -> NARWhrAndroidAddAppliancesLetsGoEditPage32


}
