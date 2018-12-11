package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TC02_Login_Mutual_Fund {
       WebDriver w;
	@BeforeTest
	  public void precondition () 
	{
		w=new FirefoxDriver();
		w.get("http://demo.testfire.net/bank/login.aspx");
	  }
	
	
	
	@Test
  public void f() throws Exception 
	{
		w.findElement(By.name("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		w.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(4000);
		w.findElement(By.linkText("Sign Off")).click();
	}
  

  @AfterTest
  public void postcondtion()
  {
	  w.quit();
  }
  

}
