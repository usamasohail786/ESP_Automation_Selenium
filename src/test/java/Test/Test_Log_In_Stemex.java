package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import Base.Test_Base;
import Pages.Log_In_Stem_ex;
import Utility.TestAllureListener;
import Utility.Test_Data;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestAllureListener.class })
public class Test_Log_In_Stemex extends Test_Data {

	Test_Base obj = new Test_Base();

	@org.testng.annotations.BeforeClass
	public void setup() {

		obj.initialize_driver();
		obj.driver.get("https://stemexe-stag.web.app/auth/login");

	}

	@org.testng.annotations.Test(priority = 1)
	@Severity(SeverityLevel.MINOR)
	@Description("Verifying user is not able to Login with Wrong Credentials")
	@Feature("Login")
	public void Test_Stemex_Log_In_with_wrong_credentials() throws InterruptedException, FileNotFoundException, IOException, ParseException, Throwable {
		
		Data();
		try {
		Log_In_Stem_ex log = new Log_In_Stem_ex(obj.driver);
		log.Log_In_wrong_credentials(wrong_phone_no, wrong_pass);
		String URL = obj.driver.getCurrentUrl();
		assertNotEquals(URL, url);
		}
		catch(Exception e2)
		   {
			e2.printStackTrace();
			e2.getMessage();
		   }
		

	}
	
	@org.testng.annotations.Test(priority = 2)
	@Severity(SeverityLevel.MINOR)
	@Description("verifying user is able to Login properly and approching next page successfully")
	@Feature("Login")
	public void Test_Stemex_Log_In() throws InterruptedException, FileNotFoundException, IOException, ParseException, Throwable {
		
		Data();
		try {
		Log_In_Stem_ex log = new Log_In_Stem_ex(obj.driver);
		log.Log_In(phone_number, pass);	
		String URL = obj.driver.getCurrentUrl();
		assertEquals(URL, url);
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
