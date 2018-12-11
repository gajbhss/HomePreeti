package WedDriver_Code;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multiple_Browsers {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Browsers available :");
		System.out.println("Chrome");
		System.out.println("IE");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter your browser :");
		String str=sc.next();
		
		
		if(str.equalsIgnoreCase("IE"))
		{
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\intel 123\\Desktop\\Chrome\\IEDriverServer_x64_2.53.0\\IEDriverServer.exe");
		WebDriver w=new InternetExplorerDriver();
		w.get("http://newtours.demoaut.com/");
		Thread.sleep(4000);
		w.quit();
		
		}
		else if(str.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\intel 123\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
			WebDriver w=new ChromeDriver();
			w.get("http://newtours.demoaut.com/");
			Thread.sleep(4000);
			w.quit();
		}
		
		sc.close();

	}

}
