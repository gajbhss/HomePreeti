package Practice;

import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.automationtesting.in/Register.html");
		w.findElement(By.id("imagesrc")).click();
		//Runtime.getRuntime().exec("C:\\Users\\intel 123\\Desktop\\AutoIt\\fileupload.exe");
		Runtime.getRuntime().exec("C:\\Users\\intel 123\\Desktop\\AutoIt\\fileupload.exe");
	}

}
