package Practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Find_Element {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.manage().window().maximize();
		w.get("http://www.seleniumhq.org/");
		
		w.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		w.findElement(By.xpath("//a[text()='Download']")).click();
		
		
		JavascriptExecutor js=(JavascriptExecutor)w;
		//t ka hasli mahit aahe ka...because hyala kay mahit nay pn sangel confuse krel tne experince ghetlay... mhanun tula bollo thamb hyala sangu de.... hahahhah....
		
		//Page move Down
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(4000);
		
		//Page move up
		js.executeScript("window.scrollBy(0,-200)");
		
		
		//Refresh a page
		js.executeScript("history.go(0)");
		
		//	w.findElement(By.xpath("//a[text()='Javadoc']")).click();
		
		w.findElement(By.linkText("Javadoc")).click();

		
		//Actions act=new Actions(w);
		//act.moveToElement(w.findElement(By.xpath("//a[text()='Javadoc']"))).build().perform();
	//	act.click();
		
		Thread.sleep(4000);
		
		
		
		w.quit();
		
	}

}
