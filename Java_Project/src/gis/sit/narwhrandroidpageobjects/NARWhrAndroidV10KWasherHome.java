package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidV10KWasherHome {
	
	public NARWhrAndroidV10KWasherHome(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Washer Cycles
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Washer Cycles']")
	public WebElement washerCycles; 
	
	//What To Wash
	@AndroidFindBy(xpath="//android.widget.Button[@text='Mixed']")
	public WebElement whatToWash;
	
	//How To Wash
	@AndroidFindBy(xpath="//android.widget.Button[@text='Normal']")
	public WebElement howToWash;
	
	//Select Cycle - Utility Tools
	@AndroidFindBy(xpath="//android.widget.Button[@text='Select Cycle']")
	public WebElement utilityTools;
	
	//Temperature
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Temperature']")
	public WebElement temperature; 
	
	//Soil Level
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Soil Level']")
	public WebElement soilLevel; 
	
	//Spin Speed
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Spin Speed']")
	public WebElement spinSpeed; 
	
	//Switches
	@AndroidFindBy(xpath="//android.widget.Switch")
	public List<WebElement> switches; 
	
	//radio buttons of Saved Cycle in Favourite Screen
	@AndroidFindBy(xpath="//android.widget.RadioButton")
	public List<WebElement> radioButtons;
	
	//Image buttons of Saved Cycle in Favourite Screen
	@AndroidFindBy(id="android.widget.TextView")
	public List<WebElement> textview;
	
	//List Text View
	@AndroidFindBy(id="list_item_cycle_result_info_button")
	public List<WebElement> imageButtons;
	
	//List Result Name
	@AndroidFindBy(id="list_item_cycle_result_name")
	public List<WebElement> resultName;
	
	//Send Button 
	@AndroidFindBy(id="send_button")
	public WebElement sendButton;
	
	//Send to Appliance 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Send to Appliance']")
	public WebElement sendToAppliance;
	
	//Confirm
	@AndroidFindBy(id="title")
	public WebElement confirm;
	
	//Save as favourite Button
	@AndroidFindBy(id="save_as_favorite_button")
	public WebElement saveAsFavorite;
	
	//Save as favourite Edit Box
	@AndroidFindBy(id="dialog_cycle_name_edit_text")
	public WebElement saveAsFavoriteName;
	
	//Save favorite 
	@AndroidFindBy(id="save_dialog_button")
	public WebElement savefavorite;
	
	//Favourite tab 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Favorites']")
	public WebElement favoriteTab;
	
	//delete favorite
	@AndroidFindBy(xpath="//android.widget.Button[@text='Delete Favorite']")
	public WebElement deletefavourite;
	
	//create favorite
	@AndroidFindBy(xpath="//android.widget.Button[@text='Create Favorite']")
	public WebElement createFavourite;
	
	// favorite Edit Box
	@AndroidFindBy(id="fragment_edit_appliance_appliance_name_edittext")
	public WebElement favoriteName;
	
	// Cycle Name Edit Box
	@AndroidFindBy(id="list_item_cycle_settings_selected_text_field")
	public WebElement cycleName;
	
	//default message favorite
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'You currently have no favorites saved.')]")
	public WebElement defaultmessagefavourite;
	
	//delete button
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement deletebutton;
	
	//Save Modify Favorite 
	@AndroidFindBy(id="fragment_cycle_selection_save")
	public WebElement saveModifyFavbutton;
	
	//delete button
	@AndroidFindBy(id="save_button")
	public WebElement saveButton;
	
	// Text - Appliance Name
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement titleText;

	// Image - Appliance menu
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
	public WebElement applianceMenu;
	
	// Button - Back
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;

//	// Text - Cycle name
//	@AndroidFindBy()
//	public WebElement cycleText;
//
//	// Text - Minutes text
//	@AndroidFindBy()
//	public WebElement minutesText;
//
//	// Text - Time unit
//	@AndroidFindBy()
//	public WebElement timeUnit;
//
//	// Text - Cycle remote text
//	@AndroidFindBy()
//	public WebElement cycleRemoteState;

	// Image - Remote enable icon
	@AndroidFindBy(id="info_layout_images_remote_start_imageview")
	public WebElement remoteEnableicon;
	
	
	// Text - ETR
	@AndroidFindBy(id="info_layout_time_based_appliance_minute_text_view")
	public WebElement ETR;

	// Text - Washer Cycles
	@AndroidFindBy(id="list_item_appliance_control_button_textview")
	public WebElement washerCycleText;

	// Text - Delay header
	@AndroidFindBy(id="list_item_appliance_detail_delay_header")
	public WebElement delayHeaderText;

	// Text - Delay actual time
	@AndroidFindBy(id="list_item_appliance_detail_delay_time")
	public WebElement delayTime;

	// Text - Remote Control
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement remoteControlText;

	// Text - Remote Control
	@AndroidFindBy(id="list_item_appliance_control_button_togglebutton")
	public WebElement remoteControlButton;

	// Text - Quiet Mode
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement quietModeText;

	// Button - Quiet Mode Switch Button
	@AndroidFindBy(id="list_item_appliance_control_switch_switch")
	public WebElement quietModeButton;

	// Text - Load Fresh Cycle
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement loadFreshCycleText;
	
	
}
