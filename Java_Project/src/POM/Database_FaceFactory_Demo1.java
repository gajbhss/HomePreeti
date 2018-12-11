package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Database_FaceFactory_Demo1 
{
	@FindBy(name="userName")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy (name="login")
	public static WebElement login;
	
	@FindBy (linkText="SIGN-OFF")
	public static WebElement sige_out;
	
	
	
}
