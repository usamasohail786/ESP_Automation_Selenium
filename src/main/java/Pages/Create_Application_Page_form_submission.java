package Pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import Utility.Test_Data_josn_itrator;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Common_class;
import Utility.Random_Function;
import Utility.Test_Data;



public class Create_Application_Page_form_submission extends Test_Data {
	
	WebDriver driver = null;
	@FindBy(xpath="//h4[@class='group-title']")
	List<WebElement> choose_group;
	@FindBy(xpath="//input[@placeholder]")
	List<WebElement> data_not_filled_already;
	@FindBy(xpath="//img[@src='assets/images/header/logo-stemexe.png']")
	WebElement  stemex_logo;
	@FindBy(xpath="(//xcdrs-appliation-details-card)[1]")
	WebElement  first_card;
	@FindBy(xpath="//div[text()=\"Details \"]")
	WebElement detail;
	@FindBy(xpath="//span[text()='Rating ']")
	
	WebElement  rating;
	@FindBy(xpath="(//mat-icon[text()='attach_file'])[1]")
	WebElement  attachment;
	@FindBy(xpath="(//span[contains(text(),'Upload Image')])[1]")
	WebElement  attachment_img;
	@FindBy(xpath="//mat-spinner")
	WebElement  spinner;
	@FindBy(xpath="//span[text()=' sample ']")
	WebElement  sample_pdf;
	@FindBy(xpath="//input[@data-placeholder='Phone Number']")
	WebElement  phone_numer_field;
	@FindBy(xpath="//a[@class='header-menu-item ng-star-inserted']//div//span")
	List<WebElement> tab_list;
	@FindBy(xpath="//a[@href='/pages/profile']")
	WebElement  profile_img;
	@FindBy(xpath="//mat-error")
	WebElement  pass_error;
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	List<WebElement> creat_application_btn;
	@FindBy(xpath="//mat-icon[@class='mat-icon notranslate color-gray material-icons mat-icon-no-color']")
	List<WebElement> icons_btn;
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement  search_btn;
	@FindBy(xpath="//div[@class='grid-row cursor-pointer ng-star-inserted']//div")
	List<WebElement> search_result;
	@FindBy(xpath="//div[@class='grid-row cursor-pointer ng-star-inserted']//div")
	WebElement  search_result_list;
	@FindBy(xpath="(//div[@class='header-menu']//a)[1]")
	WebElement  header_menu;
	@FindBy(xpath="//input")
	List<WebElement> field1;
	@FindBy(xpath="//button[@id=\"btnSubmit\"]")
	WebElement   submit_btn;

