package TestNG_Demo;

import org.openqa.selenium.WebDriver;

public class Alart 
{
	public static void HandleAlart(WebDriver w)
	{
		
		try
		{
			System.out.println(w.switchTo().alert().getText());
			w.switchTo().alert().accept();
		}
		
		catch (Exception E)
		{
			System.out.println("There is not aleart" );
		}
		
		
		
		
		
	}
	

}
