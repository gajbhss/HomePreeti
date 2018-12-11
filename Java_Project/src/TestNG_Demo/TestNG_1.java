package TestNG_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG_1 {

	WebDriver w;
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { " ", "demo1" },
	    };
	  }
	
	
  @BeforeTest
  public void beforeTest() 
  {
	w=new FirefoxDriver();	
  }
   
  
  @Test(dataProvider = "dp")
  public void login_Alert(String n, String s) throws Exception
  {
	  	w.get("http://login.globalglaze.in/");
		w.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor je=(JavascriptExecutor) w;
		je.executeScript("window.scrollBy(0, 1000)");
		
		w.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_usernm']")).sendKeys(n);
		w.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_adminpassword']")).sendKeys(s);
		w.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_btn_go']")).click();
		
		Thread.sleep(5000);
		
		Alert_Demo.HandleAlert(w);
		
		
		
		
		
  }


  
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }

}
