package Practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_Driven {

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sht=wb.getSheetAt(0);
		XSSFCell uid,psw;
		
		int Last_row_num=sht.getLastRowNum();
		
		for(int i=1;i<Last_row_num;i++)
		{
			int j=0;
			
			uid=sht.getRow(i).getCell(j);
			psw=sht.getRow(i).getCell(j+1);
		
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.testfire.net/bank/login.aspx");
			Thread.sleep(4000);
			driver.findElement(By.name("uid")).sendKeys(uid.toString());
			driver.findElement(By.name("passw")).sendKeys(psw.toString());
			driver.findElement(By.name("btnSubmit")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/a[1]")).click();
			
			driver.quit();
			System.out.println("Test Data"+ i + "passed......");
			
			
		}
			wb.close();
	}
	

}
