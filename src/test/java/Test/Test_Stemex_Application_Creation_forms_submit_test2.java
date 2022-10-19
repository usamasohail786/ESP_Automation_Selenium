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
		int date_here=app_obj.verify_price_data_into_all_fields();
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
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 14)
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
	@org.testng.annotations.Test(priority = 15)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Submit All Look Up Fields")
	@Feature("Look Up Fields")
	public void App_Test_Look_Fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_sending_data_into_all_look_up_fields();
	
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 16)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Attachment filled")
	@Feature("Attachment Upload")
	public void App_Test_Attachment_uploads() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_upload_all_the_attachment();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 17)
	@Severity(SeverityLevel.CRITICAL)
	@Description("All Images Upload ")
	@Feature("Image Upload")
	public void App_Test_Image_uploads() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_upload_all_the_Image();
	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 18)
	@Severity(SeverityLevel.CRITICAL)
	@Description("All Images Upload in Gallery ")
	@Feature("Image Upload in Gallery")
	public void App_Test_Gallery_uploads() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_upload_all_the_Image_in_gallery();
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 19)
	@Severity(SeverityLevel.CRITICAL)
	@Description("All Fields Validation after Submition")
	@Feature("Fields Validation")
	public void App_Test_Verify_all_the_submitted_fields() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.sizes_after_submit();
		SoftAssert softAssertion= new SoftAssert();
		int size_number_after=app_obj.size_number_After;
		int number_before=app_obj.numbers;
		softAssertion.assertEquals(size_number_after, number_before,"Number field not submitted properly");
		int currency_after=app_obj.size_currency_after;
		int currency_before_number=app_obj.currency;
		softAssertion.assertEquals(currency_after, currency_before_number,"Currency field not submitted properly");
		int size_email_after=app_obj.size_email_After;
		int size_email_before=app_obj.email;
		softAssertion.assertEquals(size_email_after, size_email_before,"Email field not submitted properly");
		int size_date_after=app_obj.size_date_after;
		int size_date_before=app_obj.date;
		softAssertion.assertEquals(size_date_after, size_date_before,"Date field not submitted properly");
		int size_date_time_after=app_obj.size_date_time_after;
		int size_date_time_before=app_obj.date_time;
		softAssertion.assertEquals(size_date_time_after, size_date_time_before,"Date Time field not submitted properly");
		int size_file_after=app_obj.size_file_after;
		int size_file_file_before=app_obj.file_upload;
		softAssertion.assertEquals(size_file_after, size_file_file_before,"File field not submitted properly");
		int size_image_after=app_obj.size_images_after;
		int size_image_before=app_obj.images;
		softAssertion.assertEquals(size_image_after, size_image_before,"Image field not submitted properly");
		int size_links_after=app_obj.size_links_after;
		System.out.print(size_links_after+"after link.........");
		int size_links_before=app_obj.links;
		softAssertion.assertEquals(size_links_after, size_links_before,"Links field not submitted properly");
		System.out.print(size_links_before+"before link");
		int size_look_up_after=app_obj.size_look_up_after;
		int size_look_before=app_obj.look_up;
		softAssertion.assertEquals(size_look_up_after, size_look_up_after,"Look Up field not submitted properly");
		int size_short_text_before=app_obj.short_text;
		int size_short_text_after=app_obj.size_short_Text_After;
		softAssertion.assertEquals(size_short_text_after, size_short_text_before,"Short text field not submitted properly");
		int size_long_text_after=app_obj.long_text;
		int size_long_text_before=app_obj.size_long_Text_After;
		softAssertion.assertEquals(size_long_text_after, size_long_text_before,"Long text field not submitted properly");
		softAssertion.assertAll();
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
	public void App_Test_Add_Multi_Sections() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_submission app_obj = new Create_Application_Page_form_submission(obj.driver);
		app_obj.verify_adding_multi_section();
	
	
		
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
