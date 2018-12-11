package September;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver w;
	
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "demo123", "demo123" },
	      new Object[] { "dfdf", "bdf" },
	    };
	  }
	
	@BeforeTest
	  public void beforeTest() {
		w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com/mercurysignon.php");
	  }

	
	@Test(dataProvider = "dp")
  public void f(String n, String s) {
		
w.findElement(By.name("userName")).clear();
  w.findElement(By.name("userName")).sendKeys(n);
  w.findElement(By.name("password")).sendKeys(s);
	
	}
 
  
  @AfterTest
  public void afterTest() {
  w.quit();
  }

}
