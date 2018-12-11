package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Mutual_Fund_POM {
	
	WebDriver w;
	
	@BeforeTest
	  public void beforeTest() throws Exception 
	{
		w=new FirefoxDriver();
		w.get("http://demo.testfire.net/bank/login.aspx");
		Thread.sleep(4000);
		w.manage().window().maximize();
	}
	
		
	@Test
  public void login() throws Exception
	{
		Mutual_Fund_Object_Repository_Oops_Concept.username(w).sendKeys("admin");
		Mutual_Fund_Object_Repository_Oops_Concept.password(w).sendKeys("admin");
		Mutual_Fund_Object_Repository_Oops_Concept.login_button(w).click();
		Thread.sleep(4000);
		System.out.println("Login Successfull");
	}
  
	@Test
	  public void feedback_link() throws Exception
		{
		Mutual_Fund_Object_Repository_Oops_Concept.feedback(w).click();
		Thread.sleep(4000);
		System.out.println("Feedback link is working properly.. ");	
		
		}

	@Test
	public void fill_up_form() throws Exception
	{
		Mutual_Fund_Object_Repository_Oops_Concept.name(w).clear();
		Mutual_Fund_Object_Repository_Oops_Concept.name(w).sendKeys("Sanket");
		Mutual_Fund_Object_Repository_Oops_Concept.email(w).sendKeys("abc@gmail.com");
		Mutual_Fund_Object_Repository_Oops_Concept.subject(w).sendKeys("For Fixed deposit ");
		Mutual_Fund_Object_Repository_Oops_Concept.commnet(w).sendKeys("Deposition ammount");
		Mutual_Fund_Object_Repository_Oops_Concept.submit_Button(w).click();
		Thread.sleep(4000);
		System.out.println("Form submit succesfully");
	}
	
	
	@Test
	public void Log_out()
	{
		Mutual_Fund_Object_Repository_Oops_Concept.log_out(w).click();
	}
	
  @AfterTest
  public void AfterTest()
  {
	  w.quit();
  }

}
