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
public class Test_Stemex_Application_Creation_with_stage_verification extends Test_Data {
	Test_Base obj = new Test_Base();
	// WebDriver driver;

	@org.testng.annotations.BeforeClass
	public void setup() {

		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}
	
	@org.testng.annotations.Test(priority = 3)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Creating Application to check Stages")
	@Feature("Create Application to Test Stages")
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
	@org.testng.annotations.Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify Stage 1 approval working fine")
	@Feature("Stage 1 Approval")
	public void App_Create_verify_stage1() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_stage_page app_obj = new Create_Application_stage_page(obj.driver);
		
		String stage1_accept=app_obj.Approve_verify_Stage1();
		
		assertEquals(stage1_accept, complete_stage_1);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 5)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify Stage 2 Approval working fine")
	@Feature("Stage 2 Approval")
	public void App_Create_verify_stage2() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
		Create_Application_stage_page app_obj = new Create_Application_stage_page(obj.driver);
		
		app_obj.Approve_verify_Stage2();
		app_obj.Approve_verify_both_stages_completed();
		assertTrue(app_obj.accepted_size,"Stages not approved properly");
		//System.out.print(stage2_accept+"...............................................");
		//assertEquals(stage2_accept, complete_stage_1);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
		   }
	}
	@AfterClass
	public void Tear_Down() throws InterruptedException {

		obj.driver.quit();

	}
}
