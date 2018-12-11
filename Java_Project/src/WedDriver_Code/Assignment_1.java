package WedDriver_Code;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel 123\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)w;
		
		w.get("https://ia.ca/individuals");
		w.manage().window().maximize();
		Thread.sleep(5000);
		w.findElement(By.xpath(".//*[@id='nav-secondaire']/div[1]/ul/li[4]/a/span")).click();
		Thread.sleep(4000);
		w.findElement(By.xpath(".//*[@id='nav-secondaire']/div[1]/ul/li[4]/ul/li[1]/section/ul/li[1]/a")).click();
		
		Thread.sleep(4000);
		w.findElement(By.linkText("Calculate your payments")).click();
		Thread.sleep(4000);
		
		WebElement Purchase_price=w.findElement(By.xpath(".//*[@id='form_calculateur_versements']/div[1]/div[2]/label"));
		WebElement Mortgage_amount=w.findElement(By.xpath(".//*[@id='form_calculateur_versements']/div[1]/div[3]/label"));
		
		if(Purchase_price.isDisplayed() && Mortgage_amount.isDisplayed())
		{
			System.out.println("Purchase Price and Mortgage amount options are present of page");
		}
		else
		{
			System.out.println("Purchase Price and Mortgage amount options are not present of page");
		}
		
		
		WebElement radio=w.findElement(By.xpath(".//*[@id='form_calculateur_versements']/div[1]/div[2]/label"));
		if(radio.isSelected())
		{
			System.out.println("Purchase price radio option is selected");
		}
		
		Thread.sleep(4000);
		js.executeScript("windows.scrollBy(0,1000)");
		
		
		
//		w.findElement(By.xpath(".//*[@id='main']/div[2]/div[4]/div[1]/div[2]/a")).click();
//		Thread.sleep(4000);
//		
//		
		
		

	}

}
