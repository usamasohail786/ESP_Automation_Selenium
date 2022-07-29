package Base;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Test_Base {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initialize_driver() {

		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",project_path+"\\\\Driver\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("resolution", "1680x1050");
		capabilities.setCapability("bstack:options", browserstackOptions);
	    driver = new ChromeDriver();      
	    //driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
}


	
	
	