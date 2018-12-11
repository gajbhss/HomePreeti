package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_Css {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w=new FirefoxDriver();
		
		w.get("http://opensource.demo.orangehrmlive.com/");
		w.manage().window().maximize();
		
		w.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		w.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("admin");
		w.findElement(By.cssSelector("input.button")).click();
		Thread.sleep(4000);
		w.quit();
		
		System.out.println("Test case executed with CSS...Pass");

	}

}
