package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatabaseObject2 
{

	@FindBy(name="userName")
	public static WebElement uid;
	
	@FindBy(name="password")
	public static WebElement pwd;
	
	@FindBy(name="login")
	public static WebElement login_button;
	
}
