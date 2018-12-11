package com.guru99.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_Dashboard
{
	static WebDriver driver;
	
	public Guru99_Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Log out']")
	public static WebElement logout;
}
