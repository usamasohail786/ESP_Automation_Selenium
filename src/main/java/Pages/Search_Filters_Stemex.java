package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Common_class;

public class Search_Filters_Stemex {

	WebDriver driver = null;

	@FindBy(xpath = "//mat-spinner")
	WebElement spinner;
	@FindBy(xpath = "//span[@class='mat-option-text']")
	List<WebElement> search_filter_list;
	@FindBy(xpath = "//a[@href='/pages/profile']")
	WebElement profile_img;
	@FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
	WebElement filters_box;
	@FindBy(xpath = "//mat-select[@panelclass='esp-multi-select']")
	WebElement filters_box_defination;
	@FindBy(xpath = "//div[@class='mat-tab-label-content']")
	List<WebElement> app_main_all_tabs;
	@FindBy(xpath = "//div[@class='mat-tab-label-content']")
	List<WebElement> app_main_action_tab;
	@FindBy(xpath = "(//span[contains(text(), 'Application')])[1]//parent::div//parent::div//div[text()]")
	WebElement appication_counter;
	@FindBy(xpath = "//a[@aria-label='Next page']")
	WebElement next_page;
	@FindBy(xpath = "//a[@aria-label='Previous page']")
	WebElement previous_page;
	@FindBy(xpath = "//a[@aria-label='Next page']//parent::li//preceding-sibling::li[1]")
	WebElement last_page;
	@FindBy(xpath = "//a[@aria-label='Previous page']/parent::li//following-sibling::li[2]")
	WebElement first_page;
	@FindBy(xpath = "//div[contains(text(), 'Applications')]")
	List<WebElement> no_application_text;
	@FindBy(xpath = "(//div[contains(text(),\"Application #:\")]//following-sibling::div)[1]")
	WebElement application_no_text;
	@FindBy(xpath = "(//div[contains(text(),\"Application #:\")]//following-sibling::div)[last()]")
	WebElement application_no_text_last;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement defination_drop_down_search;
	@FindBy(xpath = "//mat-pseudo-checkbox")
	WebElement all_defination_check_box;
	@FindBy(xpath = "//mat-pseudo-checkbox")
	WebElement submitted_defination_check_box;
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement  search_btn;
	public String error = null;
	public String open;
	public String accepted;
	public String rejected;
	public String cancelled;
	public int open_int_count;
	public int all_int_count;
	public int accepted_int_count;
	public int rejected_int_count;
	public int cancelled_int_count;
	public String oldest_last_newest_cosider;
	public String newest_last_oldest_cosider;
	public String oldest_last_newest_cosider_initial;
	public String newest_last_oldest_cosider_initial;
	public Boolean non_submitted_def=false;
	public Boolean submitted_def=false;

