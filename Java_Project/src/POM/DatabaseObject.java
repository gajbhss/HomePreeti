package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatabaseObject 
{
	// For User name
	public static WebElement username(WebDriver w)
	{
		WebElement u=w.findElement(By.name("userName"));
		return u;
	}
	
	//For password object
	public static WebElement password(WebDriver w)
	{
		WebElement p=w.findElement(By.name("password"));
		return p;
	}
	
	
	//for login button
	public static WebElement login(WebDriver w)
	{
		WebElement l=w.findElement(By.name("login"));
		return l;
	}
	
}
