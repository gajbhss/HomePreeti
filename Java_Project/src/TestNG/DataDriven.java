package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DataDriven {
  
	WebDriver w;

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "admin", "admin" },
      new Object[] { "", "Demo1234" },
      new Object[] { "sspeed", "Demo1234" },
      new Object[] { "tuser", "tuser" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  w=new FirefoxDriver();
  }

  @Test(dataProvider = "dp")
  public void f(String username, String password)throws Exception {
	    w.get("http://demo.testfire.net/bank/login.aspx");
	    w.findElement(By.name("uid")).clear();
	    w.findElement(By.name("uid")).sendKeys(username);
		w.findElement(By.name("passw")).sendKeys(password);
		w.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
	
		
		
		Thread.sleep(4000);
		
		AlertCode.HandleAlert(w);
		w.findElement(By.linkText("Sign Off")).click();

	  
	  //AlertCode.HandleAlert(w);
  }
    
  
  @AfterTest
  public void afterTest() {
	  w.quit();
  }

}
