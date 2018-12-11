package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Object_repositoryz_Oops_concept_demo1 
{

	//Entering user name
	public static WebElement username(WebDriver w)
	{
		WebElement u=w.findElement(By.name("userName"));
		return u;
	}
	
	
	//Entering password
	public static WebElement password(WebDriver w)
	{
		WebElement p=w.findElement(By.name("password"));
		return p;
	}
	
	
	//CLick on Login button
	public static WebElement login_button(WebDriver w)
	{
		WebElement lg=w.findElement(By.name("login"));
		return lg;
		
	}
	
	public static WebElement sign_out(WebDriver w)
	{
		WebElement out=w.findElement(By.linkText("SIGN-OFF"));
		return out;
		
	}

	public static WebElement one_way_radio(WebDriver w)
	{
		WebElement radio_1=w.findElement(By.cssSelector("input[value=oneway]"));
		return radio_1;
		
	}
	
	
	public static WebElement preferences(WebDriver w)
	{
		WebElement business=w.findElement(By.cssSelector("input[value=Business]"));
		return business;
	}
	
	public static WebElement findbutton(WebDriver w)
	{
		WebElement continue_button=w.findElement(By.xpath("//input[@name='findFlights']"));
		return continue_button;
		
	}
	
}
