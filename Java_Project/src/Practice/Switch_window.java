package Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_window {

	public static void main(String[] args) throws InterruptedException 
	{
	
		try
		{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		System.out.println("dfd");
		w.get("http://demo.testfire.net/bank/login.aspx");   
		Thread.sleep(7000);
	
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(4000);
		
		
		WebElement w1=w.findElement(By.linkText("Transfer Funds"));
		w1.sendKeys(Keys.CONTROL, Keys.RETURN);
		Thread.sleep(5000);
		
		ArrayList<String> li=new ArrayList<String>(w.getWindowHandles());
		System.out.println(li.size());
	
		w.switchTo().window(li.get(1));
		System.out.println(w.getTitle());
		Thread.sleep(4000);
	
		w.switchTo().window(li.get(0));
		System.out.println(w.getTitle());
		Thread.sleep(4000);
		
		w.switchTo().window(li.get(1));
		System.out.println(w.getTitle());
		Thread.sleep(4000);
		
		w.switchTo().wait();li.get(0);
		System.out.println(w.getTitle());
		Thread.sleep(4000);
	
		w.quit();
	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}

}
