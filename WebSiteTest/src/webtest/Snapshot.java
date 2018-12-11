package webtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Snapshot {
  
	WebDriver driver;
	
		@Test
	  public void beforeTest() throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		/*	driver.get("http://phptravels.org/clientarea.php");
			Thread.sleep(5000);
			driver.findElement(By.id("inputEmail4444")).sendKeys("sanket");		
*/	
			/*driver.get("https://www.goibibo.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//a[text()='Sign up']")).click();
			
			Thread.sleep(4000);
			
			driver.switchTo().frame("authiframe");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='authMobile']")).sendKeys("8796535798");
			
			Thread.sleep(4000);
			
			
			driver.quit();*/
			
			driver.get("http://store.demoqa.com/");
			
			WebElement obj=driver.findElement(By.xpath("html/body/div[2]/div/div/header/nav/ul/li[2]/a"));
			
			Actions act=new Actions(driver);
			act.moveToElement(obj).build().perform();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("html/body/div[2]/div/div/header/nav/ul/li[2]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			
			
			
		}
		
	
	@AfterMethod
  public void snapshot(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.takeSnapshot(driver, result.getName());
		}
  }
  

  @AfterTest
  public void afterTest() {
  }

}
