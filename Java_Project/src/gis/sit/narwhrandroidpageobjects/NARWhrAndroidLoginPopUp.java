package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidLoginPopUp 
{
	// Constructor
	public NARWhrAndroidLoginPopUp(AndroidDriver ad) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(ad), this);
	}

	/**************************************************************************
	 * 			   				Login  : Alert 								  *
	 * 			   															  *
	 **************************************************************************/

	// Note - Need to discuss 
	// 1. How to identify the error alert messages?

	
	/**************************************************************************
	 * 					Login pop-up : Login in-progress					  *
	 * 			   															  *
	 **************************************************************************/

	// Text - Login in-progress title text[name=Login]
	@AndroidFindBy(id = "titleFrame")
	public WebElement loginPopUpInProgressTitleText;
	
	// Text - Login in-progress progress bar image
	@AndroidFindBy(id = "progress")
	public WebElement loginPopUpInProgressProgressBar;

	// Text - Login in-progress content text[name=Please wait while we log you in]
	@AndroidFindBy(id = "content")
	public WebElement loginPopUpInProgressContentText;
	
	
	/**************************************************************************
	 * 			Login pop-up : Login failed [In-valid & valid credentials]	  *
	 * 			   															  *
	 **************************************************************************/

	// Text - Login Failed text[id=title]
	@AndroidFindBy(id = "title")
	public WebElement loginPopUpFailedTitleText;
	
	// Text - Login failed content text[name=Please try again later.] [name=The username and / or password are incorrect. Please try again.]
	@AndroidFindBy(id = "content")
	public WebElement loginPopUpFailedContentText;
	
	// Button - Login failed "OK" button
	@AndroidFindBy(id = "buttonDefaultPositive")
	public WebElement loginPopUpFailedDefaultPositiveButton;
	
	
	/**************************************************************************
	 * 			Login pop-up : Login failed[ credentials]					  *
	 * 			   															  *
	 **************************************************************************/

}
