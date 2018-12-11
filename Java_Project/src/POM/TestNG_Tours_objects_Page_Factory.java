package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestNG_Tours_objects_Page_Factory
{
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
	WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.NAME,using="login")
	WebElement loginButton;
	
	public TestNG_Tours_objects_Page_Factory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LoginTOToursWebSite(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	
}

