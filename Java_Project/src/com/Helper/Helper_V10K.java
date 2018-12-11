package com.Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Helper_V10K 
{
	 public static AndroidDriver driver;
	 
	 
		
	 
	public void forceWait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void forceWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void forceWait(WebElement element) {
		waitForElement(element);
	}
	
	
public void waitForElement(WebElement value) {
		
		// wait for field
		WebDriverWait wait = new WebDriverWait(driver, 90);
		
		wait.until(ExpectedConditions.visibilityOf(value));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(".");
	}
}
