package gis.sit.narwhrandroidpageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class NARWhrAndroidEnergyReportDetailsPage 
{
	public NARWhrAndroidEnergyReportDetailsPage(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// Text - Energy Report details page
	@AndroidFindBy(name = "Energy Report")
	public WebElement energyReportDetailsText;
	
	// Text - Energy Report details page
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Energy Report']")
	public WebElement energyReportText;
	
	// Image - Energy report details appliance image
	@AndroidFindBy(id = "list_item_energy_report_header_appliance_image_view")
	public WebElement energyReportDetailsApplianceImage;
		
	// Text - Energy report details appliance name text[Clothes Dryer,Clothes Washer,Refrigerator]
	@AndroidFindBy(id = "list_item_energy_report_header_appliance_name_text_view")
	public WebElement energyReportDetailsApplianceNameText;
		
	// Text - Energy report details energy usage unit text
	@AndroidFindBy(id = "list_item_energy_report_header_last_cycle_energy_usage_units_text_view")
	public WebElement energyReportDetailsEnergyUsageUnitText;

	// Text - Energy report details avg cycle usage text
	@AndroidFindBy(id = "list_item_energy_report_header_average_cycle_usage_text_view")
	public WebElement energyReportDetailsAverageCycleUsageText;	
		
	// Text - Energy report details avg cycle usage watt hours text
	@AndroidFindBy(id = "list_item_energy_report_header_average_cycle_usage_watt_hours_text_view")
	public WebElement energyReportDetailsAverageCycleUsageWattHoursText;
					
	// Text - Energy report details total week usage text
	@AndroidFindBy(id = "list_item_energy_report_header_total_week_usage_text_view")
	public WebElement energyReportDetailsTotalWeekUsageText;	

	// Text - Energy report details total week usage watt hours text
	@AndroidFindBy(id = "list_item_energy_report_header_total_week_usage_watt_hours_text_view")
	public WebElement energyReportDetailsTotalWeekUsageWattHoursText;
		
	// Text - Energy report details average cycle usage text[id=list_item_energy_report_header_average_cycle_usage_label]
	@AndroidFindBy(id = "list_item_energy_report_header_average_cycle_usage_label")
	public WebElement energyReportDetailsAverageCycleUsageLabelText;
		
	
	// Text - Energy report details total usage watt hours label text
	@AndroidFindBy(name = "Total This Week")
	public WebElement energyReportDetailsTotalUsageWattHoursLabelText;
				
	// Text - Energy report details date text[id=list_item_energy_report_data_header_date_text_view]
	@AndroidFindBy(id="list_item_energy_report_data_header_date_text_view")
	public WebElement energyReportDetailsDateText;	

	// Text - Energy report details cycle text[id=list_item_energy_report_data_header_cycle_text_view]
	@AndroidFindBy(id="list_item_energy_report_data_header_cycle_text_view")
	public WebElement energyReportDetailsCycleText;
	
	// Text - Energy report details usage text[id=list_item_energy_report_data_header_usage_text_view]
	@AndroidFindBy(id="list_item_energy_report_data_header_usage_text_view")
	public WebElement energyReportDetailsUsageText;

}
