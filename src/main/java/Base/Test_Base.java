package Base;



	
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test_Base {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initialize_driver() {

		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",project_path+"\\\\Driver\\\\chromedriver.exe"); 
		System.out.println(System.getProperty("java.runtime.version"+"................version"));
	    driver = new ChromeDriver();      
	    driver.manage().window().maximize();
		tdriver.set(driver);
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
}


	
	
	