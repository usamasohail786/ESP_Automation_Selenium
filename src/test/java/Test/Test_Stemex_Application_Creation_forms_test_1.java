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
import Pages.Log_In_Stem_ex;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Stemex_Application_Creation_forms_test_1 extends Test_Data {
	Test_Base obj = new Test_Base();
	// WebDriver driver;

	@org.testng.annotations.BeforeClass
	public void setup() {

		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}
	
	@org.testng.annotations.Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying forms with the help of creating application")
	@Feature("Create Application")
	public void App_Create_Test_forms() throws InterruptedException, FileNotFoundException, IOException, ParseException {
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
		app_obj.verify_min_max_length_of_short_Text();
		assertTrue(app_obj.min_length_error_bol);
		Thread.sleep(3000);
//		Boolean actual_app_result = app_obj.verify_action_tab();
//		assertTrue(actual_app_result);
//		Boolean actual_mine_tab_result = app_obj.verify_mine_tab(app_main_mid_tab);
//		assertTrue(actual_mine_tab_result);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying short_text_length_min_max")
	@Feature("Create Application")
	public void App_short_text_legth_test() throws InterruptedException, FileNotFoundException, IOException, ParseException {
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
		app_obj.verify_min_max_length_of_short_Text();
		assertTrue(app_obj.min_length_error_bol);
		Thread.sleep(3000);
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
