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



public class Create_Application_stage_page extends Test_Data {
	
	WebDriver driver = null;
	@FindBy(xpath="//h4[@class='group-title']")
	List<WebElement> choose_group;
	@FindBy(xpath="//img[@src='assets/images/header/logo-stemexe.png']")
	WebElement  stemex_logo;
	@FindBy(xpath="//mat-spinner")
	WebElement  spinner;
	@FindBy(xpath="//div[contains(@class,'header-menu-content')]")
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
	@FindBy(xpath="//input[@data-placeholder=\"Short text\"]")
	WebElement short_text;
	@FindBy(xpath="//textarea[@data-placeholder=\"Long Text\"]")
	WebElement long_text;
	@FindBy(xpath="//button//span[text()=' Approve ']")
	WebElement approve_btn;
	@FindBy(xpath="//span[text()=' Reject ']")
	WebElement reject_btn;
	@FindBy(xpath="//div[contains(@class,'application-status')]")
	WebElement rejected_status;
	@FindBy(xpath="(//button//span[text()=' Reject '])[2]")
	WebElement reject_btn_2;
	@FindBy(xpath="//span[text()=' Proceed ']")
	WebElement Proceed_btn;
	@FindBy(xpath="//div[contains(@class,'red-dot')]")
	WebElement open_btn;
	@FindBy(xpath="//div[text()='Complete']")
	WebElement complete_stage1;
	@FindBy(xpath="//span[text()=' Accept ']")
	WebElement accept_btn;
	@FindBy(xpath="//div[text()='Accepted']")
	List<WebElement> count_accepted;
	@FindBy(xpath="//a[contains(@class,'pointer')]")
	WebElement first_btn;
	@FindBy(xpath="(//span[@class='mat-button-wrapper'])[1]")
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
	@FindBy(xpath="(//mat-icon)[last()]")
	WebElement result_load;
	@FindBy(xpath="//textarea[@mattextareaautosize='true']")
	WebElement comment_area;
	@FindBy(xpath="//ng-progress//div[@active='true']")
	WebElement progress_bar;
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
	public boolean accepted_size=false;
	public boolean rejected_size=false;
    public Create_Application_stage_page(WebDriver driver) throws FileNotFoundException, IOException, ParseException {
    	
    	this.driver = driver;
    	Data();
    	PageFactory.initElements(driver,this);
    
    	
    }
    public void Choose_Group(String group_name) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.get_elements_text_click(choose_group, group_name);
    	
    }
    public String Choose_Tab(String Tab_name) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	com.Explicit_wait_elementToBeInvisible(progress_bar, 80);
    	com.Explicit_wait_elements_visiblity(tab_list, 100);
    	com.get_elements_text_click(tab_list, Tab_name);
    	com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	com.Explicit_wait_elementToBeVisible(content_load, 50);
    	return Tab_name;
    }
    public void Creat_Application(String search,String app_btn_txt,String field,String Submit_btn,String filed_place_holder_Value,String done_btn_text,String text_of_mid_tab,String app_text_display) throws InterruptedException
    {
    	String attribute_name="data-placeholder";
    	Common_class com=new Common_class(driver);
      	com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 10);
    	com.Explicit_wait_elementToBeVisible(content_load, 50);
      	counter_before_string=appication_counter_on_start.getText();
      	counter_before=Integer.parseInt(counter_before_string);
      	com.Explicit_wait_elements_visiblity(app_main_tabs_list, 50);
    	com.get_elements_text_click(app_main_tabs_list,text_of_mid_tab);
    	driver.navigate().refresh();
    	com.Explicit_wait_elementToBeVisible(content_load, 70);
    	com.Explicit_wait_elementToBeVisible(appication_counter_on_start, 50);
    	counter_before_string_mine=appication_counter_on_end.getText();
        counter_before_mine=Integer.parseInt(counter_before_string_mine);
    	com.get_elements_text_click(creat_application_btn, app_btn_txt);
     	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	search_btn.sendKeys(search); 		
        com.Explicit_wait_elements_visiblity(search_result, 30);	
    	search_result.get(0).click();
    	com.Explicit_wait_elements_visiblity(field1, 100);
    	short_text.sendKeys(field);
    	long_text.sendKeys(field);
    	com.Explicit_wait_elements_visiblity(submit_btn, 3);
    	com.element_to_be_stable(2000);
        com.get_elements_text_click(submit_btn, Submit_btn);
        com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
        com.Mouse_to_element(move_to_contianer);  
        com.Explicit_wait_elementToBeVisible(done_btn, 4);
        done_btn.click();  
        com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	
      
    }
    public String Approve_verify_Stage1() throws InterruptedException
  
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	com.Explicit_wait_elementToBeVisible(approve_btn, 4);
    	com.element_to_be_stable(3000);
    	approve_btn.click();
    	com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
    	com.Mouse_to_element(move_to_contianer); 
    	com.Explicit_wait_elementToBeVisible(accept_btn, 4);
    	com.js_click(accept_btn);
    	com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	first_btn.click();
    	com.Explicit_wait_elementToBeInvisible(spinner, 10);
    	return complete_stage1.getText();
    }
    public String Approve_verify_Stage1_Rejected() throws InterruptedException
    
    {
    	Common_class com=new Common_class(driver);
    	try
    	{
    	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	com.Explicit_wait_elementToBeVisible(open_btn, 4);
    	com.js_click(open_btn);
    	}
    	catch(Exception e)
    	{
    		
    	}
    	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	com.Explicit_wait_elementToBeStale(reject_btn, 5);
    	com.element_to_be_stable(2000);
    	com.js_click(reject_btn);
    	com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
    	com.Mouse_to_element(move_to_contianer); 
    	comment_area.sendKeys("Adding comment for rejecting");
    	com.Explicit_wait_elementToBeVisible(reject_btn_2, 4);
    	com.js_click(reject_btn_2);
    	com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	com.Explicit_wait_elementToBeVisible(first_btn, 10);
    	com.js_click(first_btn);
    	com.Explicit_wait_elementToBeInvisible(spinner, 40);
    	com.Explicit_wait_elementToBeStale(rejected_status, 2);
    	return rejected_status.getText();
    }
 public String Approve_verify_Stage2_Rejected() throws InterruptedException
    
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	com.Explicit_wait_elementToBeStale(reject_btn, 5);
    	com.element_to_be_stable(2000);
    	com.js_click(reject_btn);
    	com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
    	com.Mouse_to_element(move_to_contianer); 
    	comment_area.sendKeys("Adding comment for rejecting");
    	com.Explicit_wait_elementToBeVisible(reject_btn_2, 4);
    	com.js_click(reject_btn_2);
    	com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	com.Explicit_wait_elementToBeVisible(first_btn, 10);
    	com.js_click(first_btn);
    	com.Explicit_wait_elementToBeInvisible(spinner, 40);
    	com.Explicit_wait_elementToBeStale(rejected_status, 2);
    	return rejected_status.getText();
    }
    public void Approve_verify_Stage2() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeInvisible(spinner, 50);
    	com.Explicit_wait_elementToBeVisible(open_btn, 4);
    	open_btn.click();
    	com.element_to_be_stable(2000);
    	com.js_click(approve_btn);
    	com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
    	com.Mouse_to_element(move_to_contianer); 
    	com.Explicit_wait_elementToBeVisible(accept_btn, 4);
    	com.js_click(accept_btn);
    	com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	com.Explicit_wait_elementToBeVisible(Proceed_btn, 10);
    	com.element_to_be_stable(2000);
    	com.js_click(Proceed_btn);
    	com.element_to_be_stable(2000);
    	com.Explicit_wait_elementToBeVisible(move_to_contianer, 10);
    	com.Mouse_to_element(move_to_contianer); 
    	com.Explicit_wait_elementToBeVisible(accept_btn, 4);
    	com.js_click(accept_btn);
    	com.Explicit_wait_elementToBeInvisible(spinner, 30);
    	first_btn.click();
    	
    	
    }
    public void Approve_verify_both_stages_completed() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elements_visiblity(count_accepted, 4);
    
    	if(count_accepted.size()==3)
    	{
    		accepted_size=true;
    	
    	}
    }


}