	public Search_Filters_Stemex(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Search_Status_Filters(String Open_Filter, String open_text, String all_tab, String accepted_filter,
			String rejected_filter, String cancelled_filter, String no_app_txt) throws InterruptedException {

		Common_class com = new Common_class(driver);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elements_visiblity(app_main_all_tabs, 50);
		com.get_elements_text_click(app_main_all_tabs, all_tab);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elementToBeClickable(appication_counter, 40);
		com.Explicit_wait_elements_visiblity(no_application_text, 100);
		String no_app_text_from_list_all = com.Get_Text_element(no_application_text, no_app_txt);
		if (no_app_text_from_list_all != no_app_txt)

		{
			com.element_to_be_stable(1000);
			String all_count = appication_counter.getText();
			all_int_count = com.counter_int(all_count);

		}
		com.element_to_be_stable(2000);
		com.Explicit_wait_elementToBeClickable(filters_box, 100);
		filters_box.click();
		com.Search_filters(search_filter_list, Open_Filter);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		open = driver.findElement(By.xpath("//div[contains(text(),'" + open_text + "')]")).getText();

		com.Explicit_wait_elementToBeClickable(appication_counter, 40);
		com.Explicit_wait_elements_visiblity(no_application_text, 100);
		String no_app_text_from_list_open = com.Get_Text_element(no_application_text, no_app_txt);
		if (no_app_text_from_list_open != no_app_txt) {
			String open_count = appication_counter.getText();
			open_int_count = com.counter_int(open_count);

		}
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.element_to_be_stable(2000);
		com.Explicit_wait_elementToBeClickable(filters_box, 100);
		filters_box.click();
		com.Search_filters(search_filter_list, accepted_filter);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		accepted = driver.findElement(By.xpath("//div[contains(text(),'" + accepted_filter + "')]")).getText();

		com.Explicit_wait_elementToBeClickable(appication_counter, 40);
		com.Explicit_wait_elements_visiblity(no_application_text, 100);
		String no_app_text_from_list_accepted = com.Get_Text_element(no_application_text, no_app_txt);
		if (no_app_text_from_list_accepted != no_app_txt) {
			String accepted_count = appication_counter.getText();
			accepted_int_count = com.counter_int(accepted_count);

		}
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.element_to_be_stable(2000);
		com.Explicit_wait_elementToBeClickable(filters_box, 100);
		filters_box.click();
		com.Search_filters(search_filter_list, rejected_filter);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		rejected = driver.findElement(By.xpath("//div[contains(text(),'" + rejected_filter + "')]")).getText();

		com.Explicit_wait_elementToBeClickable(appication_counter, 40);
		com.Explicit_wait_elements_visiblity(no_application_text, 100);
		String no_app_text_from_list_rejected = com.Get_Text_element(no_application_text, no_app_txt);
		if (no_app_text_from_list_rejected != no_app_txt) {
			String rejected_count = appication_counter.getText();
			rejected_int_count = com.counter_int(rejected_count);

		}
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.element_to_be_stable(2000);
		com.Explicit_wait_elementToBeClickable(filters_box, 100);
		filters_box.click();
		com.Search_filters(search_filter_list, cancelled_filter);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		cancelled = driver.findElement(By.xpath("//div[contains(text(),'" + cancelled_filter + "')]")).getText();

		com.Explicit_wait_elementToBeClickable(appication_counter, 40);
		com.Explicit_wait_elements_visiblity(no_application_text, 100);
		String no_app_text_from_list_cancelled = com.Get_Text_element(no_application_text, no_app_txt);
		if (no_app_text_from_list_cancelled != no_app_txt) {
			String cancel_count = appication_counter.getText();
			cancelled_int_count = com.counter_int(cancel_count);

		}

	}

	public void Sorting_Filters(String action, String Submit_newwest_first, String Submit_oldest_fisrt)
			throws InterruptedException {
		Common_class com = new Common_class(driver);
		com.Explicit_wait_elements_visiblity(app_main_action_tab, 50);
		com.get_elements_text_click(app_main_all_tabs, action);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.getNGDriver().waitForAngularRequestsToFinish();
		oldest_last_newest_cosider_initial = com.Get_Text_single_element(application_no_text);
		com.Explicit_wait_elementToBeClickable(filters_box, 10);
		filters_box.click();
		com.Explicit_wait_elements_visiblity(search_filter_list, 10);
		com.element_to_be_stable(1000);
		com.Search_filters_compare(search_filter_list, Submit_oldest_fisrt);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elementToBeClickable(filters_box, 10);
		com.Scroll_To_Element(next_page);
		com.element_to_be_stable(1000);
		com.Explicit_wait_elementToBeClickable(last_page, 10);
		last_page.click();		
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elementToBeClickable(application_no_text, 10);
		oldest_last_newest_cosider = com.Get_Text_single_element(application_no_text_last);
		driver.navigate().refresh();
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.element_to_be_stable(1000);
		com.Explicit_wait_elementToBeClickable(filters_box, 10);
		filters_box.click();
		com.Explicit_wait_elements_visiblity(search_filter_list, 10);
		com.Search_filters(search_filter_list, Submit_newwest_first);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elementToBeClickable(filters_box, 10);
		com.Scroll_To_Element(next_page);
		com.element_to_be_stable(2000);
		com.Explicit_wait_elementToBeClickable(last_page, 10);
		last_page.click();
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elementToBeClickable(filters_box, 10);
		com.Explicit_wait_elementToBeClickable(application_no_text, 10);
		newest_last_oldest_cosider_initial = com.Get_Text_single_element(application_no_text_last);
		driver.navigate().refresh();
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.element_to_be_stable(1000);
		filters_box.click();
		com.Explicit_wait_elements_visiblity(search_filter_list, 10);
		com.element_to_be_stable(1000);
		com.Search_filters_compare(search_filter_list, Submit_oldest_fisrt);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.Explicit_wait_elementToBeClickable(application_no_text, 10);
		newest_last_oldest_cosider = com.Get_Text_single_element(application_no_text);

	}
    public void Sorting_Defination(String all_tab,String non_submit,String submit) throws InterruptedException
    {
    	Common_class com = new Common_class(driver);
		com.Explicit_wait_elements_visiblity(app_main_action_tab, 50);
		com.get_elements_text_click(app_main_all_tabs, all_tab);
		com.Explicit_wait_elementToBeInvisible(spinner, 100);
		com.element_to_be_stable(1300);
		com.Explicit_wait_elementToBeClickable(filters_box_defination, 10);
		filters_box_defination.click();
		com.Explicit_wait_elementToBeClickable(defination_drop_down_search, 5);
		defination_drop_down_search.sendKeys(non_submit);
		com.Explicit_wait_elementToBeClickable(all_defination_check_box, 5);
		if(all_defination_check_box.isDisplayed())
		{
			non_submitted_def=true;
			
		}
		defination_drop_down_search.clear();
		defination_drop_down_search.sendKeys(submit);
		if(submitted_defination_check_box.isDisplayed())
		{
			submitted_def=true;
			
		}
    }
}
