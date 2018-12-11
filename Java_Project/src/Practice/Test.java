package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.win32.W32APIFunctionMapper;

public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://www.google.com");
		w.manage().window().maximize();
		w.findElement(By.className("gb_b")).click();
		w.findElement(By.id("gb192")).click();
		Thread.sleep(4000);
		w.findElement(By.id("i3")).click();
		w.navigate().back();
		

		
		
		//w.quit();
		
	}

}
