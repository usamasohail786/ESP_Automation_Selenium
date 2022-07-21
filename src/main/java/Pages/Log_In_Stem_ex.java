package Pages;



import java.util.List;
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
	@FindBy(xpath="//button[@type='submit']")
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
    	com.Explicit_wait_elementToBeClickable(phone_number, 100);
    	com.Explicit_wait_elementToBeClickable(phone_number, 30);
    	phone_number.sendKeys(phone);
    	password_input_text.sendKeys(pass);
    	sign_in_btn.click();	
    	try
    	{
    	com.Explicit_wait_elementToBeInvisible(spinner, 100);
    	System.out.println("wait try...........");
    	}
    	catch(Exception e){
    		e.getCause();
    	}
    	try
    	{
    	com.getNGDriver().waitForAngularRequestsToFinish();
    	System.out.println("wait try..........11.");
    	}
    	catch(Exception e){
    		e.getCause();
    	}
}
   



}


