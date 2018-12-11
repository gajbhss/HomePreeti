package TestNG_Demo;

import org.testng.annotations.Test;

import TestNG.AlertCode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  
	WebDriver driver;
	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "admin", "admin" },
	      new Object[] { "", "Demo1234" },
	      new Object[] { "tuser", "tuser" },
	    };
	  }
	  
	@BeforeTest
	  public void beforeTest() throws Exception
	{
		driver=new FirefoxDriver();		
	  }

	
	@Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException
	{
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 driver.findElement(By.name("uid")).clear();
		    driver.findElement(By.name("uid")).sendKeys(username);
			driver.findElement(By.name("passw")).sendKeys(password);
			driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		
			
			
			Thread.sleep(4000);
			
			AlertCode.HandleAlert(driver);
			driver.findElement(By.linkText("Sign Off")).click();

  }


  @AfterTest
  public void afterTest() 
  {
	  	driver.quit();
  }

}
