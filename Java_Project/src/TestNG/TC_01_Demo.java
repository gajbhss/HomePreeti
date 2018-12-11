package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TC_01_Demo {
 
	WebDriver w;
	 @BeforeTest
	  public void beforeTest()
	 {
		 w=new FirefoxDriver();
		 w.get("http://newtours.demoaut.com/");
		 
	 }

	@Test
  public void f() throws Exception 
	{
		w.findElement(By.name("userName")).sendKeys("demo1");
		w.findElement(By.name("password")).sendKeys("demo1");
		w.findElement(By.name("login")).click();
		
		try
		{
		Thread.sleep(4000);
		w.findElement(By.linkText("SIGN-OFF")).click();
		}
		catch(Exception e)
		{
			System.out.println("Failed");
		}
	}
 
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
