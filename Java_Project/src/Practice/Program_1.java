package Practice;



import java.util.List;

//import java.util.List;

//8import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

//import TestNG.AlertCode;

public class Program_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//First Program
//		WebDriver w=new FirefoxDriver();
//		w.manage().window().maximize();
//		Thread.sleep(2000);		
//		w.get("http://www.facebook.com");
//		Thread.sleep(2000);
//		w.quit();
//		
		//Second Program
//		WebDriver w1=new FirefoxDriver();   
//		w1.manage().window().maximize();
//		Thread.sleep(2000);		
//		w1.get("http://www.google.com");
//		WebElement e=w1.findElement(By.className("gsfi"));
//		e.sendKeys("Facebook");
//		e.submit();
//		Thread.sleep(2000);
//		w1.findElement(By.xpath("//a[text()=\"Facebook - Log In or Sign Up\"]")).click();
//		Thread.sleep(4000);
//		System.out.println(w1.getCurrentUrl());
//		Thread.sleep(2000);
//		w1.get("https://www.yatra.com/");
//		Thread.sleep(4000);
//		w1.navigate().back();
//		Thread.sleep(3000);
//		w1.quit();
		
		
		//Third Program
				
//		WebDriver w3=new FirefoxDriver();
//		Thread.sleep(2000);
//		w3.get("http://www.google.com");
//		WebElement e2=w3.findElement(By.className("gsfi"));
//		e2.sendKeys("Selenium");
//		e2.submit();
//		w3.quit();
//		
//		Thread.sleep(2000);
		
		
		//Forth Program
//		WebDriver w4=new FirefoxDriver();
//		w4.get("https://www.yatra.com/");
//		Thread.sleep(4000);
//		w4.manage().window().maximize();
//		w4.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div/div/div/div/ul/li[2]/a")).click();
//		Thread.sleep(2000);
//		
//		w4.findElement(By.id("signInBtn")).click();
//		
	
		//Fifth Program
		
	
		
//		WebDriver w5=new FirefoxDriver();
//		
//		w5.get("https://accounts.google.com/SignUp?hl=en");
//		w5.manage().window().maximize();
//		Thread.sleep(4000);
//		w5.findElement(By.id("FirstName")).sendKeys("abcpol");
//		w5.findElement(By.name("LastName")).sendKeys("xyzplok");
//		w5.findElement(By.cssSelector("input[name=GmailAddress]")).sendKeys("abcxyz");
//		w5.findElement(By.id("Passwd")).sendKeys("abcxyz12345");
//		w5.findElement(By.name("PasswdAgain")).sendKeys("abcxyz12345");
//
//		w5.findElement(By.cssSelector("div.goog-inline-block.goog-flat-menu-button.jfk-select")).click();
//		Thread.sleep(4000);
//		w5.findElement(By.id(":6")).click();
		
		
		
		//Sixth Program
		
//		WebDriver w6=new FirefoxDriver();
//		
//		w6.get("https://www.facebook.com/");
//		w6.manage().window().maximize();
//		Thread.sleep(4000);
//		
//		w6.findElement(By.cssSelector("input#email")).sendKeys("sanketgajbhiv@gmail.com");
//		Thread.sleep(4000);
//		w6.findElement(By.cssSelector("input#email")).clear();
//		w6.findElement(By.cssSelector("input#email")).sendKeys("8796535798");
//		w6.findElement(By.name("pass")).sendKeys("123456");
//		Thread.sleep(2000);
//		w6.quit();
		

		//7th Program
		
//		WebDriver w7=new FirefoxDriver();
//		
//		w7.get("https://www.google.com/");
//		w7.manage().window().maximize();
//		Thread.sleep(4000);
//		
//		WebElement e7=w7.findElement(By.cssSelector("input.gsfi"));
//		e7.sendKeys("Redmi note 4");
//		e7.submit();
//		Thread.sleep(4000);
//
//		w7.findElement(By.xpath("//a[@href='https://gadgets.ndtv.com/xiaomi-redmi-note-4-3713']")).click();
//		Thread.sleep(6000);
//		
//		w7.findElement(By.className("bn_notnow")).click();
//		
//		AlertCode.HandleAlert(w7);
//		
//		w7.findElement(By.xpath("//a[text()='USER REVIEWS']")).click();
//		Thread.sleep(7000);
//		
//		String str1=w7.findElement(By.xpath("//span[@class='fl'][1]")).getText();
//		String str=w7.findElement(By.xpath("//span[@class='rating_txt fl']")).getText();
//		System.out.println(str1);
//		System.out.println(str);
		
		
		//8th Program
		
		
//		WebDriver w8=new FirefoxDriver();
//		w8.get("https://www.google.com");
//		w8.manage().window().maximize();
//		Thread.sleep(4000);
//		w8.findElement(By.className("gsfi")).sendKeys("Selenium");
//		Thread.sleep(4000);
//	
//		List<WebElement> li8=w8.findElements(By.xpath("//div[@class='sbqs_c']"));
//		int a=li8.size();
//		System.out.println("  Size of auto- suggestion is "   +  a);
//		
		
		
		//9th Program
		
//		WebDriver w9=new FirefoxDriver();
//		w9.get("http://www.yatra.com");
//		w9.manage().window().maximize();
//		
//		w9.findElements(By.xpath("//input[@id='BE_flight_origin_city' and @name='flight_origin_city']"));
//		Thread.sleep(4000);
//		
		
		//10th Program
		
		WebDriver w10=new FirefoxDriver();
		w10.get("http://www.naukri.com");
		w10.manage().window().maximize();
		
		
		
		
	
		
		
		
		
		
		
	}

}
