package Practice;



	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class scroll {

	    WebDriver driver;
	    @Test
	    public void ByPixel() throws InterruptedException {
	        //System.setProperty("webdriver.chrome.driver", "E://Selenium//Selenium_Jars//chromedriver.exe");
	        driver = new FirefoxDriver();

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/");

	        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
	        driver.manage().window().maximize();

	        Thread.sleep(5000);
	        // This  will scroll down the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,3000)");
	    }
	
	
	
	
	
	
}
