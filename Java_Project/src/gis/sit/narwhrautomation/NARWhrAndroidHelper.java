
package gis.sit.narwhrautomation;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.beans.Visibility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import jxl.*; 


public class NARWhrAndroidHelper {
	@SuppressWarnings("rawtypes")
	public AndroidDriver ad=null;
	
	public URL url=null;
	public URL urlWeb=null;
	public String m2mEnvironment=null;
	public String environment=null;
	public String exe=null;
	
	public RemoteWebDriver wd=null;
	public DesiredCapabilities appCapabilities = null;
	public DesiredCapabilities mobBrowserCap = null;
	public DesiredCapabilities browCapabilities = null;
	public int test_Records=0;
	public int signIn_Test_Run_Count=0;
	public int updateAccount_Test_Run_Count=1;
	public int signUp_Test_Run_Count=1;
	public int count_Wrong_Credentials =0;
	public boolean isMobRefrigerator=false;
	public boolean is3XRefrigerator=false;
	public boolean isMobDryer=false;
	public boolean isMobWasher=false;
	public boolean isMobDishwasher=false;
	public boolean isCCDishwasher=false;
	public boolean isVestaOven=false;
	public boolean isV10kWasher=false;
	public boolean isselectCycle=true;
	public boolean isCreateFavorite=false;
	public boolean isModify=false;
	public boolean isV10kDryer=false;
	public boolean isV10kDryerAutoOrderSuccess=false;
	public boolean isV10kWasherAutoOrderSuccess=false;
	public boolean isMHC76=false;
	
	public long waitForNotification=0;
	public long waitForV10kWasherNotification=0;
	public long waitForV10kDryerNotification=0;
	public long waitForMobDryerNotification=0;
	public long waitForMobWasherNotification=0;
	public long waitForCCDishWasherNotification=0;
	public long waitForVestaOvenNotification=0;
	
	public List<WebElement> arrayentDeviceList=null;
	public List<WebElement> iBMDeviceList=null;
	public String deleteAccountLoginId = null;
	public String deleteAccountPwd = null;
	public int pushReceivalCount = 0;
	

	public boolean isRemoteStartedMOBWasher=false;
	public boolean isRemoteStartedMOBDryer=false;
	public boolean isRemoteStartedV10KWasher=false;
	public boolean isRemoteStartedV10KDryer=false;
	public boolean isNestSucessMOBWasher=false;
	public boolean isNestSucessMOBDryer=false;
	public boolean isNestSucessV10KWasher=false;
	public boolean isNestSucessV10KDryer=false;
	public boolean PrevTest=false;
	public boolean isKeepWarm=false;
	public boolean isHoldTemp=false;
	
	public String deviceType=null;
	public String deviceName=null;
	public String osVersion=null;
	public String mobileAppPath=null;
	public String appPackage=null;
	public String appActivity=null;
	public String loginError=null;
	public String pwdInstruction=null;
	public String avdAPI = null;
	
	public String udid=null;
	public String testEnvironment=null;
	public String deviceSize=null;
	public String language=null;
	public String resetPwdEmail=null;
	public String resetPwd=null;
	public boolean resetPasswordEmailSent=false;
	
	protected File configFile=null;
	protected FileReader configReader;
	protected Properties props=null;
	protected Properties languageProps=null;
	protected File languageConfig=null;
	protected FileReader languageConfigReader=null;
	
	String resetPwdInstructions = null;
	
	public void forceWait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void forceWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void forceWait(WebElement element) {
		waitForElement(element);
	}
	
	public void pushToBackgroundPopToForeground(long time) throws InterruptedException {
		System.out.println("Pushing App in background");
		int time1=(int) (time*60);
		int time2=time1+60;
		System.out.println(time2);
		ad.runAppInBackground(time2);
		Thread.sleep(40000);
	}
	
	public void pushToBackgroundPopToForeground(int time) throws InterruptedException {
		System.out.println("Pushing App in background");
		ad.runAppInBackground(time);
		Thread.sleep(60000);
	}

