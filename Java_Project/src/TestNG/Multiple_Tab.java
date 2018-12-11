package TestNG;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Tab {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver w=new FirefoxDriver();
		
		w.get("http://demo.testfire.net/bank/login.aspx");   
		Thread.sleep(4000);
	
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.id("passw")).sendKeys("admin");
		
		
		w.findElement(By.name("btnSubmit")).click();
		Thread.sleep(4000);
		
		
		WebElement w1=w.findElement(By.linkText("Transfer Funds"));
		
		
		w1.sendKeys(Keys.CONTROL, Keys.RETURN);// New Tab
		
		Thread.sleep(4000);
		
		//For new Window
		//w1.sendKeys(Keys.SHIFT, Keys.RETURN);
		//Thread.sleep(4000);
		
		
		ArrayList<String> li=new ArrayList<String>(w.getWindowHandles());
		Thread.sleep(4000);
		
		System.out.println(li.size());
		
//		w.switchTo().window(li.get(1));
//		System.out.println(w.getTitle());
//		
//		Thread.sleep(2000);
//		
//		w.switchTo().window(li.get(0));
//		System.out.println(w.getTitle());
//	
//		Thread.sleep(2000);
//		
//		w.switchTo().window(li.get(1));
//		System.out.println(w.getTitle());
//	
//		Thread.sleep(2000);
//		
//		w.switchTo().window(li.get(0));
//		System.out.println(w.getTitle());
	
		w.quit();
	}

	

}
