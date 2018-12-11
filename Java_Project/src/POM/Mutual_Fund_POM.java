package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mutual_Fund_POM {

	public static void main(String[] args) throws Exception 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.testfire.net/bank/login.aspx");
		Thread.sleep(5000);
		w.manage().window().maximize();
	
		Mutual_Fund_Object_Repository_Oops_Concept.username(w).sendKeys("admin");
		Mutual_Fund_Object_Repository_Oops_Concept.password(w).sendKeys("admin");
		Mutual_Fund_Object_Repository_Oops_Concept.login_button(w).click();
		
		Thread.sleep(5000);
		
		//clicking on Feed back link
		Mutual_Fund_Object_Repository_Oops_Concept.feedback(w).click();
		Thread.sleep(4000);
		
		Mutual_Fund_Object_Repository_Oops_Concept.name(w).clear();
		Mutual_Fund_Object_Repository_Oops_Concept.name(w).sendKeys("Sanket");
		Mutual_Fund_Object_Repository_Oops_Concept.email(w).sendKeys("abbc@gmail.com");
		Mutual_Fund_Object_Repository_Oops_Concept.subject(w).sendKeys("Fixed Deposit");
		Mutual_Fund_Object_Repository_Oops_Concept.commnet(w).sendKeys("Depositing ammount in fixed deposit");
		Mutual_Fund_Object_Repository_Oops_Concept.submit_Button(w).click();
		Thread.sleep(4000);
		Mutual_Fund_Object_Repository_Oops_Concept.log_out(w).click();
		
		w.quit();
		
	}

}
