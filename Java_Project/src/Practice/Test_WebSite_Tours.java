package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_WebSite_Tours {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com/mercurysignon.php");
		w.manage().window().maximize();
		Thread.sleep(5000);
		
		w.findElement(By.name("userName")).sendKeys("demo1");
		w.findElement(By.name("password")).sendKeys("demo1");
		w.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		List<WebElement> radio=w.findElements(By.cssSelector("input[type=radio]"));
		System.out.println("Total Radio buttons are :"+radio.size());
		
		w.quit();

	}
	
	

}
