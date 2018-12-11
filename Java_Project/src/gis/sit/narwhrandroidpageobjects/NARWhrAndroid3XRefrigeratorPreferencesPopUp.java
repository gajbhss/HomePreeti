package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroid3XRefrigeratorPreferencesPopUp {
	public NARWhrAndroid3XRefrigeratorPreferencesPopUp(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
