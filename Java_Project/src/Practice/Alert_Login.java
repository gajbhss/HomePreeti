package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.testfire.net/bank/login.aspx");
		Thread.sleep(4000);
		
		w.findElement(By.name("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		w.findElement(By.name("btnSubmit")).click();
		
		Thread.sleep(4000);
		Alert_Demo.Handle_Alert(w);
		w.quit();
	}

}
