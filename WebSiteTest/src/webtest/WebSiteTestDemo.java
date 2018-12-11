package webtest;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;


public class WebSiteTestDemo {

	@BeforeTest()
	public static void main() throws InterruptedException, IOException 
	{		
		System.setProperty("webdriver.gecko.driver", "H:\\Selenium\\Software\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("//input[@id='authMobile']")).sendKeys("8796535798");
		
		
		
		/*//for email enter
		driver.findElement(By.id("inputEmail")).sendKeys("jkl@mailinator.com");
		
		//for password enter
		driver.findElement(By.id("inputPassword")).sendKeys("Smart@2000");
		
		// FOr Remember Me
		driver.findElement(By.xpath(".//*[@id='main-body']/div[1]/div/div/form/div[3]/label")).click();
		
		//for Login Button
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		
		Thread.sleep(5000);
		
		String str1=driver.findElement(By.xpath(".//*[@id='main-body']/div[1]/div[1]/div/h1")).getText();
		System.out.println("Login page :"+str1);
		
		
		
		//driver.quit();
*/	}
	
	
	
	@AfterMethod
	public void failtestresult(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			
		}
	}

}
