package September;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_write_ {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f=new FileInputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\September.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheetAt(0);
		XSSFRow r=sh.createRow(7);
		
		XSSFCell  capital;
		
		capital=r.createCell(1);
		capital.setCellValue("Delhi");
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\intel 123\\Desktop\\Data_Driven\\September.xlsx");
		wb.write(fo);
		wb.close();
	}

}
