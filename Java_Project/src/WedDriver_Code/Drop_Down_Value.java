package WedDriver_Code;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Value {

	//@SuppressWarnings({ "unlikely-arg-type" })
	public static void main(String[] args) throws InterruptedException 
	{
		boolean found=false;
		WebDriver w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com");
		
		w.findElement(By.name("userName")).sendKeys("demo1");
		w.findElement(By.name("password")).sendKeys("demo1");
		w.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		Thread.sleep(4000);
		
		WebElement drop=w.findElement(By.cssSelector("select[name=fromPort]"));
		Select s=new Select(drop);
		
		List<WebElement> li= s.getOptions();
		
		System.out.println("Count is : "+li.size());
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		System.out.println("\n Select one options :");
		Scanner Sc=new Scanner(System.in);
		String str=Sc.nextLine();
		
		
		
		for(int j=0;j<li.size();j++)
		{
			if(li.get(j).getText().equals(str))
			{
				found=true;
				break;
			}
		}		
		if(found)
		{	
			System.out.println(" Found");
			
		}
		else
		{
			System.out.println(" Not found");
		}
		Sc.close();
		w.quit();

	}

}
