package September;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven {

	public static void main(String[] args) throws Exception 
	{
				
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\September.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheetAt(0);
		XSSFCell uid,pass;
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			int j=0;
			uid=sh.getRow(i).getCell(j);
			pass=sh.getRow(i).getCell(j+1);
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys(uid.toString());
		driver.findElement(By.name("password")).sendKeys(pass.toString());
		
		driver.quit();
		
		}
		
		wb.close();
	}

}
