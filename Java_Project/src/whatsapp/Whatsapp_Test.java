package whatsapp;



import io.appium.java_client.android.AndroidDriver;

import java.io.File;
 
import java.net.MalformedURLException;
 
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
 
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
 
 
 
public class Whatsapp_Test {
 
                             
// create global variable
 
private static AndroidDriver driver;
 
public static void main(String[] args) throws MalformedURLException, InterruptedException 
{
 
 
 // Create object of DesiredCapabilities class                             
 
DesiredCapabilities capabilities = new DesiredCapabilities();
 
 
 
// Optional
 
capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
 
 
// Specify the device name (any name)
 
capabilities.setCapability("deviceName", "Samsung Galaxy Note4");
 
 
// Platform version
 
capabilities.setCapability("platformVersion", "6.0.1");
 
 
// platform name
 
capabilities.setCapability("platformName", "Android");
 
 
// specify the application package that we copied from appium                
 
capabilities.setCapability("appPackage", "io.selendroid.testapp");
 
 
// specify the application activity that we copied from appium                   
 
capabilities.setCapability("appActivity", ".HomeScreenActivity");
 
 
// Start android driver I used 4727 port by default it will be 4723
 
driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
 
 
 
// Specify the implicit wait of 5 second
 
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
 
 
// Enter the text in textbox
 
driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("sanket Santosh Gajbhiv");
 
 
// click on registration button  
                                   
driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
 
 
 
// Wait for 10 second
 
Thread.sleep(10000);
 
 //enter user name 
driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("Sanket Santosh Gajbhiv");

Thread.sleep(5000);

driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("sanketgajbhiv@gmail.com");


Thread.sleep(5000);

driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("Smart2000");

driver.findElement(By.id("io.selendroid.testapp:id/inputName")).clear();
driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("MR.Sanket Gajbhiv");

//JavascriptExecutor js= (JavascriptExecutor) driver;
//
//js.executeScript("window.scrollBy(0,1000)");

TouchActions action = new TouchActions(driver);
action.scroll(10, 100);
action.perform();

Thread.sleep(5000);
WebElement dropdown=driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage"));
Select sel1=new Select(dropdown);

List<WebElement> list=sel1.getOptions();

System.out.println("Drop down size is :"+list.size());

for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i).getText());
}


 
// close the application
 driver.quit();
 

 
      }
 
 
 
}