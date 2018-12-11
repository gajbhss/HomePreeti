package Data_Driven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\testdemo.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sht=wb.getSheetAt(0);
		XSSFCell username,password,result;
		
		
		
		int last_row=sht.getLastRowNum();
		
		for(int i=1;i<=last_row;i++)
		{
			int j=0;
			username=sht.getRow(i).getCell(j);
			password=sht.getRow(i).getCell(j+1);
			result=sht.getRow(i).createCell(j=2);
			
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			Thread.sleep(4000);
			
			driver.findElement(By.name("userName")).sendKeys(username.toString());
			driver.findElement(By.name("password")).sendKeys(password.toString());
			driver.findElement(By.name("login")).click();
			try
			{
			Thread.sleep(4000);
			driver.findElement(By.linkText("SIGN-OFF")).click();
			System.out.println("Test Cases   " +   i   +"  passed");
			}
			catch(Exception e)
			{
				System.out.println("Failed");
			}
			result.setCellValue("Passed");
			
			
			FileOutputStream fo=new FileOutputStream("C:\\Users\\intel 123\\Desktop\\testdemo.xlsx");
			wb.write(fo);
			
			
			
			driver.quit();
			
		}
		wb.close();
	}

}
