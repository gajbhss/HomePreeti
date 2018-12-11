package Data_Driven;

import java.io.FileInputStream;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_DataDriven {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\testdata1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet st=wb.getSheetAt(0);
		
		XSSFCell uid,pwd;
		int count_rows=st.getLastRowNum();
		
		for(int i=1;i<=count_rows;i++)
		{
		
			int j=0;
			
			uid=st.getRow(i).getCell(j);
			pwd=st.getRow(i).getCell(j+1);
			
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.findElement(By.id("uid")).sendKeys(uid.toString());
		driver.findElement(By.id("passw")).sendKeys(pwd.toString());
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("html/body/div[1]/form/table/tbody/tr[1]/td[2]/a[1]")).click();
		driver.quit();
		System.out.println("TEST DATA "+i+" Passed...");
		

		}
		wb.close();
	}

}
