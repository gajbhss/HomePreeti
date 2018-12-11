package Practice;

import org.openqa.selenium.WebDriver;

public class Alert_Demo {

	public static void Handle_Alert(WebDriver w)
	{
		try
		{
		System.out.println(w.switchTo().alert().getText());
		w.switchTo().alert().accept();
		}
		catch (Exception E)
		{
			System.out.println("No Alert!!!");
		}
	}

}
