package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestNG_Tours_Page_Factory
{
	
	@Test
	public void login() throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TestNG_Tours_objects_Page_Factory obj=PageFactory.initElements(driver, TestNG_Tours_objects_Page_Factory.class);
		obj.LoginTOToursWebSite("demo1", "demo1");
		
		driver.quit();
		
	}
	
	
		
	
	
}
