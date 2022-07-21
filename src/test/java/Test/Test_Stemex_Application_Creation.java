package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import java.io.IOException;


import org.json.simple.parser.ParseException;


import org.testng.annotations.AfterMethod;
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
public class Test_Stemex_Application_Creation extends Test_Data {
	Test_Base obj = new Test_Base();
	// WebDriver driver;

	@org.testng.annotations.BeforeClass
	public void setup() {

		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}

	@org.testng.annotations.Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("verifying user can create application and moreover that application exist in All,Mine and Action Tabs")
	@Feature("Create Application")
	public void App_Create_Test() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Log_In_Stem_ex log_obj = new Log_In_Stem_ex(obj.driver);
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		log_obj.Log_In(phone_number, pass);
		//String URL = obj.driver.getCurrentUrl();
		//assertEquals(URL, url);
		app_obj.Choose_Group(group_name);
		String tab_text_exist = app_obj.Choose_Tab(tab);
		assertEquals(tab_text_exist, tab);
		app_obj.Creat_Application(search_app, create_app_btn, field1_data, submit_btn_text, field_place_holder,
				done_btn_text, app_main_mid_tab);
		Boolean actual_app_result = app_obj.verify_action_tab();
		assertTrue(actual_app_result);
		Boolean actual_mine_tab_result = app_obj.verify_mine_tab(app_main_mid_tab);
		assertTrue(actual_mine_tab_result);
		System.out.print("test");
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}

	@org.testng.annotations.AfterMethod
	public void Tear_Down() throws InterruptedException {

		obj.driver.quit();

	}
}
