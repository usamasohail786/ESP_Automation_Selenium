package Pages;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Common_class;
import Utility.Test_Data;



public class Create_Application_Page extends Test_Data {
	
	WebDriver driver = null;
	@FindBy(xpath="//h4[@class='group-title']")
	List<WebElement> choose_group;
	@FindBy(xpath="//img[@src='assets/images/header/logo-stemexe.png']")
	WebElement  stemex_logo;
	@FindBy(xpath="//mat-spinner")
	WebElement  spinner;
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
	@FindBy(xpath="//button//span[@class='mat-button-wrapper']")
	List<WebElement> submit_btn;

	@FindBy(xpath="(//mat-dialog-container//div)[4]//button")
	WebElement done_btn;
	@FindBy(xpath="//mat-dialog-container")
	WebElement move_to_contianer;
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
	boolean required_field=false;
	public boolean min_length_error_bol=false;
    public Create_Application_Page(WebDriver driver) throws FileNotFoundException, IOException, ParseException {
    	
    	this.driver = driver;
    	Data();
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
    	com.Explicit_wait_elements_visiblity(field1, 100);
    	com.Get_Attribute_of_element_click(field1,filed_place_holder_Value,attribute_name,field);
    	com.Explicit_wait_elements_visiblity(submit_btn, 3);
    	com.element_to_be_stable(1000);
        com.get_elements_text_click(submit_btn, Submit_btn);
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
    public void verify_min_max_length_of_short_Text() throws InterruptedException
    {
    	//add values in short text to check min length and max length are working fine
    	//min length should not be less than 2
    	Common_class com=new Common_class(driver);
        com.Explicit_wait_elements_visiblity(short_text_input, 10);
    	short_text_input.get(0).sendKeys("AB");
    	if(min_length_error.isDisplayed())
    	{
    		min_length_error_bol=true;
    	}
    	
    	
    }
    public void verify_required_field_working_fine() throws InterruptedException
    {
    	//without required field form submit should not proceed
    	Common_class com=new Common_class(driver);
        if(require_error.isDisplayed())
        {
        	required_field=true;
        }
       
    }

}


