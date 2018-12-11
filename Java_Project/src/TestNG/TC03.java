package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TC03 {
  
	WebDriver w;
	@BeforeTest
	  public void Precondtion()
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel 123\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
	  }

	
	
	
	@Test
  public void f() 
	{
		w=new FirefoxDriver();
		w.get("https://www.google.co.in");
		w.quit();
		
		w=new ChromeDriver();
		w.get("https://www.google.co.in");
		w.quit();
		
		
	}
  

	@AfterTest
  public void postcondition()
	{
  
	}

}