	@FindBy(xpath="(//mat-dialog-container//div)[4]//button")
	WebElement done_btn;
	@FindBy(xpath="//mat-dialog-container")
	WebElement move_to_contianer;
	@FindBy(xpath="//mat-calendar ")
	WebElement calendar_contianer;
	@FindBy(xpath="//a[@href='/pages/applications?tab=0']")
	WebElement appication;
	@FindBy(xpath="(//span[contains(text(), 'Application')])[1]//parent::div//parent::div//div[text()]")
	WebElement appication_counter_on_start;
	@FindBy(xpath="//span[contains(text(), 'Application')]")
	WebElement appication_text;
	@FindBy(xpath="(//span[contains(text(), 'Application')])[1]//parent::div//parent::div//div[text()]")
	WebElement appication_counter_on_end;
	@FindBy(xpath="//div[@class='mat-tab-label-content']")
	List<WebElement> app_main_tabs_list;
	@FindBy(xpath="(//div[text()='Requested On:'])[1]")
	WebElement content_load;
	@FindBy(xpath="//div[@class='mat-calendar-header']")
	WebElement calender_hearder;
	@FindBy(xpath="//div[text()=' 1 Available Options ']")
	WebElement available_wait;
	@FindBy(xpath="//mat-error")
	WebElement min_length_error;
	@FindBy(xpath="//input")
	List<WebElement> short_text_input;
	@FindBy(xpath="(//mat-icon)[last()]")	
	WebElement result_load;
	@FindBy(xpath="//mat-error")	
	WebElement require_error;
	@FindBy(xpath="//input[@type='email']")	
	WebElement require_click;
	@FindBy(xpath="//input[@data-placeholder='Read Only Field Test']")	
	WebElement read_only_field;
	@FindBy(xpath="//h1[text()='Forms Testing']")	
	WebElement empty_click;
	@FindBy(xpath="//input[@data-placeholder='Default Date Testing']")	
	WebElement default_date_exist;
	@FindBy(xpath="(//button[@aria-label=\"Open calendar\"])[1]")	
	WebElement calendar_open;
	@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today']")	
	WebElement select_today_date;
	@FindBy(xpath="//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")	
	WebElement select_today_date_one;
	@FindBy(xpath="(//mat-icon[@fontset='material-icons-outlined'])[2]")	
	WebElement hint_icon;
	@FindBy(xpath="(//input[@type='number'])[2]")	
	WebElement min_max_field;
	@FindBy(xpath="//mat-error[text()=' Value must be between 4 and 7 ']")	
	WebElement min_max_error;
	@FindBy(xpath="//mat-error[text()=' Please enter valid Number ']")	
	WebElement phone_no_error;
	@FindBy(xpath="//button//span[text()='Save']")	
	WebElement save_btn_scroll;
	@FindBy(xpath="//mat-label[text()='Phone Number ']")	
	WebElement attach_file;
	@FindBy(xpath="//input[@data-placeholder='Currency']")	
	WebElement currency_exist;
	@FindBy(xpath="(//span[text()='PKR'])[1]")	
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
	String counter_before_string;
	String counter_after_string;
	int counter_before;
	int counter_after;
	String counter_before_string_mine;
	String counter_after_string_mine;
	int counter_before_mine;
	int counter_after_mine;
	public String error=null;
	boolean Action_tab=false;
	boolean Mine_tab=false;
	public boolean required_field=false;
	public boolean min_length_error_bol=false;
	public boolean max_length_error_bol=false;
	public boolean default_Date_exist=false;
	public boolean hint_icon_exist=false;
	public boolean min_max_error_bool=false;
	public boolean sample_pdf_uploaded_successfully=false;
	public boolean	phone_min_max_error_bool=false;
	public boolean	rating_bool=false;
	public boolean	currency_exist_bool=false;
	public boolean	currency_correct_bool=false;
	public int size_number_After;
    public Create_Application_Page_form_submission(WebDriver driver) throws FileNotFoundException, IOException, ParseException {
    	
    	this.driver = driver;
    	
    	PageFactory.initElements(driver,this);
    
    	
    }
    public void Choose_Group(String group_name) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	//com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	com.get_elements_text_click(choose_group, group_name);
    	
    }
    public String Choose_Tab(String Tab_name) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeInvisible(spinner, 100);	
    	com.Explicit_wait_elements_visiblity(tab_list, 100);
    	com.get_elements_text_click(tab_list, Tab_name);
    	return Tab_name;
    }
    public void Creat_Application(String search,String app_btn_txt,String field,String Submit_btn,String filed_place_holder_Value,String done_btn_text,String text_of_mid_tab,String app_text_display) throws InterruptedException

    {
    	String attribute_name="data-placeholder";
    	Common_class com=new Common_class(driver);
      	com.Explicit_wait_elementToBeInvisible(spinner, 100);
      	com.js_click(appication_counter_on_start); 
      
    	int L=Random_Function.randomintgenerate();
    	System.out.print(L+".yeah herere L nwewew........................................");
    	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 10);
    	com.Explicit_wait_elementToBeVisible(content_load, 50);
      	counter_before_string=appication_counter_on_start.getText();
      	counter_before=Integer.parseInt(counter_before_string);
      	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 50);
    	com.get_elements_text_click(app_main_tabs_list,text_of_mid_tab);
    	//com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	//com.getNGDriver().waitForAngularRequestsToFinish();
    	driver.navigate().refresh();
    	com.Explicit_wait_elementToBeVisible(content_load, 70);
    	com.Explicit_wait_elementToBeVisible(appication_counter_on_start, 50);
    	counter_before_string_mine=appication_counter_on_end.getText();
        counter_before_mine=Integer.parseInt(counter_before_string_mine);
    	com.get_elements_text_click(creat_application_btn, app_btn_txt);
     	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	search_btn.sendKeys(search); 		
        com.Explicit_wait_elementToBeClickable(search_result.get(0), 30);
        com.Explicit_wait_elementToBeVisible(available_wait, 5);
    	search_result.get(0).click();
    	com.Explicit_wait_elements_visiblity(field1, 100);
    	com.Get_Attribute_of_element_click(field1,filed_place_holder_Value,attribute_name,field);
    	com.Explicit_wait_elementToBeVisible(submit_btn, 3);
    	com.element_to_be_stable(1000);
        submit_btn.click();
        com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
        com.Mouse_to_element(move_to_contianer);    
        done_btn.click();  
        com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	appication.click();
    	com.Explicit_wait_elementToBeVisible(content_load, 50);
    	
      
    }
    public void Creat_Application_to_test_forms(String search,String app_btn_txt,String field,String Submit_btn,String filed_place_holder_Value,String done_btn_text,String text_of_mid_tab,String app_text_display) throws InterruptedException
    {
    	String attribute_name="data-placeholder";
    	Common_class com=new Common_class(driver);
      	com.Explicit_wait_elementToBeInvisible(spinner, 100);
      	//com.js_click(appication_counter_on_start); 
    	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 10);
    	com.Explicit_wait_elementToBeVisible(content_load, 50);
      	counter_before_string=appication_counter_on_start.getText();
      	counter_before=Integer.parseInt(counter_before_string);
      	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 50);
    	com.get_elements_text_click(app_main_tabs_list,text_of_mid_tab);
    	//com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	//com.getNGDriver().waitForAngularRequestsToFinish();
    	driver.navigate().refresh();
    	com.Explicit_wait_elementToBeVisible(content_load, 70);
    	com.Explicit_wait_elementToBeVisible(appication_counter_on_start, 50);
    	counter_before_string_mine=appication_counter_on_end.getText();
        counter_before_mine=Integer.parseInt(counter_before_string_mine);
    	com.get_elements_text_click(creat_application_btn, app_btn_txt);
     	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	search_btn.sendKeys(search); 		
        com.Explicit_wait_elementToBeClickable(search_result.get(0), 30);
        com.Explicit_wait_elementToBeVisible(available_wait, 5);
    	search_result.get(0).click();
