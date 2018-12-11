package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class AssertionCode {
  
	WebDriver w;
	SoftAssert st=new SoftAssert();
	
	
	@BeforeTest
	  public void precondition() {
		w=new FirefoxDriver();
	  }
	
	
	@Test
	public void loginsteps() throws Exception {
		w.get("http://demo.testfire.net/bank/login.aspx");
		
		//Validate page title
		st.assertEquals(w.getTitle(), "Mutual Fund :  Login");
	
	    w.findElement(By.name("uid")).clear();
	    w.findElement(By.name("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		w.findElement(By.xpath("html/body/div[2]/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(4000);
		
		WebElement usertitle=w.findElement(By.xpath(".//*[@id='wrapper']/table/tbody/tr[2]/td[2]/div/h1"));
		
		//Validate User Title
		String str="Mutual Fund : Home";
		st.assertEquals(w.getTitle(), str);
		
		st.assertEquals(usertitle.getText(), "Hello Admin User");
		w.findElement(By.linkText("Sign Off")).click();

		//For output
		st.assertAll();
	}
 
  
  
	@AfterTest
	public void postcondition() {
		w.quit();
	}

}
