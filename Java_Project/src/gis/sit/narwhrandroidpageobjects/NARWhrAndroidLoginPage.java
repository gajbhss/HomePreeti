package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidLoginPage 
{
	// 
	public NARWhrAndroidLoginPage(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}	
	
	// Whirlpool icon
	@AndroidFindBy(id="whirlpool_logo_large")
	public WebElement whirlpoolLogo;
	
	// Email address
	@AndroidFindBy(id="form_login_email_edittext")
	public WebElement emailId;
	/*WebElement emailId = driver.findElementById("form_login_email_edittext");
	emailId.clear();
	System.out.println("Steps:");
	System.out.println("1. Enter email");
	emailId.sendKeys("invalid@gmail.com");*/
	
		
	// Password
	@AndroidFindBy(id="form_login_password_edittext")
	public WebElement passWord;
	
	// Sign-In button
	@AndroidFindBy(id="form_login_button")
	public WebElement signIn;
		
	// Remember me
	@AndroidFindBy(id="form_login_remember_me_checkbox")
	public WebElement stayLoggedIn;
		
	// Forgot password
	@AndroidFindBy(id="form_login_forgot_password")
	public WebElement forgotPassword;
	
	// Sign-up button	
	@AndroidFindBy(id="fragment_login_sign_up_button")
	public WebElement buttonSignup;

	public void login()
	{
		emailId.clear();
		emailId.sendKeys("naren@whirlpool.com");
		passWord.clear();
		passWord.sendKeys("123456");
		signIn.click();
	}
}
