package September;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_New_Tour_PageFactory_Method_Object 
{

	//User name
	@FindBy(name="userName")
	public static WebElement uid;
	
	//Password
	@FindBy(name="password")
	public static WebElement pass;
	
	//Login button
	@FindBy(xpath="//input[@type='image'][@name='login']")
	public static WebElement login_button;
	
	
}
