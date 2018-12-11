package gis.sit.narwhrandroidpageobjects;

import gis.sit.narwhrautomation.NARWhrAndroidHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidVestaOvenHome extends NARWhrAndroidHelper{
	
	public NARWhrAndroidVestaOvenHome(AppiumDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Appliance Name
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.TextView[1]")
	public WebElement titleText;

	// Image - Appliance menu
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.ImageView[1]")
	public WebElement applianceMenu;
	
	// Button - Back
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
	public WebElement backButton;


	// Image - Remote enable icon
	@AndroidFindBy(id="info_layout_images_remote_start_imageview")
	public WebElement remoteEnableicon;
	
	// Text - Remote Control
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public WebElement remoteControlText;
	
	// Text - Remote Control
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ToggleButton[1]")
	public WebElement remoteControlButton;
	
	// Set Oven
	@AndroidFindBy(xpath="//*[contains(@text,'Set Oven')]")
	public WebElement setoven;
	
	// Set Oven
	@AndroidFindBy(xpath="//*[contains(@text,'Kitchen Timer')]")
	public WebElement kitchenTimer;
	
	// Mode
	@AndroidFindBy(id="list_item_cooking_mode_selected_label")
	public WebElement mode;
	
	// Select Mode
	@AndroidFindBy(id="title")
	public List<WebElement> selectMode;
	
	// Select Control Mode
	@AndroidFindBy(id="control")
	public List<WebElement> controlMode;
	
	//  Temp
	@AndroidFindBy(id="list_item_cooking_temperature_selected_label")
	public WebElement temp;
	
	//  select Temp
	@AndroidFindBy(id="title")
	public List<WebElement> selectTemp;
	
//  select Temp
	@AndroidFindBy(id="control")
	public List<WebElement> controlTemp;
	
	//  Cooking time
	@AndroidFindBy(id="list_item_cooking_time_selected_label")
	public WebElement cookingTime;
	/**** Kitchen Timer ***/
	//  Turn Off Timer
	@AndroidFindBy(id="turnofftimer")
	public WebElement turnOffTimer;
	
	//  Start timer
	@AndroidFindBy(id="start_timer")
	public WebElement startkitchenTimer;
	
	//Kitchen Timer View on DashBoard
	@AndroidFindBy(id="kitchen_timer_running_view_text")
	public WebElement kitchenTimerRunningView;
	
	//  Cooking time Minute
	@AndroidFindBy(id="numberpicker_input")
	public List<WebElement> cookingTimeMinute;
	
	//  Cooking time Minute Lower
	@AndroidFindBy(xpath="//android.widget.Button[@index='2']")
	public List<WebElement> cookingTimeMinuteLowerPress;
	
	//  Cooking time Minute set
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement setTime;
	
	//Start Now Button
	@AndroidFindBy(id="start_btn")
	public WebElement startNow;
	
	//Send To Appliance
	@AndroidFindBy(id="send_btn")
	public WebElement sendToAppliance;
	
	//ETR Minutes
	@AndroidFindBy(id="info_layout_temperature_and_time_based_appliance_minute_text_view")
	public WebElement ETR;
	
	
	
	/*** Cook Time Complete Page ****/
	
	//Cook Time Complete Text
	@AndroidFindBy(id="keepwarm_cooktimecomplete")
	public WebElement cookTimeComplete;
	
	//Cook Time Complete Cavity
	@AndroidFindBy(id="keepwarm_cooktimecomplete_cavity")
	public WebElement cookTimeCompleteCavity;
	
	//Start Cook Time Again
	@AndroidFindBy(id="send_dialog_button")
	public WebElement startCooktime;
	
	//End Cook Time 
	@AndroidFindBy(id="end_now_dialog_button")
	public WebElement endNowButton;
	
	//Start Cook Time : Keep warm or Hold Temp
	@AndroidFindBy(id="send_dialog_button")
	public WebElement startButton;
	
	//Appliance Status
	@AndroidFindBy(id="info_layout_temperature_and_time_based_appliance_state_text_view")
	public WebElement applianceStatus;
	
	//Cycle Picker
	@AndroidFindBy(id="cycle_picker")
	public WebElement cyclePicker;
	
	//Minute Picker
	@AndroidFindBy(id="minute_picker")
	public List<WebElement> minutePicker;
	
	//Neea a little more time? Text
	@AndroidFindBy(xpath="//*[contains(@text,'Need a little more time? No Problem!')]")
	public WebElement descText;
	
	/**** Favorites ***/
	//Favorite Textbox
	@AndroidFindBy(id="my_creation_title")
	public WebElement favoriteTextBox;
	
	//Add a Step Button
	@AndroidFindBy(id="my_creation_step_add_button")
	public WebElement addAStep;
	
	//Favorite save button
	@AndroidFindBy(id="fragment_cycle_selection_save")
	public WebElement saveButton;
	
	//Created Fav name
	@AndroidFindBy(id="list_item_my_creation_name")
	public List<WebElement> createdFavName;
	
	//Favourite tab 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Favorites']")
	public WebElement favoriteTab;
	
	//create favorite
	@AndroidFindBy(xpath="//android.widget.Button[@text='Create Favorite']")
	public WebElement createFavourite;
	
	//Favorite Step Title
	@AndroidFindBy(id="favorite_step_title")
	public List<WebElement> favoriteStepTitle;
	
	//Favorite Step Value
	@AndroidFindBy(id="favorite_step_value")
	public List<WebElement> favoriteStepValue;
	
	//Save as favourite Button
	@AndroidFindBy(id="save_as_favorite_button")
	public WebElement saveAsFavorite;
		
	//Save as favourite Edit Box
	@AndroidFindBy(id="dialog_cycle_name_edit_text")
	public WebElement saveAsFavoriteName;
		
	//Save favorite 
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement savefavorite;
	
	//Save favorite Radio Button
	@AndroidFindBy(id="radioButton")
	public List<WebElement> radioButtonFav;
	
	//Send Button 
	@AndroidFindBy(id="my_creation_button_send")
	public WebElement sendButtonFavouriteScreen;
	
	//delete favorite
	@AndroidFindBy(xpath="//android.widget.Button[@text='Delete Favorite']")
	public WebElement deletefavourite;
	
	//delete button
	@AndroidFindBy(id="buttonDefaultPositive")
	public WebElement deletebutton;
	
	
}
