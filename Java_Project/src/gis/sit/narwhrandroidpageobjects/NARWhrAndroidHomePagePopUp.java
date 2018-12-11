package gis.sit.narwhrandroidpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NARWhrAndroidHomePagePopUp 
{
	public NARWhrAndroidHomePagePopUp(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		// narWhrAndroidHomePagePopUp
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// PopUp : Text - Settings
	//@AndroidFindBy(name = "Settings")
	@AndroidFindBy(xpath = "//android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public WebElement settingsMenuText; 
	
//	AppiumDriver driver;
//	
//	// Used : Explicit wait
//	// Narendra : Task
//	public WebElement settingsMenuText = (new WebDriverWait(driver, 10))
//			   .until(ExpectedConditions.elementToBeClickable(By.name("Settings")));
}
