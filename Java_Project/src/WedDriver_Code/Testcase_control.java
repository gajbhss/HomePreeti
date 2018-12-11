package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase_control {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com");
		w.manage().window().maximize();
		
		w.findElement(By.name("userName")).sendKeys("demo1");
		w.findElement(By.name("password")).sendKeys("demo1");
		w.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		Thread.sleep(4000);
		
		//CSS using value
		w.findElement(By.cssSelector("input[value=oneway]")).click();
		
		
		w.quit();

	}

}
