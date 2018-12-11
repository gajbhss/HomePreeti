package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) throws Exception 
	{
		WebDriver w=new FirefoxDriver();
		w.get("https://www.goibibo.com/");
		Thread.sleep(8000);
		
		w.findElement(By.linkText("Sign up")).click();
		Thread.sleep(4000);
		
		w.switchTo().frame(w.findElement(By.id("authiframe")));
		w.findElement(By.id("authMobile")).sendKeys("8888525254");
		w.findElement(By.id("mobileSubmitBtn")).click();
	}

}
