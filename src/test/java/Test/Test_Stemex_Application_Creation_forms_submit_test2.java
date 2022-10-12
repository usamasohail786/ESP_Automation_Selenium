package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import java.io.IOException;


import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import Base.Test_Base;
import Pages.Create_Application_Page;
import Pages.Create_Application_Page_form_submission;
import Pages.Log_In_Stem_ex;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Stemex_Application_Creation_forms_submit_test2 extends Test_Data {
	Test_Base obj = new Test_Base();


	@org.testng.annotations.BeforeClass
	public void setup() {

		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}
	
	@org.testng.annotations.Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying forms with the help of creating application")
	@Feature("Create Application")
	public void App_Create_Test_forms_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Log_In_Stem_ex log_obj = new Log_In_Stem_ex(obj.driver);
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		log_obj.Log_In(phone_number, pass);
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, url);
		app_obj.Choose_Group(group_name);
		String tab_text_exist = app_obj.Choose_Tab(tab);
		assertEquals(tab_text_exist, tab);
		app_obj.Creat_Application_to_test_forms(app_name_forms, create_app_btn, field1_data, submit_btn_text, field_place_holder,
				done_btn_text, app_main_mid_tab,app_text_display);
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 6)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of short text")
	@Feature("Short Text")
	public void App_short_text_sending_data_in_all_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_short_text();
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 7)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of email text")
	@Feature("Email Text")
	public void App_email_text_sending_data_in_all_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
			Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
			app_obj.verify_sending_data_into_all_email_field();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 8)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of long text")
	@Feature("Long Text")
	public void App_Long_text_sending_data_in_all_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_long_fields();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 9)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into phone numbers")
	@Feature("Phone Number")
	public void App_Long_text_sending_data_in_all_random_number_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_phone_numbers();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 10)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of numbers")
	@Feature("Numbers")
	public void App_Phone_number_sending_data_in_all_random_number_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_numbers();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 11)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all currency fields")
	@Feature("Currency")
	public void App_Money_sending_into_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_currency_data_into_all_fields();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(enabled = false)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all price fields")
	@Feature("Price")
	public void App_price_sending_into_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_price_data_into_all_fields();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	
	@org.testng.annotations.Test(priority = 12)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all currency fields")
	@Feature("Currency")
	public void App_link_sending_into_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_links();
	   
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 5)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Fill All dates Randomly")
	@Feature("Date")
	public void App_date_fill_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.click_on_all_dates_fields();
	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 13)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Fill All dates Randomly")
	@Feature("Date")
	public void App_date_time() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.click_on_all_date_time_fields();
		Thread.sleep(400000);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 13)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Fill All dates Randomly")
	@Feature("Date")
	public void App_Test_Rating() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.randomly_click_rating();
	
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@AfterClass
	public void Tear_Down() throws InterruptedException {

		obj.driver.quit();

	}
}
