package September;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG_DataDriver_Program {
  
	WebDriver w;
	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "test123", "test123" },
	      new Object[] { "123ded", "123dfd" },
	    };
	  }

	@BeforeTest
	  public void beforeTest() 
	{
	w=new FirefoxDriver();
	 w.get("http://demo.testfire.net/bank/login.aspx");
	}
	
	@Test(dataProvider = "dp")
  public void f(String username, String password) {
	 
	    w.findElement(By.name("uid")).clear();
	    w.findElement(By.name("uid")).sendKeys(username);
		w.findElement(By.name("passw")).sendKeys(password);
		w.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
	  
	  
	  
	  
  }
	
  @AfterTest
  public void afterTest() {
  w.quit();
  }

}
