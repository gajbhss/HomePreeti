package Practice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Interview_Practice {

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.automationtesting.in/Register.html");
		w.manage().window().maximize();
		Thread.sleep(5000);

		w.findElement(By.cssSelector("input.form-control")).sendKeys("Sanket");
		w.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Gajbhiv");
		w.findElement(By.cssSelector("textarea.form-control")).sendKeys("Pune 4105047" );
		w.findElement(By.cssSelector("input[ng-model=EmailAdress]")).sendKeys("abc@gmail.com");
		w.findElement(By.cssSelector("input[ng-model=Phone]")).sendKeys("8796535785");
		
		List<WebElement> radio_button=w.findElements(By.cssSelector("input[type=radio]"));
		System.out.println("radio button count is : "+radio_button.size());
		radio_button.get(0).click();
	
		JavascriptExecutor je=(JavascriptExecutor) w;
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		System.out.println("Succesfully scrolled down");
		
		List<WebElement> check_box=w.findElements(By.cssSelector("input[type=checkbox]"));
		System.out.println("Check box count is : "+check_box.size());
		check_box.get(2).click();
		
		
		//For Language: need to write code for exception handling 
		//w.findElement(By.cssSelector("div.ui-autocomplete-multiselect")).sendKeys("English");
		
		List<WebElement> drop_down=w.findElements(By.cssSelector("select[type='text']"));
		System.out.println("Drop Down count is :"+drop_down.size());
		
		WebElement skill=w.findElement(By.cssSelector("select#Skills"));
//		for(int i=0;i<skill.size();i++)
//		{
//				System.out.println("List of Skills are: "+skill.get(i).getText());
//		}
		
		Select s;
		
		s=new Select(skill);
		s.selectByIndex(7);
		
		WebElement counrty=w.findElement(By.cssSelector("select[ng-model=country]"));
		
		s=new Select(counrty);
		s.selectByIndex(5);
		
		//For span country		
//		WebElement span_country=w.findElement(By.xpath(".//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));
//		span_country.click();
//		Thread.sleep(2000);
		
		WebElement year=w.findElement(By.id("yearbox"));
		s=new Select(year);
		s.selectByVisibleText("1991");
		
		WebElement month=w.findElement(By.cssSelector("select[placeholder=Month]"));
		s=new Select(month);
		s.selectByVisibleText("March");
		
		try {
		WebElement day=w.findElement(By.id("daybox"));
		s=new Select(day);
		s.selectByVisibleText("24");
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
			System.out.println("code continued...");
		}
		
		w.findElement(By.id("firstpassword")).sendKeys("Smart2000");
		w.findElement(By.id("secondpassword")).sendKeys("Smart2000");
		w.findElement(By.id("submitbtn")).click();		
		
		Thread.sleep(2000);
		w.quit();

		

	}

	
}
