package Practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_Driven_Test {

	public static void main(String[] args) throws IOException, Exception 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Test1.xls");
		HSSFWorkbook wb=new HSSFWorkbook(f);
		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFCell uid,pwd;
		int last_row_no=sheet.getLastRowNum();
		
		for(int i=1;i<last_row_no;i++)
		{
			int j=0;
			
			uid=sheet.getRow(i).getCell(j);
			pwd=sheet.getRow(i).getCell(j+1);
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.testfire.net/bank/login.aspx");
			Thread.sleep(4000);
			
			driver.findElement(By.name("uid")).sendKeys(uid.toString());
			driver.findElement(By.name("passw")).sendKeys(pwd.toString());
			driver.findElement(By.name("btnSubmit")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/a[1]")).click();
			driver.quit();
			System.out.println("Test case "+   i    +  "     Passed.....");
			
			
		}
			wb.close();
	}
	
	

}
