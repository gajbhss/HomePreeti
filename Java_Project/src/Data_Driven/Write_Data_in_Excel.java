package Data_Driven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_in_Excel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet st=wb.getSheetAt(0);
		
		XSSFCell name,country;
		
		
		XSSFRow r=st.createRow(1);
		
		name=r.createCell(0);
		name.setCellValue("Jones");
		
		country=r.createCell(1);
		country.setCellValue("UK");
		
		//for sending to the Excel files
		FileOutputStream fo=new FileOutputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\data.xlsx");
		//Save the file
		wb.write(fo);
		
		wb.close();
		
	}

}
	