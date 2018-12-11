package Appium_Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome {

	public static AppiumDriver driver;
	
	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();				 
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy Note4");	
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	 
			System.out.println("Started"); 
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   		
		System.out.println("ended"); 

	}

}
