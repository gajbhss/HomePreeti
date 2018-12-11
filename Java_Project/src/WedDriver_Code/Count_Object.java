package WedDriver_Code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_Object {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		w.manage().window().maximize();
		
		//for Radio button
		List<WebElement> radio_button=w.findElements(By.cssSelector("input[type=radio]"));		
		System.out.println("Radio button counet is : "+ radio_button.size());
		
		//For Check_box button
		List<WebElement> check_box=w.findElements(By.cssSelector("input[type=checkbox"));
		System.out.println("Check box count is :"+check_box.size());
		
		//For Drop_Down list
		List<WebElement> drop_down=w.findElements(By.tagName("select"));
		System.out.println("Drop Down Count is :"+drop_down.size());
		
		//for text of Password fields
		List<WebElement> pass=w.findElements(By.cssSelector("input[type=password]"));
		System.out.println(" Password fields are :"+pass.size());
		
		//For Text fields
		List<WebElement> tex=w.findElements(By.cssSelector("input[type=text]"));
		System.out.println("text field count is : "+tex.size());
		
		//for skill field
		
		
 		
		w.quit();
		
		

	}

}
