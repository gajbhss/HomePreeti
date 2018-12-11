package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_1_Link {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://www.google.com/");
		Thread.sleep(4000);
		w.manage().window().maximize();
		WebElement search_opt=w.findElement(By.cssSelector("input.gsfi"));
		search_opt.sendKeys("Mahatma Gandhi");
		search_opt.submit();		
		Thread.sleep(4000);
		
		//Test case 1
		//WebElement screen_check=w.findElement(By.xpath("html/body/div[6]/div[3]/div[10]/div[1]/div[3]"));
		
		
		
		
		
		//Test case 2
		WebElement birth=w.findElement(By.xpath("html/body/div[6]/div[3]/div[10]/div[1]/div[3]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/span[2]"));
		if(birth.isDisplayed())
		{
			System.out.println("Bith date is presnet on Web: " +birth.getText());
		}
		else
		{
			System.out.println("Bith date is not available on site");
		}
		
		
	}

}
