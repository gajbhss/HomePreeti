package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mutual_Fund_Object_Repository_Oops_Concept 
{
	//User name
	public static WebElement username(WebDriver w)
	{
		WebElement n=w.findElement(By.xpath(".//*[@id='uid']"));
		return n;		
	}
	
	//Password
	public static WebElement password(WebDriver w)
	{
		WebElement p=w.findElement(By.xpath(".//*[@id='passw']"));
		return p;
	}
	
	//Login button
	public static WebElement login_button(WebDriver w)
	{
		WebElement l=w.findElement(By.cssSelector("input[name=btnSubmit]"));
		return l;
	}
	
	//Feed back
	public static WebElement feedback(WebDriver w)
	{
		WebElement f=w.findElement(By.xpath(".//*[@id='_ctl0__ctl0_HyperLink4']"));
		return f;
	}
	
	//entering name
	public static WebElement name(WebDriver w)
	{
		WebElement n=w.findElement(By.xpath(".//*[@id='wrapper']/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input"));
		return n;		
	}
	
	//For Entering Email Address
	public static WebElement subject(WebDriver w)
	{
		WebElement e1=w.findElement(By.cssSelector("input[name=email_addr]"));
		return e1;
	}
	
	//Entering Subject 
	public static WebElement email(WebDriver w)
	{
		WebElement s=w.findElement(By.cssSelector("input[name=subject]"));
		return s;
	}
	
	
	//Comment
	public static WebElement commnet(WebDriver w)
	{
		WebElement c=w.findElement(By.name("comments"));
		return c;
	}
	
	//Submit button
	public static WebElement submit_Button(WebDriver w)
	{
		WebElement sb=w.findElement(By.name("submit"));
		return sb;
	}
	
	
	//Log out button
	public static WebElement log_out(WebDriver w)
	{
		WebElement log=w.findElement(By.xpath(".//*[@id='_ctl0__ctl0_LoginLink']"));
		return log;
	}
	
	
}
