package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import java.io.IOException;


import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import Base.Test_Base;
import Pages.Create_Application_Page;
import Pages.Form_Visiblity_page;
import Pages.Log_In_Stem_ex;
import Pages.Satge_page;
import Utility.Common_class;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Application_Stages extends Test_Data {
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
		Common_class com=new Common_class(obj.driver);
		Log_In_Stem_ex log_obj = new Log_In_Stem_ex(obj.driver);
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		log_obj.Log_In(phone_number, pass);
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, url);
		app_obj.Choose_Group(group_name);
		String tab_text_exist = app_obj.Choose_Tab(tab);
		//assertEquals(tab_text_exist, tab);
	
	//app_obj.Creat_Application_to_test_forms(app_name_forms, create_app_btn, field1_data, submit_btn_text, field_place_holder,
				//done_btn_text, app_main_mid_tab,app_text_display);
		
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
	}
	@org.testng.annotations.Test(priority = 4)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying Visibilty of Single Section Form Using Condition of Application")
	@Feature("Visiblity with Applicant Name")
	public void Form_visiblity_test_using_conditional_in_form_Section() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		try
		{
	    Satge_page app_obj = new Satge_page(obj.driver);
		app_obj.verify_Stages_working_fine();
		Assert.assertNotEquals(Satge_page.count_before, Satge_page.count_after);
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
