package Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver w;
	@BeforeTest
	  public void beforeTest() 
	  {
		  
		  w=new FirefoxDriver();
	  }
	
	
	
  @Test
  public void f() throws InterruptedException 
  {
	  w.get("http://demo.testfire.net/bank/login.aspx");   
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		
		
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(4000);
	 
  }
   
  
  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
