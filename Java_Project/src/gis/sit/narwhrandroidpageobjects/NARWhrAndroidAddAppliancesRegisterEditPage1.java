package gis.sit.narwhrandroidpageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NARWhrAndroidAddAppliancesRegisterEditPage1 
{

	public NARWhrAndroidAddAppliancesRegisterEditPage1(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		// narWhrAndroidAddAppliancesRegisterEditPage1
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Title text [name = Enter SAID]
	//@AndroidFindBy(name = "Enter SAID")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement enterSAIDTitleText;
	
	// Button - Close
	@AndroidFindBy(id = "fragment_provisioning_cancel")
	public WebElement closeButton;
	
	// Text - What is the SAID? text
	//@AndroidFindBy(name = "What is the SAID?")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]	")
	public WebElement SAIDQuestionText;
	
	//Scan Details Text
	@AndroidFindBy(id = "provisioning_find_said_title")
	public WebElement scanDetailsText;
	
	
	// Text - SAID instruction text [name = The SAID is a unique, identification number for your appliance.On the Washer & Dryer,it is located below the lid or Door.Please enter it in the field below or tap the camera icon to scan the label with your phone's camera.Here is an example of what the label looks like.]
	@AndroidFindBy(id = "provisioning_find_said_text")
	public WebElement SAIDInstructionText;			
	
	// Image - First appliance from list
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	public WebElement QRCodeImage;
	
	// Image - Camera
	@AndroidFindBy(id = "fragment_provisioning_get_qr_code_button")
	public WebElement cameraImage;
	
	// Text - Enter SAID 
	@AndroidFindBy(id = "enter_manual_said_text")
	public WebElement enterSAID;
	
	
	// Text - Enter SAID 
	@AndroidFindBy(id = "enter_manual_mac_text")
	public WebElement enterMACID;
	
	// Button - Next
	@AndroidFindBy(id = "provisioning_scan_next_button")
	public WebElement nextButton;		
								// REFER -> NARWhrAndroidAddAppliancesRegisterEditPage2


}
