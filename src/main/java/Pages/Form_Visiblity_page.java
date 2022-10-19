package Pages;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utility.Common_class;
import Utility.Test_Data;



public class Form_Visiblity_page extends Test_Data {
	WebDriver driver = null;

	@FindBy(xpath="//div[@class='section-controls-container ng-star-inserted']")
	WebElement  form_visibile_container;
	@FindBy(xpath="//div[@class='exceeders-card']")
	WebElement  form_invisibile_container;
	

	
	public boolean form_condition_applicant_name_exist=false;
	public boolean form_invisible=false;
	
    public Form_Visiblity_page(WebDriver driver) throws FileNotFoundException, IOException, ParseException {
    	
    	this.driver = driver;
    	Data();
    	PageFactory.initElements(driver,this);
    
    	
    }
    public void verify_form_visiblity_with_applicant_name_condition() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeVisible(form_visibile_container, 5);
    	if(form_visibile_container.isDisplayed()==true)
    	{
    		form_condition_applicant_name_exist=true;
    		
    	}
    	
    	
    }
    public void verify_form_invisiblity_with_applicant_name_condition() throws InterruptedException
    {
    	Common_class com=new Common_class(driver);
    	com.Explicit_wait_elementToBeVisible(form_invisibile_container, 20);
		com.highLighterMethod(driver, form_invisibile_container);
    	com.element_to_be_stable(5000);
    	if(form_invisibile_container.isDisplayed()==true)
    	{
    		form_invisible=true;
    	}
    	
    	
    }
    
}


