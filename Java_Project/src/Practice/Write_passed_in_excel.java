package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Write_passed_in_excel
{
	
	public static void main(String args[]) throws InterruptedException, Exception
	{
		FileInputStream f=new FileInputStream("‪C:\\Users\\intel 123\\Desktop\\Data_Driven\\testdata2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sht=wb.getSheet("Sheet1");
		
		int last_row_no=sht.getLastRowNum();
		XSSFCell username,password,result;
		
		for(int i=1;i<last_row_no;i++)
		{
			int j=0;
			username=sht.getRow(i).getCell(j);
			password=sht.getRow(i).getCell(j+1);
			result=sht.getRow(i).createCell(j=2);
			result.setCellValue("Passed");
			
			FileOutputStream fo=new FileOutputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\testdata2.xlsx");
			wb.write(fo);
			
			
			
			
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.testfire.net/bank/login.aspx");
			driver.findElement(By.id("uid")).sendKeys(username.toString());
			driver.findElement(By.id("passw")).sendKeys(password.toString());
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/a[1]")).click();
			driver.quit();
			System.out.println("TEST DATA "+i+" Passed...");

			wb.close();
		}
		
	}
	
	
	
	
	
}