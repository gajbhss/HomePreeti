package September;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POM_New_Tour_Main_Method {

	public static void main(String[] args) throws Exception {
		
		WebDriver w=new FirefoxDriver();
		
		w.get("http://newtours.demoaut.com/mercurysignon.php");
		
		Thread.sleep(4000);

		POM_NewTour_Object_Oops_Concept.username(w).sendKeys("demo1");
		POM_NewTour_Object_Oops_Concept.password(w).sendKeys("demo123");
		POM_NewTour_Object_Oops_Concept.submitButton(w).click();
	}

}
