package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_2 
{
	public static void main(String args[]) throws Exception
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://www.agiletestingalliance.org");
		Thread.sleep(4000);
		w.manage().window().maximize();
		
		//test case one
		WebElement text=w.findElement(By.xpath("html/body/div[4]/div/span[1]"));
		if(text.isDisplayed())
		{
			System.out.println("Text is displayed :"+text.getText());
		}
		else
		{
			System.out.println("Text is not available");
		}
		
		
		//Test case 2
//		w.findElement(By.xpath("html/body/div[4]/div/div/table/tbody/tr/td[2]/a")).click();
//		Thread.sleep(4000);
	
		WebElement alliance_str= w.findElement(By.xpath("html/body/div[7]/div[1]/div/a"));
		alliance_str.click();
		Thread.sleep(4000);
		
		w.findElement(By.cssSelector("div#leftcolumn"));
		
		
		
		
		
		
		//Test case 3
		
		
		//w.quit();
	}
}
