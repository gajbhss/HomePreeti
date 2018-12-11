package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;


public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception
	{
		/*
		WebDriver w=new FirefoxDriver();
		w.get("http://store.demoqa.com/");
		
		WebElement obj=w.findElement(By.xpath("html/body/div[2]/div/div/header/nav/ul/li[2]/a"));
		
		Actions act=new Actions(w);
		act.moveToElement(obj).build().perform();
		Thread.sleep(4000);
		
		w.findElement(By.xpath("html/body/div[2]/div/div/header/nav/ul/li[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		
		*/
		
		WebDriver w1=new FirefoxDriver();
		w1.get("http://opensource.demo.orangehrmlive.com/");
		w1.manage().window().maximize();
		w1.findElement(By.id("txtUsername")).sendKeys("Admin");
		w1.findElement(By.id("txtPassword")).sendKeys("admin");
		w1.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
		
		w1.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[5]/a/b")).click();
		Thread.sleep(2000);
		
		w1.findElement(By.linkText("Candidates")).click();
		Thread.sleep(7000);
		
		
		JavascriptExecutor js=(JavascriptExecutor)w1;
		
		//For refresh
		js.executeScript("history.go(0)");
		Thread.sleep(8000);
		
		//Page move down
		js.executeScript("windows.scrollBy(0,200)");
		Thread.sleep(4000);
		
		//Page move up
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(4000);
		
		js.executeScript("arguments[0].value='2018-01-05'", w1.findElement(By.id("candidateSearch_candidateName")));
		
		js.executeScript("arguments[0].value='2018-01-05'", w1.findElement(By.id("candidateSearch_fromDate")));
		Thread.sleep(4000);
		
		js.executeScript("arguments[0].value='2018-06-13'", w1.findElement(By.id("candidateSearch_toDate")));
		Thread.sleep(4000);
		
		
	
	}
	
	
}