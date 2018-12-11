package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class count_objects {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		
		List<WebElement> radio_buttons=w.findElements(By.cssSelector("input[type=radio]"));		
		List<WebElement> drop_down=w.findElements(By.tagName("select"));
		List<WebElement> check_box=w.findElements(By.cssSelector("input[type=checkbox]"));
		
		//First Name
		WebElement a=w.findElement(By.cssSelector("input[class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']"));
		if (a.isDisplayed()) {
			System.out.println("Passed...");
		}
		else {
			System.out.println("Failed...");
		}
		System.out.println("Radio buttons count is :"+radio_buttons.size());
		System.out.println("Drop Down count is "+drop_down.size());
		System.out.println("Check box count is :"+check_box.size());
		
		w.quit();
		
		
		
		
	}

}
