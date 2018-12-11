package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TC01 {
	
	WebDriver driver;
	@BeforeTest
	  public void precondition() 
	  {
		driver=new FirefoxDriver();		
	  }
	
	@Test
  public void Login() throws Exception 
  	 {
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("admin");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(4000);	
		driver.findElement(By.linkText("Sign Off")).click();
	 }
  

  @AfterTest
  public void postexection() 
  {
	  driver.quit();
  }

}
