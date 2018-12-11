 package gis.sit.narwhrautomation;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NARWhrAndroidV10KWasher extends NARWhrAndroidTestRepository {
	
//	@BeforeTest
	public void t000_cleanUpInbox() throws MalformedURLException, InterruptedException {
		cleanUpInbox();
	}
	
	
	@Test(priority=1, alwaysRun=true, dataProvider="testProperties")
	public void t001_initializeTestProperties(String deviceType, String osVersion, String mobAppPath, String appPackage, String deviceName, String appActivity, String avdAPI, String language, String m2mEnvironment, String environment, String exe) throws MalformedURLException, InterruptedException {
		System.out.println("t001_initializeTestProperties");
		t01_initializeTestProperties(deviceType, osVersion, mobAppPath, appPackage, deviceName, appActivity, avdAPI, language, m2mEnvironment, environment, exe);
		System.out.println("Success");
	}
	
	
	@Test(priority=2, alwaysRun=false, dependsOnMethods={"t001_initializeTestProperties"})
   	public void t002_launchAndroidApp() throws Exception {
		System.out.println("t002_launchAndroidApp");	
		this.t02_launchAndroidApp();
		System.out.println("Success");
	}	
	
	
	@Test (priority = 3, alwaysRun=true, dependsOnMethods={"t002_launchAndroidApp"}) 
	private void t003_loginPageFieldNameValidation() throws Exception {
		System.out.println("t003_loginPageFieldNameValidation");
		this.t03_loginPageFieldNameValidation();
		System.out.println("Success");
	}
	
	
	
	@Test (priority = 4, alwaysRun=true, dataProvider = "signIn", dependsOnMethods={"t003_loginPageFieldNameValidation"})
	public void t004_signIn(String emailOld, String pwd, String rememberMe, String correctCredentials) throws Exception {
		System.out.print("01. signIn()");
		this.t08_signIn(emailOld, pwd, rememberMe, correctCredentials);
		System.out.println("Success");
	}
	
	@Test (priority = 5, alwaysRun=true, dataProvider="addAppliance", dependsOnMethods={"t004_signIn"})
	public void t009_AddAppliance(String applianceType, String SAID, String MACID) throws Exception
	{   
		System.out.println("Add Appliance");
		isV10kWasher=true;
		this.t10_addAppliance(applianceType, SAID, MACID);
		System.out.println("Success");
	}
	
	@Test (priority = 6, alwaysRun=true, dataProvider="notoficationOptingProcess", dependsOnMethods={"t009_AddAppliance"})
	public void t017_notificationOptV10KWasher(String ApplianceType,String NotificationOption) throws Exception
	{	
		System.out.println("Notification Opting in and Air Flow status");
		this.isV10kWasher = true;
		this.notificationOptProcess(ApplianceType,NotificationOption);
		forceWait(2000);
		System.out.println("Success");

	}
	
	
	@Test (priority = 7, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t017_notificationOptV10KWasher"})
	public void t62_SelectCycleUIValidation(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception{
		System.out.print("62. Verify Select Cycle page");
		this.isV10kWasher = true;
//		this.isV10kDryer = true;
		this.t64_verifySelectCyclePage(ApplianceType,WhatToWasherDry,HowToWasherDry,Wrinkle);
		System.out.println("Success");
	}
	
	@Test (priority = 8, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t62_SelectCycleUIValidation"})
	public void t61_selectCycleandSendToAppliance(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception
	{
		System.out.print("61. Select Cycle and Send To Appliance");
		this.isselectCycle=true;
		this.t65_selectCycleandSendToAppliance(ApplianceType, WhatToWasherDry, HowToWasherDry,Wrinkle);
		this.isselectCycle=false;
		System.out.println("Success");
	}
	
	
	@Test (priority = 9, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t61_selectCycleandSendToAppliance"})
	public void t010_v10kWasherRemoteStart(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception
	{
		System.out.println("t010_Remote Start Process Begin");
//		this.isV10kDryer = true;
		this.remoteStartDryer(ApplianceType, WhatToWasherDry, HowToWasherDry, Wrinkle);;
		System.out.println("claimed-"+isV10kWasher);
		System.out.println("Success");
	}
	
	@Test (priority = 10, alwaysRun=true, dataProvider="notoficationOptingProcess", dependsOnMethods={"t010_v10kWasherRemoteStart"})
	public void t018_pushnotificationV10kWasher(String ApplianceType,String NotificationOption) throws Exception
	{	
		System.out.println("Push Notification");
//		this.isMobDryer = true;
		this.pushNotificationTest(ApplianceType, NotificationOption);
		forceWait(2000);
		System.out.println("Success");

	}
	
	@Test (priority = 11, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t018_pushnotificationV10kWasher"})
	public void t58_v10kSendCycleToFavorite(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception{
		System.out.print("58. Send Cycle To Favorite");
//		this.isV10kWasher = true;
		this.isselectCycle=false;
		this.t58_v10kSelectCycle(ApplianceType, WhatToWasherDry, HowToWasherDry,Wrinkle);
		this.t60_favorite("Automation Test");
		this.t61_verifyDefaultFavoriteScreen();
		System.out.println("Success");
	}
	
	@Test (priority = 12, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t58_v10kSendCycleToFavorite"})
	public void t59_createFavorite(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception{
		System.out.print("59. Create New Favorite");
		this.isV10kWasher = true;
//		this.isV10kDryer = true;
		this.t63_createNewFavorite(ApplianceType, WhatToWasherDry, HowToWasherDry,Wrinkle);
		System.out.print("Success");
	}
	
	
	@Test (priority = 13, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t59_createFavorite"})
	public void t60_createFavoriteandSendToAppliance(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception{
		System.out.print("59. Create New Favorite and Send To Appliance");
		this.isV10kWasher = true;
//		this.isV10kDryer = true;
		this.t62_createNewFavoriteSendToAppliance(ApplianceType, WhatToWasherDry, HowToWasherDry,Wrinkle);
		System.out.print("Success");
	}
	@Test (priority = 14, alwaysRun=true, dataProvider = "sendCycle", dependsOnMethods={"t60_createFavoriteandSendToAppliance"})
	public void t60_CreateFavoriteUIValidation(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String Wrinkle) throws Exception{
		System.out.print("60. Verify Favorite Fields");
		this.isV10kWasher = true;
//		this.isV10kDryer = true;
		this.t63_verifyFavoriteFields(ApplianceType, WhatToWasherDry, HowToWasherDry,Wrinkle);
		System.out.print("Success");
	}
	
	
	@Test (priority = 15, alwaysRun=true, dataProvider = "ModifyFavoriteData", dependsOnMethods={"t60_CreateFavoriteUIValidation"})
	public void t61_ModifyCreatedFavorite(String ApplianceType,String WhatToWasherDry,String HowToWasherDry,String WhatToWasherDryNew,String HowToWasherDryNew) throws Exception{
		System.out.print("61. Modify Favorite Fields");
		this.isV10kWasher = true;
//		this.isV10kDryer = true;
		this.t64_ModifyFavoriteFields(ApplianceType,WhatToWasherDry,HowToWasherDry,WhatToWasherDryNew,HowToWasherDryNew);
		System.out.print("Success");
	}
		

	@Test (priority = 16, alwaysRun=true, dataProvider="deleteAppliance", dependsOnMethods={"t61_ModifyCreatedFavorite"})
	public void t018_deleteAppliance(String applianceType, String SAID, String MACID) throws Exception
	{   System.out.println("18 deleteAppliance");
		this.deleteAppliance(applianceType, SAID, MACID);
		System.out.println("Success");
	}
	
	@Test (priority = 17, alwaysRun=true, dependsOnMethods={"t018_deleteAppliance"})
	public void t019_SignOut() throws Exception {
		System.out.println("5. SignOut ");
		this.signOut();
		System.out.println("Success");
	}
	

	@AfterTest
	public void t055_closeApp() throws InterruptedException, IOException
	{
		this.driverClose();
	}	

}
