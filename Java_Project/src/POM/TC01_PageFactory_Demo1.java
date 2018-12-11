package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TC01_PageFactory_Demo1 {

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver w=new FirefoxDriver();
		PageFactory.initElements(w, Database_FaceFactory_Demo1.class);
		w.get("http://newtours.demoaut.com/");
		Thread.sleep(4000);
		
		Database_FaceFactory_Demo1.username.sendKeys("demo1");
		Database_FaceFactory_Demo1.password.sendKeys("demo1");
		Database_FaceFactory_Demo1.login.click();
		
		try
		{
		Thread.sleep(4000);
		Database_FaceFactory_Demo1.sige_out.click();
		System.out.println("Passed");
		}
		catch(Exception e)
		{
			System.out.println("Failed");
		}
		
		w.quit();
		
		
		
		
		
	}

}
