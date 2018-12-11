package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Data_Driven_write_Excel {

	public static void main(String[] args) throws Exception
	{
		
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\testdata1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet st=wb.getSheetAt(0);
		
		XSSFCell uid,pwd,result;
		int count_rows=st.getLastRowNum();
		
		
		
		for(int i=1;i<=count_rows;i++)
		{
		
		int j=0;
			
		uid=st.getRow(i).getCell(j);
		pwd=st.getRow(i).getCell(j+1);
		result=st.getRow(i).createCell(j=2);
		result.setCellValue("Passed");
			
		FileOutputStream fo=new FileOutputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\testdata1.xlsx");
		wb.write(fo);
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.findElement(By.id("uid")).sendKeys(uid.toString());
		driver.findElement(By.id("passw")).sendKeys(pwd.toString());
		driver.findElement(By.name("btnSubmit")).click();
		
		try
		{
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign Off")).click();
		System.out.println("TEST DATA "+i+" Passed...");
		driver.quit();
		}
		
		catch(InterruptedException e)
		{
			System.out.println("Data Invalid");
			driver.quit();
		}
		
		
		

		}
		wb.close();
	}

}
