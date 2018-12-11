package September;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POM_NewTour_Object_Oops_Concept
{
	//POM Model using oops concepts
	
	public static WebElement username(WebDriver w)
	{
		WebElement u=w.findElement(By.xpath("//input[@name='userName']"));
		return u;
	}
	
	public static WebElement password(WebDriver w)
	{
		WebElement p=w.findElement(By.name("password"));
		return p;
	}
	
	public static WebElement submitButton(WebDriver w)
	{
		WebElement s=w.findElement(By.xpath("//input[@type='image'][@name='login']"));
		return s;
	}
	
	
}

