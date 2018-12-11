package com.whirlpool.pages;

import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll_Up_Down 
{
	AppiumDriver driver;

	//Every Day, care
	By Every_Day_Care= By.xpath("//android.widget.TextView[@text='Every day, care®']");
	
	public Scroll_Up_Down(AppiumDriver driver)
	{
		this.driver=driver;
	}
	
	public void sroll_App() throws Exception
	{
	 	//System.out.println("Algeria text found :"+driver.findElement(By.xpath("//android.widget.TextView[@text='Algeria']")).isDisplayed());
	 	AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.ListView"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Service & Support\"));"));
        assertNotNull(listGroup.getLocation());
        System.out.println("Every day, care® : "+listGroup.isDisplayed());
		
	}
	

    

}
