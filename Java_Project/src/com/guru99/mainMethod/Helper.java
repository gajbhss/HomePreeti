package com.guru99.mainMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.guru99.objects.Guru99_Dashboard;
import com.guru99.objects.guru99_LoginPage_Objects;


public class Helper {

	
	
	public static guru99_LoginPage_Objects guru99_LoginPage;
	public static Guru99_Dashboard guru99_Dashboard;
	
	public static void Login_Page()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		guru99_LoginPage=new guru99_LoginPage_Objects(driver); 
		guru99_Dashboard=new Guru99_Dashboard(driver);
	}
	
	public static void Excel_input() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\Guru99.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheetAt(0);
		
		int last_row=sh.getLastRowNum();
		XSSFCell username,password;
		
		for(int i=1;i<=last_row;i++)
		{
			int j=0;
			username=sh.getRow(i).getCell(j);
			password=sh.getRow(i).getCell(j+1);
			
			guru99_LoginPage_Objects.username.sendKeys(username.toString());
			guru99_LoginPage_Objects.password.sendKeys(password.toString());
		}	
	}
	
	
	public static void invalid_username_excel() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\Guru99.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheetAt(0);
		
		int last_row=sh.getLastRowNum();
		XSSFCell username,password;
		
		for(int i=1;i<=last_row;i++)
		{
			int j=3;
			username=sh.getRow(i).getCell(j);
			password=sh.getRow(i).getCell(j+1);
			
			guru99_LoginPage_Objects.username.sendKeys(username.toString());
			guru99_LoginPage_Objects.password.sendKeys(password.toString());
		}	
	}
	
	 public static WebDriver driver;
		 
		public void forceWait(int time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		public void forceWait(long time) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void forceWait(WebElement element) {
			waitForElement(element);
		}
		
		
	public void waitForElement(WebElement value) {
			
			// wait for field
			WebDriverWait wait = new WebDriverWait(driver, 90);
			
			wait.until(ExpectedConditions.visibilityOf(value));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
		}
	
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
            FileUtils.copyFile(scrFile, new File("C:\\Users\\intel 123\\Desktop\\Data_Driven\\Guru99_Screenshots\\screenshot.png"));
    }
	
	
	public static void Close_window()
	{
		driver.quit();
	}
	
	
	public static void alert_accept()
	{
		try {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
