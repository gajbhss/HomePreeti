package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM_Test_Case_1_Login {

	public static void main(String[] args) 
	{
		
		WebDriver w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com/");
		w.manage().window().maximize();
		
		DatabaseObject.username(w).sendKeys("demo1");
		DatabaseObject.password(w).sendKeys("demo1");
		DatabaseObject.login(w).click();
		
		w.quit();
	}

}
