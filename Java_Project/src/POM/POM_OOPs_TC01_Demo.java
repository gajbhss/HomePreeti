package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM_OOPs_TC01_Demo {

	public static void main(String[] args) throws Exception 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com/");
		Thread.sleep(4000);
		
		Object_repositoryz_Oops_concept_demo1.username(w).sendKeys("demo1");
		Object_repositoryz_Oops_concept_demo1.password(w).sendKeys("demo1");
		Object_repositoryz_Oops_concept_demo1.login_button(w).click();
		
		
		
		try
		{
		Thread.sleep(4000);
		Object_repositoryz_Oops_concept_demo1.sign_out(w).click();
		System.out.println("Passed");
		}
		
		catch(Exception e)
		{
			System.out.println("Fails");
		}
		
		
		
		w.quit();
	}

}
