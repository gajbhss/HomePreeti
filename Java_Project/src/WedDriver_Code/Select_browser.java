package WedDriver_Code;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Select_browser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("List of the browsers:");
		System.out.println("Chrome");
		System.out.println("Firefox");
		System.out.println("IE");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose one browser :");
		String str=sc.nextLine();
		
		switch(str)
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel 123\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
			WebDriver w=new ChromeDriver();
			w.get("http://newtours.demoaut.com/");
			w.manage().window().maximize();
			
			w.findElement(By.name("userName")).sendKeys("demo1");
			w.findElement(By.name("password")).sendKeys("demo1");
			w.findElement(By.name("login")).click();
			Thread.sleep(4000);
			
			w.quit();
			break;
			
			
		case "Firefox":
			
			WebDriver w1=new FirefoxDriver();
			w1.get("http://newtours.demoaut.com/");
			w1.manage().window().maximize();
			
			w1.findElement(By.name("userName")).sendKeys("demo1");
			w1.findElement(By.name("password")).sendKeys("demo1");
			w1.findElement(By.name("login")).click();
			Thread.sleep(4000);
			
			w1.quit();
			break;
			
		case "IE":
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\intel 123\\Desktop\\Chrome\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
			WebDriver w2=new InternetExplorerDriver();
			w2.get("http://newtours.demoaut.com/");
			w2.manage().window().maximize();
			
			w2.findElement(By.name("userName")).sendKeys("demo1");
			w2.findElement(By.name("password")).sendKeys("demo1");
			w2.findElement(By.name("login")).click();
			Thread.sleep(4000);
			
			w2.quit();
			break;
		
		default:
			
			System.out.println("Invalid Browser ");
			
			
			
		}
		
		sc.close();

	}

}
