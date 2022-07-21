package Test;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.junit.After;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Listeners;

import Base.Test_Base;
import Pages.Create_Application_Page;
import Pages.Log_In_Stem_ex;
import Pages.Search_Filters_Stemex;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Listeners({ TestAllureListener.class })
public class Test_Stemex_Search_Filters extends Test_Data {

	Test_Base obj = new Test_Base();

	@org.testng.annotations.BeforeClass
	public void setup() {
		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}

	@org.testng.annotations.Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verifying Status Filters,Definition Filter and Submitted Filters")
	@Feature("Search Filters")
	public void Stemp_Ex_Search_Test() throws InterruptedException, FileNotFoundException, IOException, ParseException {
		Data();
		
		try {
		Log_In_Stem_ex log_obj = new Log_In_Stem_ex(obj.driver);
		Create_Application_Page app_obj = new Create_Application_Page(obj.driver);
		Search_Filters_Stemex search_obj = new Search_Filters_Stemex(obj.driver);
		log_obj.Log_In(phone_number, pass);
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, url);
		app_obj.Choose_Group(group_name);
		app_obj.Choose_Tab(tab);
		search_obj.Search_Status_Filters(filter_open, open_text, app_main_all_tab, filter_accepted, filter_rejected,
				filter_cancelled, no_app_text);
		String open_Actual = search_obj.open;
		assertEquals(open_Actual, open_text);
		String accepted_Actual = search_obj.accepted;
		assertEquals(accepted_Actual, filter_accepted);
		String rejected_Actual = search_obj.rejected;
		assertEquals(rejected_Actual, filter_rejected);
		String cancelled_Actual = search_obj.cancelled;
		assertEquals(cancelled_Actual, filter_cancelled);
		assertEquals(search_obj.accepted_int_count + search_obj.open_int_count + search_obj.cancelled_int_count
				+ search_obj.rejected_int_count, search_obj.all_int_count);
		search_obj.Sorting_Filters(app_main_action_tab, submit_newest_first, submit_oldest_first);
		assertEquals(search_obj.oldest_last_newest_cosider, search_obj.oldest_last_newest_cosider_initial);
		assertEquals(search_obj.newest_last_oldest_cosider, search_obj.newest_last_oldest_cosider_initial);
		search_obj.Sorting_Defination(app_main_all_tab, non_submitted_defination, submitted_defination);
		assertTrue(search_obj.non_submitted_def);
		assertTrue(search_obj.submitted_def);
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