	public void waitForElement(WebElement value) {
		
		// wait for field
		WebDriverWait wait = new WebDriverWait(ad, 90);
				 
		wait.until(ExpectedConditions.visibilityOf(value));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(".");
	}
	
	public void printLogs(String str) {
		System.out.println(str);
	}	
	
	public void printLogs(Object obj) {
		System.out.println(obj);
	}	
	
	public String concatToConvertSingle(String element) {
		String elementNew = "\'"+element+"\'";
		printLogs("After conversion string - "+elementNew);
		return elementNew;
	}
	
	@SuppressWarnings("rawtypes")
	public void captureScreenShot(String platform, AppiumDriver appiumDriv, String name) throws IOException{
		File file = ((TakesScreenshot)appiumDriv).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file, new File("/Users/Haribabu/Documents/workspace/SIT-TestAutomation/FailedTestsScreenShots/"+platform+"/"+name+".jpg"));
		FileUtils.copyFile(file, new File("/Users/admin/eclipse-workspace/SIT-TestAutomation/Whirlpoolapp-Automation/FailedTestsScreenShots/"+platform+"/"+name+".jpg"));
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public void captureScreenShotForWeb(String platform, RemoteWebDriver wd, String name) throws IOException{
		File file = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/admin/eclipse-workspace/SIT-TestAutomation/Whirlpoolapp-Automation/FailedTestsScreenShots/Web"+platform+"/"+name+".jpg"));
	}
	   
	   
//	def swipe(start_x, start_y, end_x, end_y)
//    Appium::TouchAction.new.press(x: start_x, y: start_y).wait(1000).move_to(x:end_x, y:end_y).wait(500).release(x: end_x, y: end_y).perform
//    end
	public void swipeElement(AppiumDriver driver, WebElement element, int scrollLength, int duration){ 
		System.out.println("Start swipe");
		driver.context("NATIVE_APP");
//		wd.swipe(100,100,500,500,1);
		int bottomY = element.getLocation().getY()+scrollLength;
		System.out.println("Value of bottom Y:" +bottomY);
		System.out.println("Value of X:" +element.getLocation().getX());
		System.out.println("Value of Y:" +element.getLocation().getY());
		  
		(driver).swipe(element.getLocation().getX(), element.getLocation().getY(), element.getLocation().getX(), bottomY, duration); 
		System.out.println("End swipe"); 
	}
	
	public void element_scroll() throws IOException {
        Dimension dimensions = wd.manage().window().getSize();
          System.out.println("Size of Window= " +dimensions);
          int scrollStart = (int) (dimensions.getHeight() * 0.5);
          System.out.println("Size of scrollStart= " +scrollStart);
          int scrollEnd = (int) (dimensions.getHeight() * 0.2);
          System.out.println("Size of cscrollEnd= " + scrollEnd);             
          ((AppiumDriver) wd).swipe(0,scrollStart,0,scrollEnd,1000);           
          System.out.println("Screen Swiped " );

    }

	public String[][] getTestData(String xlFilePath, String sheetName, String tableName) throws Exception{
       String[][] tabArray=null;
       Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
       Sheet sheet = workbook.getSheet(sheetName); 
       int startRow,startCol, endRow, endCol,ci,cj;
       Cell tableStart=sheet.findCell(tableName);
       startRow=tableStart.getRow();
       startCol=tableStart.getColumn();
       Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                
       endRow=tableEnd.getRow();
       endCol=tableEnd.getColumn();
       System.out.println("startRow="+startRow+", endRow="+endRow+", " +"startCol="+startCol+", endCol="+endCol);
       this.test_Records=endRow-startRow-1;
       tabArray=new String[endRow-startRow-1][endCol-startCol-1];
       ci=0;
       for (int i=startRow+1;i<endRow;i++,ci++){
               cj=0;
               for (int j=startCol+1;j<endCol;j++,cj++){
                   tabArray[ci][cj]=sheet.getCell(j,i).getContents();
               }
       }       

       return(tabArray);
	} 
	
	
	public void waitForPresence()
	{
		WebDriverWait wait = new WebDriverWait(wd,30);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));   /*examining the xpath for a search     
	    box*/
	    
	    wd.findElement(By.xpath("//*[@id='email']")).sendKeys("TEXT");   /*enter text in search 
	    box*/
	}
	
	public static long max(long first, long... rest) {
	    long ret = first;
	    for (long val : rest) {
	        ret = Math.max(ret, val);
	    }
	    return ret;
	}
	
