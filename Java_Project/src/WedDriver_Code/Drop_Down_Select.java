package WedDriver_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com");
		w.manage().window().maximize();
		
		Select s;
		w.findElement(By.name("userName")).sendKeys("demo1");
		w.findElement(By.name("password")).sendKeys("demo1");
		w.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		Thread.sleep(4000);	
		
		//Select by index
		WebElement pass_W= w.findElement(By.name("passCount"));
		s=new Select(pass_W);
		s.selectByIndex(3);
		
		//Select by value
		WebElement departing=w.findElement(By.name("fromPort"));
		s=new Select(departing);
		s.selectByValue("Paris");
		
		//Select by Visible text
		WebElement month=w.findElement(By.name("fromMonth"));
		s=new Select(month);
		s.selectByVisibleText("September");
		
		w.quit();
	}

}
