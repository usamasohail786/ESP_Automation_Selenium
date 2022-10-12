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
import Pages.Create_Application_Page_form_validations;
import Pages.Log_In_Stem_ex;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Stemex_Application_Creation_forms_validation_test extends Test_Data {
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
	@org.testng.annotations.Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying short_text min validation working fine")
	@Feature("Short Text Min Validation")
	public void App_short_text_validation_test_min_length() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_validations app_obj = new Create_Application_Page_form_validations(obj.driver);
		String validations=app_obj.verify_validation_on_min_text_all_short_text();
		assertEquals(validations, "Validation on short text working fine");
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 5)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying Validation on Email")
	@Feature("Validation on Email")
	public void Email_Test_Validation() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page_form_validations app_obj = new Create_Application_Page_form_validations(obj.driver);
		String validations=app_obj.verify_validation_on_min_text_all_email_text();
		assertEquals(validations, "Validation on Email  working fine");
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 6)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying Read Only Field")
	@Feature("Read Only Field")
	public void read_only_field_test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.verify_read_only_field();
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 7)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify Calendar today date working fine")
	@Feature("Calendar date")
	public void calendar_today_date_test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.today_date_validate(t_date);
	
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 8)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the default date exist or not")
	@Feature("Default date")
	public void default_date_test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.default_Date_exist();
		assertTrue(app_obj.default_Date_exist);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 9)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the Hint Icon exist or not when selected from ESP")
	@Feature("Hint Icon")
	public void Hint_Icon_test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Hint_working_fine();
		assertTrue(app_obj.hint_icon_exist);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 10)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the ")
	@Feature("Hint Icon")
	public void Min_Max_Test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Max_and_Min_Value();
		assertTrue(app_obj.min_max_error_bool);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 11)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the phone number validation working fine")
	@Feature("Phone number validation")
	public void Phone_number_Test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Phone_Field();;
		assertTrue(app_obj.phone_min_max_error_bool);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 12)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the Attachment working fine")
	@Feature("Attachment")
	public void attachment_Test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Attachment_working_fine();
		assertTrue(app_obj.sample_pdf_uploaded_successfully,"File not uploaded successfully");
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 13)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the Image Attachment working fine")
	@Feature("Image Attachment")
	public void Image_attachment_Test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Image_Attachment_working_fine();
		
		//assertTrue(app_obj.sample_pdf_uploaded_successfully,"File not uploaded successfully");
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 14)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the Rating exist on applicant side")
	@Feature("Rating")
	public void Rating_Test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Rating_working_fine();
		assertTrue(app_obj.rating_bool,"Rating not exist");
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 15)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the Currency field exist and correct currency exist")
	@Feature("Currency exist and currency correct")
	public void Currency_Test_Single_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		app_obj.Verify_Currency_working_fine();	
		Thread.sleep(7000000);
		assertTrue(app_obj.currency_exist_bool,"Currency not exist");
		assertTrue(app_obj.currency_correct_bool,"Currency is not correct");
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
