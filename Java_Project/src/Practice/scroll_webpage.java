package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll_webpage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		Thread.sleep(9000);
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		
		je.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(5000);
		
		je.executeScript("history.go(0)");
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	
		
	}

}
