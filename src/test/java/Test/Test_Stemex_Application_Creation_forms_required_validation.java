package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import java.io.IOException;


import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import Base.Test_Base;
import Pages.Create_Application_Page;
import Pages.Create_Application_Page_form_submission;
import Pages.Log_In_Stem_ex;
import Utility.Common_class;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Stemex_Application_Creation_forms_required_validation extends Test_Data {
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
		app_obj.Creat_Application_to_test_forms(app_name_forms_validations_required, create_app_btn, field1_data, submit_btn_text, field_place_holder,
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
	@Description("Sending data into all fields of short text to check Required Field")
	@Feature("Short Text Required Field Test")
	public void App_short_text_sending_data_in_all_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_short_text();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 7)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of email text to Check Required Field")
	@Feature("Email Text to Check Required Field")
	public void App_email_text_sending_data_in_all_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
			Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
			app_obj.verify_sending_data_into_all_email_field();
			app_obj.submit_btn_display();
			assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
			String URL = obj.driver.getCurrentUrl();
			assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 8)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of long text to Check Required Field")
	@Feature("Long Text to Check Required Field")
	public void App_Long_text_sending_data_in_all_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_long_fields();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 9)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into phone numbers to check Required Field")
	@Feature("Phone Number to Check Required field")
	public void App_Long_text_sending_data_in_all_random_number_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_phone_numbers();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 10)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all fields of numbers to check required field")
	@Feature("Numbers to Check required Field")
	public void App_Phone_number_sending_data_in_all_random_number_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_numbers();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 11)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all currency fields to Check Required Field")
	@Feature("Currency to check required Field")
	public void App_Money_sending_into_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_currency_data_into_all_fields();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(enabled = false)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all price fields to check required Field")
	@Feature("Price to check required field")
	public void App_price_sending_into_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		int date_here=app_obj.verify_price_data_into_all_fields();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	
	@org.testng.annotations.Test(priority = 12)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Sending data into all currency fields to check required field")
	@Feature("Currency to check required field")
	public void App_link_sending_into_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_links();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
	   
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 6)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Fill All dates Randomly to check required field")
	@Feature("Date to check required field")
	public void App_date_fill_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.click_on_all_dates_fields();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 13)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Fill All dates Randomly to check required field")
	@Feature("Date to check required field")
	public void App_date_time_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.click_on_all_date_time_fields();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 14)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Fill All dates Randomly to check required field")
	@Feature("Date to required field")
	public void App_Test_Rating_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.randomly_click_rating();
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 15)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Submit All Look Up Fields to check required field")
	@Feature("Look Up Fields to check required field")
	public void App_Test_Look_Fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_look_up_fields();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 16)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Attachment filled to check required field")
	@Feature("Attachment Upload to check required field")
	public void App_Test_Attachment_uploads_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_upload_all_the_attachment();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 17)
	@Severity(SeverityLevel.CRITICAL)
	@Description("All Images Upload to check required field")
	@Feature("Image Upload to Check required Field")
	public void App_Test_Image_uploads_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_upload_all_the_Image();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 18)
	@Severity(SeverityLevel.CRITICAL)
	@Description("All Images Upload in Gallery to check Required field")
	@Feature("Image Upload in Gallery to check required field")
	public void App_Test_Gallery_uploads_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_upload_all_the_Image_in_gallery();
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 19)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Submit button should not Clickable")
	@Feature("Submit button should not clickable")
	public void App_Test_Verify_all_the_submitted_fields_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.submit_btn_display();
		assertTrue(app_obj.submit_btn_bool,"Submit button clicked");
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Add Multi Sections Randomly")
	@Feature("Add Multi Sections")
	public void App_Test_Add_Multi_Sections_Required_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.submit_btn_display();
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, URL);	
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
