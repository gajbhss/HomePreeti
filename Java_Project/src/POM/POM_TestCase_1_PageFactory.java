package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_TestCase_1_PageFactory {

	public static void main(String[] args) 
	{

		WebDriver w=new FirefoxDriver();
		PageFactory.initElements(w, DatabaseObject2.class);
		w.get("http://newtours.demoaut.com/");
		w.manage().window().maximize();
		
		DatabaseObject2.uid.sendKeys("demo1");
		DatabaseObject2.pwd.sendKeys("demo1");
		DatabaseObject2.login_button.click();
		w.quit();

	}

}
