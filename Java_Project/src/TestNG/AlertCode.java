package TestNG;

import org.openqa.selenium.WebDriver;

public class AlertCode 
{
	public static void HandleAlert(WebDriver w5)
	{
		try
		{
		System.out.println(w5.switchTo().alert().getText());
		w5.switchTo().alert().accept();
	
		}
		
		catch(Exception E)
		{
			System.out.println("No Alert!!!");
		}
	}
}
