package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSettingsAutoReorderPage {
	public NARWhrAndroidSettingsAutoReorderPage(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// Text - back navigation icon
	//@AndroidFindBy(xpath = "android.widget.ImageButton[@index='0'])")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement settingsBackIcon;
	
	// Text - Appliance available
	//@AndroidFindBy(name = "Settings")
	@AndroidFindBy(xpath = "//android.widget.TextView[@id='list_item_settings_title' and @name='']")
	public WebElement settingsTitleText ;
	
	// Text - About Auto Reorder
	@AndroidFindBy(id = "textview_sign_up")
	public WebElement aboutAutoReorderText;
	
	// Text - Your privacy matters.
	@AndroidFindBy(id ="textview_privacy_matters")
	public WebElement yourPrivacyMattersText;
	
	// Text - Get Started
	@AndroidFindBy(name = "Get started")
//	@AndroidFindBy(xpath = "//android.widget.TextView[@id='list_item_settings_title' and @name='']")
	public WebElement getStartedButton ;
	
	// Button - Agree to Share
	@AndroidFindBy(id = "fragment_applianceClaim_sucess_amazon_begin_button")
	public WebElement agreeToShareButton;
	
	// Text - Disagree to Share
	@AndroidFindBy(id ="text_view_disagree")
	public WebElement disagreeToShareText;	
	
	// Text - Amazon Email
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[5]/android.widget.EditText[1]")
	public WebElement amazonEmailID;
	
	// Text - Amazon Password
	@AndroidFindBy(xpath ="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[7]/android.widget.EditText[1]")
	public WebElement amazonPassword;

	// Checkbox - Amazon Show password
	@AndroidFindBy(xpath ="//*[@class='android.widget.CheckBox'][1]")
	public WebElement amazonShowPassword;
			
	// Checkbox - Amazon Keep me signed in/ Remember me
	@AndroidFindBy(xpath ="//*[@class='android.widget.CheckBox'][2]")
	public WebElement amazonRememberMe;
	
	// Button - Amazon Sign In
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][1]")
	public WebElement amazonSignIn;
	
	// Button - Amazon Sign In
	@AndroidFindBy(xpath ="//*[@class='android.widget.Button'][1]")
	public WebElement amazonNext;
	
	public String signInNoThanks_Name = "acknowledgementDenied";
	public String signInContinue_Name = "acknowledgementApproved";
	
	public String amazonLogin_Id = "ap_email";
	public String amazonPwd_Id = "ap_password";
	public String amazonKeepMeSignedInCheck_Name ="rememberMe";	
	public String amazonSignIn_Id = "signInSubmit";


	public String productRadioButton_Xpath = "//input[@type='radio' and @name='asin']";
	
	public String nextButton_class = "a-column a-span12";
	public String completeSetup_Class = "a-button-inner";
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]")
	public WebElement autoReorderDateButton1;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[2]")
	public WebElement autoReorderDateButton2;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]")
	public WebElement autoReorderDate_Cancel;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAToolbar[1]/UIAButton[2]")
	public WebElement autoReorderDate_Select;

	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAPicker[1]/UIAPickerWheel[1]")
	public WebElement autoReorderDate_PickerWheel;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAStaticText[4]")
	public WebElement autoReorderDate_Now;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[3]")
	public WebElement autoReorder_Washer_Next;
	
	@AndroidFindBy(id="adrs_next")//(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[3]")
	public WebElement autoReorder_Dryer_Done;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[10]")
	public WebElement autoReorder_Washer_Back;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[11]")
	public WebElement autoReorder_Washer_Done;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]")
	public WebElement autoReorder_Washer_SmallLoad;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[4]")
	public WebElement autoReorder_Washer_MediumLoad;
	
	@AndroidFindBy(xpath="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[9]")
	public WebElement autoReorder_Washer_LargeLoad;

	@AndroidFindBy(id="adrs_ok")//(xpath="//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")
	public WebElement autoReorder_Ok;
	
	// Appliance - V10K Dryer
	@AndroidFindBy(name="V10KDryer")
	public WebElement applianceV10KDryer;
	
	// Apliance - V10K Washer
	@AndroidFindBy(name="V10KWasher")
	public WebElement applianceV10KWasher;
	
	// Text - Discontinue Auto Reorder
	@AndroidFindBy(name="Discontinue Auto Reorder")
	public WebElement discontinueAutoReorderText;
	
	// Button - Discontinue
	@AndroidFindBy(id="adrs_discontinue")
	public WebElement adrsDiscontinueButton;
	
	// Button - Discontinue
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement okButton;

}
