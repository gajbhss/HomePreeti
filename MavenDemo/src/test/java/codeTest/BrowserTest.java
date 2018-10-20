package codeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserTest {

	@Test
	public void open() throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "H://chromedriver_win32//chromedriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://phptravels.org/clientarea.php");
	Thread.sleep(5000);
		System.out.println("Finished");
	}


	
}
