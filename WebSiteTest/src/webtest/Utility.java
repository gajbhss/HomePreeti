package webtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	static WebDriver driver;

	public static void takeSnapshot(WebDriver driver, String screenshotName) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
				
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		 
		System.out.println("Screenshot taken");		 
	}
}
