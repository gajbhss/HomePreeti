package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03_Phptravel {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://www.phptravels.net/supplier");
		
		w.findElement(By.cssSelector("input[name=email]")).sendKeys("supplier@phptravels.com");
		w.findElement(By.cssSelector("input[name=password]")).sendKeys("demosupplier");
		w.findElement(By.xpath("html/body/div[2]/div[2]/form[1]/button")).click();
		Thread.sleep(5000);
		w.quit();
	}

}
