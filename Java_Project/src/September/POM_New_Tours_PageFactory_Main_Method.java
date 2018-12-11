package September;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_New_Tours_PageFactory_Main_Method {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver w=new FirefoxDriver();
		PageFactory.initElements(w, POM_New_Tour_PageFactory_Method_Object.class);
		w.get("http://newtours.demoaut.com/mercurysignon.php");
		
		
		
		Thread.sleep(3000);
		
		
		
		POM_New_Tour_PageFactory_Method_Object.uid.sendKeys("demo123");
		POM_New_Tour_PageFactory_Method_Object.pass.sendKeys("demo123");
		POM_New_Tour_PageFactory_Method_Object.login_button.click();
		
		
	}

}
