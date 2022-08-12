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
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
//		options.addArguments("--window-size=1920,1080");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
//		options.addArguments("--allow-insecure-localhost");
	   // driver = new ChromeDriver(options);      
	    driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
}


	
	
	