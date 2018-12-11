package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02_Mutual_Fund {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.findElement(By.id("uid")).sendKeys("admin");
		driver.findElement(By.id("passw")).sendKeys("passw");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/a[1]")).click();
	
		driver.quit();
		System.out.println("Test case executed");
	}

}
