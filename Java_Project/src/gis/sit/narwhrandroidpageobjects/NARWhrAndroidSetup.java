package gis.sit.narwhrandroidpageobjects;


import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import gis.sit.narwhrandroidpageobjects.NARWhrAndroidLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class NARWhrAndroidSetup 
{
	AppiumDriver<WebElement> driver;
	//NARWhrAndroidHomePage objAndroidHomePage;
	
	@BeforeClass
    public void setUp() throws Exception 
	{
        //File classpathRoot = new File(System.getProperty("user.dir"));
        //File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
        File appDir = new File("/Users/CA_Macbook/Documents/My_workspace/pom_android_appium/SIT-TestAutomation/Apps/Android/");
        File app = new File(appDir, "whirlpoolapp_staging.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","FA3BESC04969");
        capabilities.setCapability("platformVersion", "4.3");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.whirlpool.android.smartwp.staging");
        capabilities.setCapability("appActivity", "com.whirlpool.android.smartgrid.controller.home.LaunchActivity");
        
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
    @Test
    public void test_whirlpool_app_demo() throws InterruptedException
    {
    	//objAndroidHomePage = new NARWhrAndroidHomePage(driver);
    	//WebElement buttonSignup = driver.findElementById("fragment_login_sign_up_button");
    	//hp.emailId.sendKeys("someone@testvagrant.com");
    	//hp.buttonSignup.click();
    	//buttonSignup.click();
    	// Initial driver.

        // Use PageFactory to init elements.
    	//NARWhrAndroidHomePage hp = PageFactory.initElements(driver, NARWhrAndroidHomePage.class);
    	//hp.login();
    	 	
    	
    	WebElement emailId = driver.findElementById("form_login_email_edittext");
    	emailId.clear();
    	System.out.println("");
    	System.out.println("Steps:");
    	System.out.println("1. Enter email");
		emailId.sendKeys("invalid@gmail.com");
		
		WebElement passWord = driver.findElementById("form_login_password_edittext");
		passWord.clear();
		System.out.println("2. Enter password");
		passWord.sendKeys("Smart2000");
		
		WebElement signIn = driver.findElementById("form_login_button");
		signIn.click();
		
		WebElement popupTitle = driver.findElementById("title");
		Assert.assertEquals(popupTitle.getText(), "Login");
		//driver.wait();
		//Assert.assertEquals(popupTitle.getText(), "Login Failed");
		System.out.println("");
		
		driver.findElementById("buttonDefaultPositive").click();
		System.out.println("Whirlpool - Login[In-valid]) -- Success !");
		
		
		
		emailId.clear();
		System.out.println("");
		System.out.println("");
    	System.out.println("Steps:");
    	System.out.println("1. Enter email");
		//emailId.sendKeys("whrautomation@gmail.com");
		emailId.sendKeys("automation@mailinator.com");
		
		passWord.clear();
		System.out.println("2. Enter password");
		passWord.sendKeys("Automation");
		
		signIn.click();
		
		WebElement homeTitle = driver.findElementById("psts_tab_title");
		Assert.assertEquals(homeTitle.getText(), "Appliances");

		System.out.println("");
		System.out.println("Whirlpool - Login[Valid]) -- Success !");
    }


    @AfterClass	
    public void tearDown() throws Exception 
    {
        driver.quit();
    }
    

}
