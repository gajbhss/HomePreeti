package WedDriver_Code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class WebSite_Test_TestNG_Report {
  
	WebDriver w;
	@BeforeTest
	  public void beforeTest()
		{
		w=new FirefoxDriver();
	  }
	
	
	@Test
     public void login_page() throws Exception 
	{
		w.get("http://newtours.demoaut.com/mercurysignon.php");
		w.manage().window().maximize();
		Thread.sleep(5000);
		
		w.findElement(By.name("userName")).sendKeys("demo1");
		w.findElement(By.name("password")).sendKeys("demo1");
		w.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	
//	@Test
//    public void radio_button_count() throws Exception 
//	{
//		List<WebElement> radio=w.findElements(By.cssSelector("input[type=radio]"));
//		System.out.println("Total Radio buttons are :"+radio.size());
//
//	}
//	
//	@Test
//    public void drop_down_count() throws Exception 
//	{
//		List<WebElement> drop=w.findElements(By.tagName("select"));
//		System.out.println("Total Drop down count is :"+drop.size());
//	}
//
//  
//	@Test
//	public void select_Trip_type()
//	{
//		w.findElement(By.cssSelector("input[value=oneway]")).click();
//		System.out.println("ONe way trip selected");
//	}
//	
//
//	@Test
//	public void select_Passenger() throws InterruptedException
//	{
//		WebElement passagener=w.findElement(By.cssSelector("select[name=passCount]"));
//		
//		Select s=new Select(passagener);
//		
//		List<WebElement> li=s.getOptions();
//		
//		for(int i=0;i<li.size();i++)
//		{
//			System.out.println(li.get(i).getText());
//		}
//		
//		s.selectByIndex(2);
//		System.out.println("Selectec Passager count is :"+ li.get(2).getText());
//		Thread.sleep(9000);
//	}
//	
//	
//	@Test
//	public void Departing_From() throws InterruptedException
//	{
//		WebElement drop=w.findElement(By.cssSelector("select[name=fromPort]"));
//		Select s=new Select(drop);
//		
//		List<WebElement> li= s.getOptions();
//		
//		System.out.println("Count is : "+li.size());
//		
//		for(int i=0;i<li.size();i++)
//		{
//			System.out.println(li.get(i).getText());
//		}
//		
//	}
//	
//	
	@Test
	public void Airline() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement e3=w.findElement(By.xpath("//select[@name='airline']"));
		Select s3=new Select(e3);
		
		List<WebElement> airline_list=s3.getOptions();
		
		for(int i=0;i<airline_list.size();i++)
		{
			System.out.println(airline_list.get(i).getText());
		}
		
		s3.selectByIndex(4);
		
	}
	
//	@Test
//	public void month() throws Exception
//	{
//		WebElement e3=w.findElement(By.cssSelector("select[name=fromMonth]"));
//		
//		Select s3=new Select(e3);
//		
//		List<WebElement> li3=s3.getOptions();
//		System.out.println(li3.size());
//		for(int i=0;i<li3.size();i++)
//		{
//			System.out.println(li3.get(i).getText());
//		}
//		
//		s3.selectByVisibleText("August");
//		Thread.sleep(5000);
//		
//		//e3.getText();
//		System.out.println("Selected Month is :");
//	}
//	
//	@Test
//	public void preference()
//	{
//		w.findElement(By.cssSelector("input[value=Business]")).click();
//		
//	}
	
	
	
	
	
  @AfterTest
  public void afterTest() 
  {
	  //w.quit();
  }

}
