package Pages;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Common_class;
import Utility.Test_Data;



public class Satge_page extends Test_Data {
	WebDriver driver = null;

	@FindBy(xpath="//div[@class='section-controls-container ng-star-inserted']")
	WebElement  form_visibile_container;
	@FindBy(xpath="(//mat-icon)[12]")
	WebElement  icon_cross;
	@FindBy(xpath="//a[contains(@class,'pointer')]")
	WebElement  back_pointer;
	@FindBy(xpath="//button[contains(@class,'gradient-btn mat-flat-button')]")
	WebElement  container_btn;
	@FindBy(xpath="(//div[contains(@class,'application-status')])[2]")
	WebElement  red_dot_open;
	@FindBy(xpath="//div[@class='exceeders-card']")
	WebElement  form_invisibile_container;
	@FindBy(xpath="//xcdrs-appliation-details-card")
	List<WebElement> card_detail;
	@FindBy(xpath="//div[contains(@class,'red-dot')]")
	List<WebElement> red_dot;
	@FindBy(xpath="//input[@data-type]")
	List<WebElement> unique_data_type;
	@FindBy(xpath="//mat-dialog-container")
	List<WebElement> mat_dialoge;
	@FindBy(xpath="//mat-spinner")
	public static
	WebElement  spinner;
	@FindBy(xpath="//button[contains(@class,'gradient-btn btn-respond')]")
	List<WebElement> approve_proceed_list;
	@FindBy(xpath="//div[contains(@class,'requests-count')]//div//div[1]")
	WebElement count_app;
	WebElement currency_correct;
	@FindBy(xpath="//input[@data-type=1]")
	public
	List<WebElement> text_type_list;
	@FindBy(xpath="//div[@data-type=1]")
	public
	List<WebElement> text_type_list_after_submit;
	@FindBy(xpath="//mat-select[@data-type=13]")
	public
	List<WebElement> look_up_list;
	@FindBy(xpath="//div[@data-type=13]")
	public
	List<WebElement> look_up_list_after_submit;
	@FindBy(xpath="//*[contains(text(),'Form#')]")
	List<WebElement> form;
	@FindBy(xpath="//button[@data-action='addMultiField']")
	WebElement add_action_list;
	@FindBy(xpath="//input[@data-type=10]")
	public
	List<WebElement> text_type_email_list;
	@FindBy(xpath="//input[@data-type=10]")
	public
	List<WebElement> text_type_email_list_after_submit;
	@FindBy(xpath="//input[@data-type=7]")
	public
	List<WebElement> file_upload_list;
	@FindBy(xpath="//div[@data-type=7]")
	public
	List<WebElement> file_upload_list_after_submit;
	@FindBy(xpath="//div[@data-type=23]")
	public
	List<WebElement> image_upload_list_after_submit;
	@FindBy(xpath="//input[@data-type=23]")
	public
	List<WebElement> image_upload_list;
	@FindBy(xpath="//input[@data-type=27]")
	List<WebElement> gallery_image_upload_list;
	@FindBy(xpath="//input[@data-type=4]")	
	public
	List<WebElement> date_list;
	@FindBy(xpath="//div[@data-type=4]")	
	public
	List<WebElement> date_list_after_submit;
	@FindBy(xpath="//input[@data-type=8]")	
	public
	List<WebElement> date_time_list;
	@FindBy(xpath="//div[@data-type=8]")	
	public
	List<WebElement> date_time_list_after_submit;
	@FindBy(xpath="//app-esp-rating[@data-type=9]//div//div//div//div")	
	List<WebElement> rating_random_clicks;
	@FindBy(xpath="//app-esp-rating[@data-type=9]")	
	List<WebElement> rating_element;
	@FindBy(xpath="//textarea[@data-type=2]")
	public
	List<WebElement> long_text_type_list;
	@FindBy(xpath="//div[@data-type=2]")
	public
	List<WebElement> long_text_type_list_submit;
	@FindBy(xpath="//input[@data-type=3]")
	public
	List<WebElement> number_list;
	@FindBy(xpath="//div[@data-type=3]")
	public
	List<WebElement> number_list_after_submit;
	@FindBy(xpath="//input[@data-type=11]")
	public
	List<WebElement> currency_fields;
	@FindBy(xpath="//div[@data-type=11]")
	public
	List<WebElement> currency_fields_after_submit;
	@FindBy(xpath="//input[@data-type=26]")
	public
	List<WebElement> price_fields;
	@FindBy(xpath="//input[@data-type=16]")
	public
	List<WebElement> phone_list;
	@FindBy(xpath="//input[@data-type=15]")
	public
	List<WebElement> link_list;
	@FindBy(xpath="//div[@data-type=15]")
	public
	List<WebElement> link_list_after_submit;
	@FindBy(xpath="//input[@placeholder]")
	public
	List<WebElement> place_holder_list;
	
	
	public boolean form_condition_applicant_name_exist=false;
	public boolean form_invisible=false;
	public static int count_before;
	public static int count_after;
	public static String count_before_string;
	public static String count_after_string;
    public Satge_page(WebDriver driver) throws FileNotFoundException, IOException, ParseException {
    	
    	this.driver = driver;
    	Data();
    	PageFactory.initElements(driver,this);
    
    	
    }
    public void verify_Stages_working_fine() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
        driver.navigate().refresh();
    	com.Explicit_wait_elementToBeInvisible(spinner, 20);
    	com.Explicit_wait_elementToBeVisible(count_app, 5);
    	count_before_string=count_app.getText();
    	count_before=Integer.parseInt(count_before_string);
    	for(int i=0;i<6;i++)
    		{
    		com.Explicit_wait_elements_visiblity(card_detail, 20);
   	        com.js_click(card_detail.get(i));
   			com.Explicit_wait_elements_visiblity(red_dot, 10);
   			com.Explicit_wait_elementToBeInvisible(spinner, 10);
   			while(red_dot.size()>0)
    			{

   				    com.Explicit_wait_elementToBeClickable(red_dot.get(0), 4);
    		        com.js_click(red_dot.get(0));
    				com.Explicit_wait_elements_visiblity(approve_proceed_list, 5);
    				for(int j=0;j<approve_proceed_list.size();j++)
    				{
    					
    					try
    					{
    					com.Explicit_wait_elementToBeClickable(approve_proceed_list.get(j), 4);
    			        com.js_click(approve_proceed_list.get(j));		
    			        if(place_holder_list.size()==0)
    			        {
    			        if(unique_data_type.size()>0)
    			        { 
    			        	com.Explicit_wait_elements_visiblity(unique_data_type, 2);
    			        	
    			        	Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(driver);
    			        	if(text_type_list.size()>0)
    			        	{
    			        		
    			        	com.Explicit_wait_elements_visiblity(text_type_list, 3);
    			        	app_obj.verify_sending_data_into_all_short_text();
    			        	}
    			        	if(text_type_email_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(text_type_email_list, 3);
    			        	app_obj.verify_sending_data_into_all_email_field();
    			        	}
    			        	if(phone_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(phone_list, 3);
    			        	app_obj.verify_sending_data_into_all_phone_numbers();
    			        	}
    			        	if(link_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(link_list, 3);	
    			        	app_obj.verify_sending_data_into_all_links();
    			        	}
    			        	if(look_up_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(look_up_list, 3);	
    			        	app_obj.verify_sending_data_into_all_look_up_fields();
    			        	}
    			        	if(number_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(number_list, 3);	
    			        	app_obj.verify_sending_data_into_all_numbers();
    			        	}
    			        	if(currency_fields.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(currency_fields, 3);	
    			        	app_obj.verify_currency_data_into_all_fields();
    			        	}
    			        	if(date_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(date_list, 3);	
    			        	app_obj.click_on_all_dates_fields();;
    			        	}
    			        	if(date_time_list.size()>0)
    			        	{
    			        	com.Explicit_wait_elements_visiblity(date_time_list, 3);	
    			        	app_obj.click_on_all_date_time_fields();
    			        	}
    			        	
    			        }
    			        }
    					if(mat_dialoge.size()>0)
    					{
    						com.Explicit_wait_elementToBeVisible(mat_dialoge.get(0), 2);
    						com.Mouse_to_element(mat_dialoge.get(0));
    						com.Explicit_wait_elementToBeClickable(container_btn, 2);
    						container_btn.click();
    						com.Explicit_wait_elementToBeInvisible(spinner, 10);
    						com.Explicit_wait_elementToBeClickable(back_pointer, 3);
    						com.js_click(back_pointer);
    					}
    				}
    				catch(Exception e)
					{
						com.Explicit_wait_elementToBeClickable(back_pointer, 3);
						com.js_click(back_pointer);
					}
    				
    				}
    			}
    		driver.navigate().back();		
  	        com.Explicit_wait_elements_visiblity(card_detail, 10);
   			com.Explicit_wait_elementToBeInvisible(spinner, 10);
    		}
    	com.Explicit_wait_elementToBeVisible(count_app, 5);
    	
    	count_after_string=count_app.getText();
    	count_after=Integer.parseInt(count_after_string);
    	
    	
    	
    }
   
    
}


