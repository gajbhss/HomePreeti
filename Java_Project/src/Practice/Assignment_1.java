package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("https://ia.ca/individuals");
		w.manage().window().maximize();
		Thread.sleep(4000);
		
		w.findElement(By.xpath(".//*[@id='nav-secondaire']/div[1]/ul/li[4]/a/span")).click();
		Thread.sleep(4000);
		
		w.findElement(By.xpath(".//*[@id='nav-secondaire']/div[1]/ul/li[4]/ul/li[1]/section/ul/li[1]/a")).click();
		Thread.sleep(4000);
		
		w.findElement(By.linkText("Calculate your payments")).click();
		Thread.sleep(4000);
		
		
		w.findElement(By.xpath(".//*[@id='PrixPropriete']"));
		System.out.println("Purchase Price  is :");
	
		//w.quit();
	}

}
