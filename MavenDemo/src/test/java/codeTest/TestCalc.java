package codeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {
	
	WebDriver driver;
	
	@Test
	public void open() throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "H://chromedriver_win32//chromedriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://phptravels.org/clientarea.php");
	Thread.sleep(5000);
		System.out.println("end");
	}
	
	
	
	@Test
	public void add()
	{
		System.out.println("Sum");
		int a=10,b=20;
		Assert.assertEquals(a+b, 30);
	}
	@Test
	public void sub()
	{
		System.out.println("Subtraction");
		int a=10,b=20;
		Assert.assertEquals(b-a, 10);
	}
	@Test
	public void mul()
	{
		System.out.println("multipli");
		int a=10,b=20;
		Assert.assertEquals(a*b, 200);
	}
	@Test
	public void div()
	{
		System.out.println("div");
		int a=10,b=20;
		Assert.assertEquals(b/a, 2);
	}
	

}