//    	com.Explicit_wait_elements_visiblity(field1, 100);
//    	com.Get_Attribute_of_element_click(field1,filed_place_holder_Value,attribute_name,field);
//    	com.Explicit_wait_elements_visiblity(submit_btn, 3);
//    	com.element_to_be_stable(1000);
//        com.get_elements_text_click(submit_btn, Submit_btn);
//        com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
//        com.Mouse_to_element(move_to_contianer);    
//        done_btn.click();  
//        com.Explicit_wait_elementToBeInvisible(spinner, 30);
//    	appication.click();
//    	com.Explicit_wait_elementToBeVisible(content_load, 50);
    	
      
    }
    public Boolean verify_action_tab() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeClickable(appication_counter_on_end, 50);
    	counter_after_string=appication_counter_on_end.getText();
        counter_after=Integer.parseInt(counter_after_string);
    	if(counter_before!=counter_after)
    	{
    		Action_tab=true;
    	}
    	
    	return Action_tab;
    }
    public Boolean verify_mine_tab(String text_of_mid_tab) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 50);
    	com.get_elements_text_click(app_main_tabs_list,text_of_mid_tab);
    	driver.navigate().refresh();
    	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	//com.element_to_be_stable(2000);
    	com.Explicit_wait_elementToBeVisible(appication_counter_on_end, 30);
    	counter_after_string_mine=appication_counter_on_end.getText();
        counter_after_mine=Integer.parseInt(counter_after_string_mine);
    	if(counter_before_mine!=counter_after_mine)
    	{
    		Mine_tab=true;
    	}
    	return Mine_tab;
    }
    public int verify_sending_data_into_all_short_text() throws InterruptedException
    {
    	//form submitting in all short text
    	
    	Common_class com=new Common_class(driver);
        com.Explicit_wait_elements_visiblity(text_type_list, 10);
        int size_date=com.get_elements_text_random(text_type_list);
    	return size_date;	
    		
    }
    public int verify_sending_data_into_all_look_up_fields() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
        com.Explicit_wait_elements_visiblity(look_up_list, 10);
        int size_look_up=com.get_elements_Defination_look_up_fields(look_up_list);
        return size_look_up;
        	
    }
    public void verify_adding_multi_section() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
        com.Explicit_wait_elementToBeClickable(add_action_list, 10);
        com.click_while(add_action_list,form);
        Thread.sleep(3000);
        
    		

    		
    	

        	
    }
    public int verify_sending_data_into_all_email_field() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(text_type_email_list, 10);
    	int size_email=com.get_elements_email_text_random(text_type_email_list);
    	return size_email;
    		
    }
    public int verify_upload_all_the_attachment() throws InterruptedException
    {
    	int size_images=0;
    	if(image_upload_list.size()>0)
    	{
    	Common_class com=new Common_class(driver); 
    	com.Explicit_wait_elements_visiblity(file_upload_list, 10);
    	size_images=com.file_attach_randomly(file_upload_list);
    	
    	}
    	return size_images;
    }
    public int verify_upload_all_the_Image() throws InterruptedException
    {
    	int size_files=0;
    	if(image_upload_list.size()>0)
    	{
    	Common_class com=new Common_class(driver); 
    	com.Explicit_wait_elements_visiblity(image_upload_list, 10);
    	 size_files=com.image_attach_randomly(image_upload_list);
    	}
    	return size_files;
    }
    public void verify_upload_all_the_Image_in_gallery() throws InterruptedException
    {
    	if(gallery_image_upload_list.size()>0)
    	{
    	Common_class com=new Common_class(driver); 
    	for(int i=0;i<Random_Function.random_number();i++)
    	{
    	com.Explicit_wait_elements_visiblity(gallery_image_upload_list, 10);
    	com.gallery_attach_randomly(gallery_image_upload_list);
    	}
    	}
       
    }
    public int verify_sending_data_into_all_long_fields() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(long_text_type_list, 10);
    	int long_fields=com.get_elements_text_random(long_text_type_list);
    	return long_fields;
       
    }
    public int verify_sending_data_into_all_numbers() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(number_list, 10);
    	int Size=com.get_random_number(number_list);
    	return Size;
       
    }
    public int verify_currency_data_into_all_fields() throws InterruptedException
    {
    	int Currency_Size=0;
    	if(currency_fields.size()>0)
    	{
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(currency_fields, 10);
    	Currency_Size=com.get_random_number(currency_fields);
    	
    	}
    	return Currency_Size;
    }
    public int verify_price_data_into_all_fields() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
    	
    	com.Explicit_wait_elements_visiblity(price_fields, 10);
    	int price_size=com.get_random_number(price_fields);
    	return price_size;
       
    }
    public int verify_sending_data_into_all_phone_numbers() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
    	
    	com.Explicit_wait_elements_visiblity(phone_list, 10);
    	int phone_size=com.get_random_phone_number(phone_list);
    	return phone_size;
       
    }
    public int verify_sending_data_into_all_links() throws InterruptedException
    {
    	
    	Common_class com=new Common_class(driver);
    	
    	com.Explicit_wait_elements_visiblity(link_list, 10);
    	int links_size=com.get_elements_link_text_random(link_list);
        return links_size;
       
    }
    public void verify_read_only_field()
    {
    	//Read only field 	
    	Assert.assertTrue(read_only_field.getAttribute("disabled").equals("true"),"Element ReadOnly");
    }
    public int click_on_all_dates_fields() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(date_list, 4);
    	
    	com.remove_atribute(date_list);
    	int date_size=com.send_date_on_list(date_list);
    	return date_size;
    	
    	
    }
    public int click_on_all_date_time_fields() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(date_time_list, 4);	
    	com.remove_atribute(date_time_list);
    	int date_time_size=com.send_date_on_list(date_time_list);
    	return date_time_size;
    	
    	
    }
    public void randomly_click_rating() throws InterruptedException
    {
//    	Common_class com=new Common_class(driver);
//    	System.out.print("rating");
//    	com.Explicit_wait_elements_visiblity(rating_element, 10);
//    	//date_click.click();
//    	com.random_clicks(rating_random_clicks); 	
    }
    
    public void today_date_validate(String today_dat) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	//opening the calendar 
    	
    	com.Explicit_wait_elementToBeClickable(calendar_open, 5);
    	calendar_open.click();
    	com.Explicit_wait_elementToBeVisible(calendar_contianer, 10);
    	com.Mouse_to_element(calendar_contianer);
    	com.Explicit_wait_elementToBeStale(select_today_date, 1);
    	select_today_date.click();
    	//opening the calendar the calendar again 
    	com.Explicit_wait_elementToBeClickable(calendar_open, 2);
    	calendar_open.click();
    	com.Explicit_wait_elementToBeVisible(calendar_contianer, 5);
    	com.Mouse_to_element(calendar_contianer);
    	//comparing today date with selected date
    	com.Explicit_wait_elementToBeStale(select_today_date_one, 1);
    	select_today_date_one.click();
    }
    public void default_Date_exist() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeVisible(default_date_exist, 4);
    	
    	if(default_date_exist.isDisplayed()==true)
    	{
    		default_Date_exist=true;
    		com.highLighterMethod(driver, default_date_exist);
    		
    	}
    }
    public void sizes_after_submit() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeVisible(submit_btn, 20);
    	com.element_to_be_stable(1000);
        com.js_click(submit_btn);
        com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
        com.Mouse_to_element(move_to_contianer);    
        done_btn.click();  
        com.Explicit_wait_elementToBeInvisible(spinner, 30);
        com.Explicit_wait_elementToBeClickable(first_card, 5);
        com.js_click(first_card);
        com.Explicit_wait_elementToBeInvisible(spinner, 30);
        com.Explicit_wait_elementToBeClickable(detail, 5);
        com.js_click(detail);
        com.Explicit_wait_elements_visiblity(text_type_list_after_submit, 5);
    	text_type_list_after_submit.size();
    	com.Explicit_wait_elements_visiblity(look_up_list_after_submit, 5);
    	look_up_list_after_submit.size();
    	text_type_email_list_after_submit.size();
    	file_upload_list_after_submit.size();
    	image_upload_list_after_submit.size();
    	date_list_after_submit.size();
    	date_time_list_after_submit.size();
    	long_text_type_list_submit.size();
    	currency_fields_after_submit.size();
    	link_list_after_submit.size();
    	com.Explicit_wait_elements_visiblity(number_list_after_submit, 5);
    	size_number_After=number_list_after_submit.size();
    	System.out.print(size_number_After+"after here..........");
    	
    }
    public void Verify_Hint_working_fine() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeVisible(hint_icon, 4);
    	if(hint_icon.isDisplayed()==true)
    	{
    		hint_icon_exist=true;
    		com.highLighterMethod(driver, hint_icon);
    	}
    }
    public void Verify_Max_and_Min_Value() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeVisible(min_max_field, 4);
    	//if we put value more than 70 it must gives error
    	com.Scroll_into_View(min_max_field);
    	com.Explicit_wait_elementToBeClickable(min_max_field, 4);
    	min_max_field.sendKeys("12334");
    	com.Explicit_wait_elementToBeVisible(empty_click, 5);
    	empty_click.click();
       	com.Explicit_wait_elementToBeVisible(min_max_error, 4);
    	if(min_max_error.isDisplayed()==true)
    	{
    		min_max_error_bool=true;
    		System.out.print("show me maxxx giving errror");
    		com.highLighterMethod(driver, min_max_field);  
   	}
    }
    	public void Verify_Phone_Field() throws InterruptedException
        {
        	Common_class com=new Common_class(driver);
        	com.Explicit_wait_elementToBeVisible(phone_numer_field, 4);
        	com.Scroll_into_View(phone_numer_field);
        	com.Explicit_wait_elementToBeClickable(phone_numer_field, 4);
        	phone_numer_field.sendKeys("ABCDEF");
           	com.Explicit_wait_elementToBeVisible(phone_no_error, 4);
        	if(phone_no_error.isDisplayed()==true)
        	{
        		phone_min_max_error_bool=true;
        		com.highLighterMethod(driver, phone_numer_field);  
       	}
    	
    }
    	public void Verify_Attachment_working_fine() throws InterruptedException, AWTException
        {
        	Common_class com=new Common_class(driver);
        	com.Explicit_wait_elementToBeVisible(attachment, 4);
        	//if we put value more than 70 it must gives error
        	com.Scroll_into_View(attachment);
        	com.element_to_be_stable(3000);
        	com.Explicit_wait_elementToBeClickable(attachment, 4);
        	attachment.click();
        	StringSelection str = new StringSelection("\"C:\\Users\\usamasoh\\Documents\\sample.pdf\"");
        	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        	com.upload_file();
        	com.Explicit_wait_elementToBeVisible(sample_pdf, 4);
        	if(sample_pdf.isDisplayed())
        	{
        		sample_pdf_uploaded_successfully=true;
        	}
    	
    }
    	public void Verify_Image_Attachment_working_fine() throws InterruptedException, AWTException
        {
        	Common_class com=new Common_class(driver);
        	com.Explicit_wait_elementToBeVisible(attachment_img, 4);
        	//if we put value more than 70 it must gives error
        	com.Scroll_into_View(attachment_img);
        	com.Explicit_wait_elementToBeClickable(attachment_img, 4);
        	com.element_to_be_stable(3000);
        	com.Explicit_wait_elementToBeClickable(attachment_img, 4);
        	attachment_img.click();
        	StringSelection str1 = new StringSelection("\"C:\\Users\\usamasoh\\Documents\\PNG_transparency_demonstration_1.png\"");
        	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
        	com.upload_file();
        	Thread.sleep(200);
        	//com.Explicit_wait_elementToBeVisible(sample_pdf, 4);
//        	if(sample_pdf.isDisplayed())
//        	{
//        		sample_pdf_uploaded_successfully=true;
//        	}
    	
    }
    	public void Verify_Rating_working_fine() throws InterruptedException, AWTException
        {
        	Common_class com=new Common_class(driver);
        	com.Explicit_wait_elementToBeVisible(rating, 4);
        	//if we put value more than 70 it must gives error
        	com.Scroll_into_View(rating);
        	com.Explicit_wait_elementToBeClickable(rating, 4);
        	com.element_to_be_stable(3000);
        	if(rating.isDisplayed())
        	{
        		rating_bool=true;
   
        	}
    	
    }
    	public void Verify_Currency_working_fine() throws InterruptedException, AWTException
        {
        	Common_class com=new Common_class(driver);
        	com.Explicit_wait_elementToBeVisible(currency_exist, 4);
        	//if we put value more than 70 it must gives error
        	com.Scroll_into_View(currency_exist);
        	com.Explicit_wait_elementToBeClickable(currency_exist, 4);
        	com.element_to_be_stable(3000);
        	if(currency_exist.isDisplayed())
        	{
        		currency_exist_bool=true;
        		System.out.print("cur......");
   
        	}
        	if(currency_correct.isDisplayed())
        	{
        		currency_correct_bool=true;
        		System.out.print("cur2........");
        		   
        	}
    	
    }
    	

}


