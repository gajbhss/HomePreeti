package WedDriver_Code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class List_Value {

	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("admin");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
		
		List<WebElement> link=driver.findElements(By.xpath("html/body/div[2]/table/tbody/tr[2]/td[1]/ul/li/a"));
		
		System.out.println("Link count is :"+link.size());
		
		for(int i=0;i<=link.size();i++) 
		{
			System.out.println(link.get(i).getText());
		}
		
		driver.quit();
		
		
	}

}
