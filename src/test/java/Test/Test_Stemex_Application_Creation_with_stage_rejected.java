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
import Pages.Create_Application_stage_page;
import Pages.Log_In_Stem_ex;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Stemex_Application_Creation_with_stage_rejected extends Test_Data {
	Test_Base obj = new Test_Base();
	// WebDriver driver;

	@org.testng.annotations.BeforeClass
	public void setup() {

		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}
	
	@org.testng.annotations.Test(priority = 6)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Create Application to test Rejected App")
	@Feature("Create Application to test Rejected App")
	public void App_Create_stage_Test() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Log_In_Stem_ex log_obj = new Log_In_Stem_ex(obj.driver);
		Create_Application_stage_page app_obj = new Create_Application_stage_page(obj.driver);
		log_obj.Log_In(phone_number, pass);
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, url);
		app_obj.Choose_Group(group_name);
		String tab_text_exist = app_obj.Choose_Tab(tab);
		assertEquals(tab_text_exist, tab);
		app_obj.Creat_Application(search_app, create_app_btn, field1_data, submit_btn_text, field_place_holder,
				done_btn_text, app_main_mid_tab,app_text_display);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 7)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Testing on Rejected Application on Stage 1")
	@Feature("Rejected Application on Stage 1")
	public void App_Create_verify_stage1_rejected() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_stage_page app_obj = new Create_Application_stage_page(obj.driver);
		
		String stage1_rejected=app_obj.Approve_verify_Stage1_Rejected();
		
		System.out.print(stage1_rejected+"...............................................");
		assertEquals(stage1_rejected, reject_stage);
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
