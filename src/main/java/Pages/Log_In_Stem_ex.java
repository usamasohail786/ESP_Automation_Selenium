package Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Common_class;



public class Log_In_Stem_ex {
	
	WebDriver driver = null;
	@FindBy(xpath="//mat-label[text()='Mobile Number']/parent::label/parent::span/preceding-sibling::input")
	WebElement phone_number;
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password_input_text;
	@FindBy(xpath="//input[@name='email']")
	WebElement  email_input_text;
	@FindBy(xpath="//span[text()='Sign In']")
	WebElement  sign_in_btn;
	@FindBy(xpath="//h4[@class='group-title']")
	List<WebElement> choose_group;
	@FindBy(xpath="//img[@src='assets/images/header/logo-stemexe.png']")
	WebElement  stemex_logo;
	@FindBy(xpath="//mat-spinner")
	WebElement  spinner;
	@FindBy(xpath="//a[@class='mat-focus-indicator menu-item mat-menu-item ng-star-inserted']//div//span")
	List<WebElement> tab_list;
	@FindBy(xpath="//a[@href='/pages/profile']")
	WebElement  profile_img;
	@FindBy(xpath="//mat-error")
	WebElement  pass_error;
	
	public String error=null;
    public Log_In_Stem_ex(WebDriver driver) {
    	
    	this.driver = driver;
    	PageFactory.initElements(driver,this);
    }
    public void Log_In(String phone,String pass) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	
    	com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	password_input_text.clear();
    	com.Explicit_wait_elementToBeClickable(phone_number, 100);
    	System.out.print(phone+"phone................");
    	phone_number.sendKeys(phone);
    	Thread.sleep(2000);
    	password_input_text.sendKeys(pass);
    	sign_in_btn.click();
    	System.out.print(sign_in_btn+"sign in button");
        com.Explicit_wait_elementToBeInvisible(spinner, 100);
    }
    public void Log_In_wrong_credentials(String phone,String pass) throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	
    	com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	com.Explicit_wait_elementToBeClickable(phone_number, 30);
    	phone_number.sendKeys(phone);
    	password_input_text.sendKeys(pass);
    	com.js_click(sign_in_btn);
    	com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	
    	
    	
    }
   

}