//	
//	public void nestStatusChange(String nestLocation) throws InterruptedException
//	{
//		System.out.println("nestStatusChange");
//			browCapabilities = new DesiredCapabilities();
//			browCapabilities.setCapability(CapabilityType.BROWSER_NAME, props.getProperty("browserName"));
//			System.setProperty(props.getProperty("browserDriver"), props.getProperty("browserPath"));
//			
//			wd = new FirefoxDriver();
//			wd.manage().window().maximize();
//			forceWait(5000);
//			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
//			wd.get(props.getProperty("nestURL"));
//			
//			forceWait(12000);
//			WebElement nestEmail = wd.findElement(By.className("email-input"));//("email"));
//			//Assert.assertTrue(wd.findElement(By.className("house")).isDisplayed());
//			//wd.findElement(By.className("house")).click();
//			nestEmail.click();
//
////			waitForPresence();
////			waitForElement(nestEmail);
////			 ((JavascriptExecutor)wd).executeScript("document.getElementById('email').value='sanjay'");
//			nestEmail.sendKeys("dnyanoba_kantode@whirlpool.com");//(props.getProperty("nestLogin"));
//			wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			wd.findElement(By.id("pass")).sendKeys(props.getProperty("nestPwd"));
//			wd.findElement(By.id("signin")).click();
//			forceWait(10000);
////			wd.findElement(By.className("navigation-button")).click();//xpath(".//*[@id='home-container']/div/div/div/div[3]/button[1]")).click();//
////			// Select appropriate Thermostat that selected in mobile Application
////			forceWait(5000);
////			wd.findElement(By.className("structure-list-item-content")).click();//name(nestLocation));
////			waitForElement(wd.findElement(By.xpath("//*[@id='home-container']/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/button[4]")));
//			wd.findElement(By.xpath("//*[@id='home-container']/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/button[4]")).click();//className("mode .mode-offline")).click();
//			forceWait(2000);
//			wd.findElement(By.xpath("//*[@id='home-container']/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/div/button[2]")).click();//className("mode mode-away")).click();		
//			forceWait(10000);
////			wd.findElement(By.className("mode mode-away")).click();
//			forceWait(3000);
//			wd.quit();


	public void nestStatusChangeHomeAndAway(String nestLocation, String HomeOrAway) throws InterruptedException
	{
			browCapabilities = new DesiredCapabilities();
			browCapabilities.setCapability(CapabilityType.BROWSER_NAME, props.getProperty("browserName"));
			System.setProperty(props.getProperty("browserDriver"), props.getProperty("browserPath"));
			
			wd = new FirefoxDriver();
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
			wd.get(props.getProperty("nestURL"));
			
			
			wd.findElement(By.className("email-input")).sendKeys(props.getProperty("nestLogin"));
			
			wd.findElement(By.className("pass-input")).sendKeys(props.getProperty("nestPwd"));
			wd.findElement(By.id("signin")).click();
			forceWait(10000);
			
//			wd.findElement(By.xpath("//button[@aria-label='Open Nest menu']")).click();
//			forceWait(2000);
//			// Select appropriate Thermostat that selected in mobile Application
//			if(nestLocation.equalsIgnoreCase("Singing Sands2")) {
//				wd.findElement(By.xpath("//div[@id='nest-menu']/div/div[2]/ul/li[2]/div/h1")).click();
//			}
//			if(nestLocation.equalsIgnoreCase("Singing Sands")) {
//				wd.findElement(By.xpath("//div[@id='nest-menu']/div/div[2]/ul/li[1]/div/h1")).click();
//			}
			if(HomeOrAway.equalsIgnoreCase("Home")) {
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[4]")).click();
				forceWait(2000);
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[2]")).click();
				forceWait(2000);
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[4]")).click();
				forceWait(2000);
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[1]")).click();
				
			}
			if(HomeOrAway.equalsIgnoreCase("Away")) {
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[4]")).click();
				forceWait(2000);
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[1]")).click();
				forceWait(2000);
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[4]")).click();
				forceWait(2000);
				wd.findElement(By.xpath("//div[@id='home-container']/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/button[2]")).click();
				
			}
			forceWait(2000);
			wd.quit();
	}
	
	public void signInGmail() throws InterruptedException {
		
//		browCapabilities = new DesiredCapabilities();
//		//System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
//		//browCapabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
//		//System.setProperty("webdriver.safari.driver", "/Applications/Safari.app/Contents/MacOS/Safari");
//		//browCapabilities.setCapability(CapabilityType.BROWSER_NAME, "Safari");
//		//wd = new SafariDriver();
//		browCapabilities.setCapability(CapabilityType.BROWSER_NAME, props.getProperty("browserName"));
//		System.setProperty(props.getProperty("browserDriver"), props.getProperty("browserPath"));
//		wd = new FirefoxDriver();
		
		browCapabilities = new DesiredCapabilities().firefox();
		browCapabilities.setCapability("marionette", true);

		System.setProperty("webdriver.firefox.marionette", "/Applications/geckodriver.exe");
		wd = new FirefoxDriver(browCapabilities);
		
		wd.manage().window().maximize();
		forceWait(5000);
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get(props.getProperty("eMailServiceURL"));
//		if(wd.findElement(By.linkText("SIGN IN")).isDisplayed() == true)
//		{
//			wd.findElement(By.linkText("SIGN IN")).click();
//		}
		
		if(!wd.findElements(By.xpath("//a[@data-g-label='Sign in']")).isEmpty()) {	         
			wd.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
			forceWait(1000);
		}
		
		wd.findElement(By.name("identifier")).sendKeys(props.getProperty("eMailLoginAndroid"));
		forceWait(2000);
		wd.findElement(By.name("identifier")).sendKeys(Keys.ENTER);
		forceWait(10000);
		
		wd.findElement(By.name("password")).sendKeys(props.getProperty("eMailPwd"));
		wd.findElement(By.name("password")).sendKeys(Keys.ENTER);
		forceWait(10000);
	}
	
	public void openResetPwdAndConfAccountEmail(String acctConfResetPwdElementName) throws InterruptedException {
		signInGmail();
		//forceWait(20000);
		//WebElement settings = new WebDriverWait(ad, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RelativeLayout[1]/android.widget.TextView[1]")));
//		//String element = "//span/b[text()='"+acctConfResetPwdElementName+"']"+" | "+"//span[text()='"+acctConfResetPwdElementName+"']";
//		String element = "//span/b[.='"+acctConfResetPwdElementName+"']";
//		wd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		//forceWait(10000);
//		wd.findElement(By.xpath(element)).click();       
		WebElement element = new WebDriverWait(wd, 180).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/b[.='"+acctConfResetPwdElementName+"']")));
//		WebElement element = wd.findElement(By.xpath("//span/b[.='"+acctConfResetPwdElementName+"']"));
//		waitForElement(element);
		element.click();
	}
	
	
	public int confirmAccount(Properties languageProps) throws MalformedURLException, InterruptedException 
	{
		this.openResetPwdAndConfAccountEmail("Confirmation instructions");
//		signInGmail();
		//forceWait(10000);
//		//String element = "//span[text()='Confirmation instructions']";
//		//wd.findElement(By.xpath(element)).click();
//		wd.findElement(By.xpath("//div[@class='y6']")).click();
		//forceWait(5000);
//
//		WebElement confirmEmail = wd.findElement(By.linkText("Confirm my account"));
//	    confirmEmail.click();
//	    forceWait(20000);
	    
		
		if(this.language.equalsIgnoreCase("English")) {
			WebElement confirmEmail = new WebDriverWait(wd, 180).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Confirm Account")));
					//wd.findElement(By.linkText("Confirm my account"));
		    confirmEmail.click();
		}
		if(this.language.equalsIgnoreCase("French")) {
			WebElement resetPwd = new WebDriverWait(wd, 180).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Confirmer mon compte']")));
					//wd.findElement(By.xpath("//a[.='Confirmer mon compte']"));
					//wd.findElement(By.name("Confirmer mon compte"));
			forceWait(5000);
			resetPwd.click();
		}
      
	    Set <String> handles =wd.getWindowHandles();
		Iterator<String> it = handles.iterator();
        //iterate through your windows
			
		String parent = it.next();
		System.out.println("parent window:"+parent);
    	String newwin = it.next();
    	System.out.println("new window:"+newwin);		    	
	   	wd.switchTo().window(newwin);
		    
	   	System.out.println("new window"+wd.getTitle());
	   	waitForPageLoad(wd);
		forceWait(5000);
		//perform actions on new window
	   	wd.close();
	    wd.switchTo().window(parent);
	    System.out.println("Parent window is:"+wd.getTitle());
	    forceWait(10000);//*[@id=":ad"]/p[2]#\:a3 > p:nth-child(2)
	    
//	    String accountConfInstLine1 = wd.findElement(By.xpath("//div[text()='Dear Harry,']")).getText();
	  
//        String accountConfInstLine2 = wd.findElement(By.xpath("//div[contains(@class,'a3s')]/p[2]")).getText();
//	    String accountConfInstLine2 = wd.findElement(By.xpath("//*[text()='Your account has been successfully created, but before activating you will need to confirm your email address. This ensures that we have the correct email address associated with this account.']")).getText();
//	    System.out.println("1234567890--"+accountConfInstLine2);
//        String accountConfInstLine3 = wd.findElement(By.xpath("//div[contains(@class,'a3s')]/p[3]")).getText();
//        String accountConfInstLine4 = wd.findElement(By.xpath("//div[contains(@class,'a3s')]/p[4]")).getText();        
        
//		Assert.assertEquals(accountConfInstLine1, "Dear "+firstName+"!");
		
//        if(this.language.equalsIgnoreCase("French"))
//        {
//        	Assert.assertEquals(accountConfInstLine2, "Votre compte a été créé, cette étape assure que nous avons l'adresse de courriel correctement associée à ce compte. Avant l'activation du compte, vous devrez confirmer votre adresse de courriel en cliquant sur le lien suivant.");
//        }
//        else
//        {
//        	
//        	Assert.assertEquals(accountConfInstLine1, "Dear Harry,");
//        	Assert.assertEquals(accountConfInstLine2, languageProps.getProperty("accountConfInstLine"));
//        	Assert.assertEquals(accountConfInstLine2, languageProps.getProperty("accountConfInstLine2"));
//			}
//		Assert.assertEquals(accountConfInstLine3, languageProps.getProperty("accountConfInstLine3"));
//		Assert.assertEquals(accountConfInstLine4, languageProps.getProperty("accountConfInstLine4"));
	
			
		// Navigate to Back to Inbox Page
		wd.findElement(By.partialLinkText("Inbox")).click();  
		wd.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);	
	     
		//Select All emails to delete
		WebElement selectAllEmails = new WebDriverWait(wd,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-Jo-auh' and @role='presentation']")));
		selectAllEmails.click();	
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					 
		if(!wd.findElements(By.xpath("//span[@aria-checked='true']")).isEmpty()) {	         
				WebElement deleteAllEmails = new WebDriverWait(wd,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Delete' and @role='button']")));
				deleteAllEmails.click();
		}
		wd.quit();
	return 1;        
	}
	
	public void deleteInboxEmails() throws MalformedURLException, InterruptedException 
	{
		this.signInGmail();
	              
		// Select All emails
		System.out.println("Select All Emails");
		forceWait(5000);
		WebElement selectAllEmails = new WebDriverWait(wd,50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-Jo-auh' and @role='presentation']")));
		if(!wd.findElements(By.name("Your Primary tab is empty.")).isEmpty()) {
			System.out.println("No emails to delete. . . ");
		}
		else{
			selectAllEmails.click();
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			if(!wd.findElements(By.xpath("//span[@aria-checked='true']")).isEmpty()) {	         
				WebElement deleteAllEmails = new WebDriverWait(wd,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Delete' and @role='button']")));
				forceWait(1000);
				deleteAllEmails.click();
				forceWait(3000);
			}
		}
		//close the driver
		wd.quit();    
	}
	
	public int resetPassword(String newPwd, String newConfPwd) throws MalformedURLException, InterruptedException 
	{
		if(this.language.equalsIgnoreCase("English")) {
			this.openResetPwdAndConfAccountEmail("Reset password instructions");
			WebElement resetPwd = wd.findElement(By.linkText("Change My Password"));
			resetPwd.click();
		}
		if(this.language.equalsIgnoreCase("French")) {
			this.openResetPwdAndConfAccountEmail("Instructions de réinitialisation du mot de passe");
			WebElement resetPwd = wd.findElement(By.linkText("Modifier mon mot de passe"));
			resetPwd.click();
		}
		
		
//		if(this.language.equalsIgnoreCase("English")) {
//			this.openResetPwdAndConfAccountEmail("Confirmation instructions");
//			WebElement confirmEmail = wd.findElement(By.linkText("Confirm Account"));
//		    confirmEmail.click();
//		}
//		if(this.language.equalsIgnoreCase("French")) {
//			this.openResetPwdAndConfAccountEmail("Instructions de réinitialisation du mot de passe");
//			WebElement confirmEmail = wd.findElement(By.linkText("Confirmer mon compte"));
//			confirmEmail.click();
//		}
//			this.openResetPwdAndConfAccountEmail("Confirmation instructions");
//
//	        WebElement resetPwd = wd.findElement(By.linkText("Change my password"));
//	        resetPwd.click();
	       
	        Set <String> handles = wd.getWindowHandles();
			Iterator<String> it = handles.iterator();
	        //iterate through your windows
			
				String parent = it.next();
				System.out.println("parent window:"+parent);
		    	String newwin = it.next();
		    	System.out.println("new window:"+newwin);
		    	wd.switchTo().window(newwin);
		    	
		    	System.out.println("new window"+wd.getTitle());
				wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//perform actions on new window
				forceWait(5000);
				
				wd.findElement(By.id("member_password")).sendKeys(newPwd);
				forceWait(2000);
				wd.findElement(By.id("member_password_confirmation")).sendKeys(newConfPwd);
				wd.findElement(By.xpath("//input[@value='Change My Password']")).click();
//				changeMyPassword.click();
//				wd.findElement(By.linkText("Change My Password")).click();
				forceWait(5000);
				
		    	wd.close();
			    wd.switchTo().window(parent);
			    System.out.println("Parent window is"+wd.getTitle());
			
				
				// Navigate to Back to Inbox Page
				wd.findElement(By.partialLinkText("Inbox")).click();  
				wd.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);	
			     
				//Select All emails to delete
				WebElement selectAllEmails = new WebDriverWait(wd,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='T-Jo-auh' and @role='presentation']")));
				selectAllEmails.click();	
				wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
							 
				if(!wd.findElements(By.xpath("//span[@aria-checked='true']")).isEmpty()) {	         
						WebElement deleteAllEmails = new WebDriverWait(wd,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Delete' and @role='button']")));
						deleteAllEmails.click();
				}
				wd.quit();
				return 1;        
		}
	
	

// This method code is included into confirmAccount method, if required can be taken as separate test case	
/*	
	public void verifyAccountConfInstructions(Properties languageProps) throws InterruptedException {
		
		this.openResetPwdAndConfAccountEmail("Confirmation instructions");
		
		String accountConfInstLine1 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[1]")).getText();
        String accountConfInstLine2 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[2]")).getText();
        String accountConfInstLine3 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[3]")).getText();
        String accountConfInstLine4 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[4]")).getText();
        
        
		//Assert.assertEquals(accountConfInstLine1, "Dear "+firstName+"!");
		Assert.assertEquals(accountConfInstLine2, languageProps.getProperty("accountConfInstLine2"));
		Assert.assertEquals(accountConfInstLine3, languageProps.getProperty("accountConfInstLine3"));
		Assert.assertEquals(accountConfInstLine4, languageProps.getProperty("accountConfInstLine4"));
	
			
		// Navigate to Back to Inbox Page
		wd.findElement(By.partialLinkText("Inbox")).click();  
		wd.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
	}
*/	
	public void verifyResetPasswordInstructions(Properties languageProps) throws InterruptedException {
		
		this.openResetPwdAndConfAccountEmail("Reset password instructions");	

        String pwdInstLine1 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[1]")).getText();
        String pwdInstLine2 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[2]")).getText();
        String pwdInstLine3 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[3]")).getText();
        String pwdInstLine4 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[4]")).getText();
        String pwdInstLine5 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[5]")).getText();
        String pwdInstLine6 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[6]")).getText();
        String pwdInstLine7 = wd.findElement(By.xpath("//div[@class = 'a3s']/p[7]")).getText();
        
		//Assert.assertEquals(pwdInstLine1, "Dear"+resetPwdEmail+"!");
		Assert.assertEquals(pwdInstLine2, languageProps.getProperty("pwdInstLine2"));
		Assert.assertEquals(pwdInstLine3, languageProps.getProperty("pwdInstLine3"));
		Assert.assertEquals(pwdInstLine4, languageProps.getProperty("pwdInstLine4"));
		Assert.assertEquals(pwdInstLine5, languageProps.getProperty("pwdInstLine5"));
		Assert.assertEquals(pwdInstLine6, languageProps.getProperty("pwdInstLine6"));
		Assert.assertEquals(pwdInstLine7, languageProps.getProperty("pwdInstLine7"));		
		
	}
	

	
	
	public void iosPageScroll(IOSDriver driver, String direction)
	{
	
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			HashMap<String, String> scrollObject1 = new HashMap<String, String>();
			//scrollObject1.put("element", ((RemoteWebElement) iosDriv.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]"))).getId());
			scrollObject1.put("direction", direction);
			js1.executeScript("mobile: scroll", scrollObject1);			
		
	}
	
	static void waitForPageLoad(WebDriver wdriver) {
	    WebDriverWait wait = new WebDriverWait(wdriver, 60);

	    Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {

	        @Override
	        public boolean apply(WebDriver input) {
	            return ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
	        }

	    };
	    wait.until(pageLoaded);
	}
	
	public void switchToBrowser() {
		Set <String> handles = wd.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
        //iterate through your windows	
		for(int i=0; i<handles.size();i++) {
			String [] window = new String[handles.size()];
			System.out.println(".........Window handles size::"+handles.size());
			window[i]= it.next();	
			System.out.println(".........Window Names:"+window[i]);
			wd.switchTo().window(window[i]);
		}
	}
	
	public void navigateOnDashboard(AndroidDriver<WebElement> ad) throws InterruptedException
	{
		System.out.print("Trying to reach to Dashboard");
		forceWait(2000);
		this.waitForProgress(ad);
		
	if(ad.findElements(By.id("activity_dashboard_tab_strip")).isEmpty()){
		System.out.println("Not on Dashboard");
		//while(ad.findElements(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")).isEmpty()){
		if(!ad.findElements(MobileBy.AccessibilityId("text/languageProps.getProperty('error')")).isEmpty()){
			ad.findElement(MobileBy.AccessibilityId("text/languageProps.getProperty('ok')")).click();
			forceWait(1000);
		}
		
		if(!ad.findElements(MobileBy.AccessibilityId("text/languageProps.getProperty('ok')")).isEmpty() ){
			ad.findElement(MobileBy.AccessibilityId("text/languageProps.getProperty('ok')")).click();
			forceWait(1000);
		}
		
		
		if(!ad.findElements(MobileBy.AccessibilityId("text/languageProps.getProperty('cancel')")).isEmpty()){
			ad.findElement(MobileBy.AccessibilityId("text/languageProps.getProperty('cancel')")).click();
			forceWait(1000);
		}
		
		if(!ad.findElements(By.id("info_layout_images_appliance_icon_imageview")).isEmpty() ){
			System.out.println("Tag name >> "+ad.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).getText());
			ad.navigate().back();
			forceWait(1000);
		}
		
		if(!ad.findElements(MobileBy.AccessibilityId("text/languageProps.getProperty('autoReorder')")).isEmpty()){
			ad.navigate().back();
			//ad.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
			forceWait(2000);
			
			if(!ad.findElements(MobileBy.AccessibilityId("text/languageProps.getProperty('autoReorder')")).isEmpty()){
				ad.navigate().back();
				//ad.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
				forceWait(2000);
			}
		}
		
		if(!ad.findElements(MobileBy.AccessibilityId("text/languageProps.getProperty('settings')")).isEmpty()){
			ad.navigate().back();
			//ad.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
			forceWait(2000);
		}
	}
		
//		if(ad.findElements(By.name(languageProps.getProperty("error")).isEmpty()){
//			ad.findElement(By.name("Cancel")).click();
//			forceWait(1000);
//		}
		{
		System.out.print(" ..");
//		ad.navigate().back();
//		forceWait(5000);
//		if(ad.findElements(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")).isEmpty()){
//			System.out.println("Again back");
////			ad.navigate().back();
//			forceWait(5000);
//		}
		}	
		System.out.println(" >");
	}
	
	@SuppressWarnings("rawtypes")
	public  boolean waitForProgress(final AndroidDriver ad) throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(ad, 300);
		 forceWait(1000);
		 System.out.println("- |");

//		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progress")));
//		 WebElement pro = ad.findElement(By.id("progress"));
//		 WebElement load = ad.findElement(By.name("Loading..."));
//		 wait.until(ExpectedConditions.invisibilityOfAllElements(pro,load));
//		 wait.until(ExpectedConditions.invisibilityOfElementLocated(pro));invisibilityOf(pro));
//		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Saving...")));
//		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Please wait...")));
//		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("Deleting appliance...")));
		 
		    try {
		        ad.manage().timeouts()
		                .implicitlyWait(1, TimeUnit.SECONDS);

//		        WebDriverWait wait = new WebDriverWait(UITestBase.driver,
//		                DEFAULT_TIMEOUT);

		        boolean present = wait
		                .ignoring(StaleElementReferenceException.class)
		                .ignoring(NoSuchElementException.class)
		                .pollingEvery((long) 0.10, TimeUnit.SECONDS)
		                .until(ExpectedConditions.invisibilityOfElementLocated(By.id("progress")));
		        
		        return present;
		    } catch (Exception e) {
		        return false;
		    } finally {
		        ad.manage().timeouts()
		                .implicitlyWait(1, TimeUnit.SECONDS);
		    }
	}
	

	public NARWhrAndroidHelper()
	{
		try {
//			System.out.println("@Initialization of Test properties");
					
			this.configFile = new File("config.properties");
			this.configReader = new FileReader(configFile);
			
		    this.props = new Properties();
		    this.props.load(configReader);		   
		    this.configReader.close();  
		}
		catch (FileNotFoundException ex) {
	       // file does not exist
		   System.out.println("file does not exist");
		} catch (IOException ex) {
	       // I/O error
		   System.out.println("I/O error");
		}
		
	}
	
	
}


   

