package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidSettingsAboutPage {
	public NARWhrAndroidSettingsAboutPage(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
		// Text - Energy Report details page
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
		public WebElement aboutTitleText;
			
		// Image - Energy report details appliance image
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
		public WebElement aboutWhirlpoolText;
			
		// Text - Energy report details appliance name text[Clothes Dryer,Clothes Washer,Refrigerator]
		@AndroidFindBy(id = "fragment_about_version")
		public WebElement aboutVersionText;
		
		// Button - Terms & Conditions
		@AndroidFindBy(id = "terms_show")
		public WebElement aboutTermsAndConditionsButton;
		
		// Button - Terms & Conditions
		@AndroidFindBy(id = "policy_show")
		public WebElement aboutPrivacyStatmentButton;

		// Button - Terms & Conditions
		@AndroidFindBy(id = "text_copyright")
		public WebElement aboutAllRightsReservedText;
		
		// Button - Cancel
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
		public WebElement aboutCancelButton;
		
}
