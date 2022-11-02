package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Random;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Predicate;
import com.paulhammant.ngwebdriver.NgWebDriver;

import Pages.Satge_page;
import dev.failsafe.Timeout;
import io.netty.util.internal.ThreadLocalRandom;

//import com.paulhammant.ngwebdriver.NgWebDriver;

public class Common_class {

	WebDriver driver = null;
	public int counter = 1;

	public Common_class(WebDriver driver) {
		this.driver = driver;
		

	}

	public void Implicit_wait(int waittime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waittime));

	}

	public NgWebDriver getNGDriver() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (new NgWebDriver(js));
	}
  
	public void element_to_be_stable(int waittime) throws InterruptedException {

		Thread.sleep(waittime);
	}

	public WebElement Explicit_wait_elementToBeClickable(WebElement element_hover_wait, int waittime) throws InterruptedException {
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		return wait.until(ExpectedConditions.elementToBeClickable(element_hover_wait));
		}
		catch(Exception e)
		{
			element_to_be_stable(4000);
		}
		return element_hover_wait;

	}
	public void js_Wait()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
		    .executeScript("return document.readyState")));
	}

	public void Get_Attribute_of_element_click(List<WebElement> list_element, String text, String attribute,
			String Field_data) {
		for (WebElement webElement : list_element) {

			String name = webElement.getAttribute(attribute);

			if (name.contains(text)) {

				webElement.sendKeys(Field_data);
				break;

			}
		}

	}
	
 
	public void Explicit_wait_elements_visiblity(List<WebElement> list_element, int waittime) throws InterruptedException {
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.visibilityOfAllElements(list_element));
		}
		catch(Exception e)
		{
			element_to_be_stable(4000);
		}
	}
	

	public void Explicit_wait_elements_presence(List<WebElement> list_element, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) list_element));
	}

	public void Explicit_wait_elementToBeVisible(WebElement element_hover_wait, int waittime) throws InterruptedException {
      try
      {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.visibilityOf(element_hover_wait));
      }
      catch(Exception e)
      {
    	  element_to_be_stable(4000);
      }

	}
	public void Explicit_wait_elementTextAppear(WebElement element_hover_wait, int waittime,String Text) throws InterruptedException {
	      try
	      {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
			wait.until(ExpectedConditions.textToBePresentInElement(element_hover_wait,Text));
	      }
	      catch(Exception e)
	      {
	    	  element_to_be_stable(4000);
	      }

		}
	public void Explicit_wait_elementToBeStale(WebElement element_hover_wait, int waittime) throws InterruptedException {
	      try
	      {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
			wait.until(ExpectedConditions.stalenessOf(element_hover_wait));
	      }
	      catch(Exception e)
	      {
	    	  element_to_be_stable(4000);
	      }

		}

	public void Explicit_wait_elementToBeInvisible(WebElement element, int waittime) throws InterruptedException {
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.invisibilityOf(element));
		}
		catch(Exception e)
		{
			element_to_be_stable(4000);
		}
	}

	public void Explicit_wait_until_element_selected(WebElement search_box, int waittime) throws InterruptedException {
		try
		{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.elementToBeSelected(search_box));
		}
		catch(Exception e)
		{
			element_to_be_stable(4000);
		}

	}

	public void Mouse_hover_on_element(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void Mouse_to_element(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}
  public void js_click(WebElement element)
  {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
  }
	public void Scroll_into_View(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollBy(0,350)", "");
	}
	public void Scroll_by_Pixel(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");
	}
	public void Scroll_To_Element(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void get_elements_text_click(List<WebElement> list_element, String text) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		System.out.print(text+"text heree");
		for (WebElement webElement : list_element) {

			String name = webElement.getText();
			System.out.println(webElement.getText()+"get text show request.............");
			if (name.contains(text)) {
				js.executeScript("arguments[0].click()", webElement);
				System.out.println(webElement.getText()+"get text show request.............");
				break;
			}
		}
	}
	public int get_elements_text_random(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomStringFromArr();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
			}
	public int get_elements_text_random_clear(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomStringFromArr();
        	list_element.get(i).clear();
        	
        }
		return list_element.size();
			}
	public int get_elements_Defination_look_up_fields(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomLookDefinationFromArr();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
			}
	public int get_elements_Defination_look_up_fields_clear(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomLookDefinationFromArr();
        	list_element.get(i).sendKeys(L);
        	list_element.get(i).clear();
        }
		return list_element.size();
			}
	public int get_elements_text_random_validation(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomStringFromArrminvalue();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
			}
	public int get_elements_email_text_random(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        { 
			String L=Random_Function.randomemailFromArr();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
	}
		public int get_elements_email_text_random_clear(List<WebElement> list_element) throws InterruptedException {
			for(int i=0;i<list_element.size();i++)
	        { 
				String L=Random_Function.randomemailFromArr();
	        	list_element.get(i).sendKeys(L);
	        	list_element.get(i).clear();
	        }
			return list_element.size();
			}
	public int file_attach_randomly(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        { 
			String L=Random_Function.randomfile();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
	}
		public int file_attach_randomly_clear(List<WebElement> list_element) throws InterruptedException {
			for(int i=0;i<list_element.size();i++)
	        { 
				String L=Random_Function.randomfile();
	        	list_element.get(i).sendKeys(L);
	        	list_element.get(i).clear();
	        }
			return list_element.size();
			}
	public int image_attach_randomly(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        { 
			String L=Random_Function.randomeimages();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
	}
		public int image_attach_randomly_clear(List<WebElement> list_element) throws InterruptedException {
			for(int i=0;i<list_element.size();i++)
	        { 
				String L=Random_Function.randomeimages();
	        	list_element.get(i).sendKeys(L);
	        	list_element.get(i).clear();
	        }
			return list_element.size();
			}
	public int gallery_attach_randomly(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        { 
			String L=Random_Function.randomeimages();
        	list_element.get(i).sendKeys(L);
        }
		return list_element.size();
			}
	public int gallery_attach_randomly_clear(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        { 
			String L=Random_Function.randomeimages();
        	list_element.get(i).sendKeys(L);
        	list_element.get(i).clear();
        }
		return list_element.size();
			}
	public void randomemailFromArrValidation(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        { 
		String L=Random_Function.randomemailFromArrValidation();
    	list_element.get(i).sendKeys(L);
        }
		}
	public int get_elements_link_text_random(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomURLFromArr();
        	list_element.get(i).sendKeys(L);
        	
        }
		return list_element.size();
			}
	public int get_elements_link_text_random_clear(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			String L=Random_Function.randomURLFromArr();
        	list_element.get(i).sendKeys(L);
        	list_element.get(i).clear();
        }
		return list_element.size();
			}
	public int all_date_click(List<WebElement> list_element) throws InterruptedException {
		for(int i=0;i<list_element.size();i++)
        {  
			Thread.sleep(2000);
        	list_element.get(i).click();
        }
		return list_element.size();
			}

public int get_random_number(List<WebElement> list_element) throws InterruptedException {
for(int i=0;i<list_element.size();i++)
{  
	int L=Random_Function.randomintgenerate();
	list_element.get(i).sendKeys(String.valueOf(L));
}
return list_element.size();
	}
public int get_random_number_clear(List<WebElement> list_element) throws InterruptedException {
for(int i=0;i<list_element.size();i++)
{  
	int L=Random_Function.randomintgenerate();
	list_element.get(i).sendKeys(String.valueOf(L));
	list_element.get(i).clear();
}
return list_element.size();
	}
public int get_random_phone_number(List<WebElement> list_element) throws InterruptedException {
for(int i=0;i<list_element.size();i++)
{  
	int L=Random_Function.randomintgenerate_phone_number();
	list_element.get(i).sendKeys(String.valueOf(L));
}
return list_element.size();
}
public int get_random_phone_number_clear(List<WebElement> list_element) throws InterruptedException {
for(int i=0;i<list_element.size();i++)
{  
	int L=Random_Function.randomintgenerate_phone_number();
	list_element.get(i).sendKeys(String.valueOf(L));
	list_element.get(i).clear();
}
return list_element.size();
	}
	public void upload_file() throws AWTException
	{
		Robot rb = new Robot();
    	
    	// press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        
        rb.keyPress(KeyEvent.VK_V);
    
       // release Contol+V for pasting
       rb.keyRelease(KeyEvent.VK_CONTROL);
       rb.keyRelease(KeyEvent.VK_V);
    
       // for pressing and releasing Enter
       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);
       System.out.print("presses1............");
	}

	public void Search_filters(List<WebElement> list_element, String text) throws InterruptedException
	
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (WebElement webElement : list_element) {

			String name = webElement.getText();

			if (name.contains(text)) {
				js.executeScript("arguments[0].click()", webElement);
				break;

			}

		}
	}
public int send_date_on_list(List<WebElement> list_element) throws InterruptedException
	
	{
		
	for(int i=0;i<list_element.size();i++)
    {  
		
		String L=Random_Function.random_date();
		String F=Random_Function.randomStringFromTimevalue();
		Explicit_wait_elementToBeVisible(list_element.get(i), 5);
    	list_element.get(i).sendKeys(L);
    	list_element.get(i).sendKeys(F);
    }			
return list_element.size();}
public int send_date_on_list_clear(List<WebElement> list_element) throws InterruptedException

{
	
for(int i=0;i<list_element.size();i++)
{  
	
	String L=Random_Function.random_date();
	String F=Random_Function.randomStringFromTimevalue();
	Explicit_wait_elementToBeVisible(list_element.get(i), 5);
	list_element.get(i).sendKeys(L);
	list_element.get(i).sendKeys(F);
}			
return list_element.size();
		
	}

public void send_time_on_list(List<WebElement> list_element) throws InterruptedException

{
	
for(int i=0;i<list_element.size();i++)
{  
	
	String L=Random_Function.randomStringFromTimevalue();
	Explicit_wait_elementToBeVisible(list_element.get(i), 5);
	list_element.get(i).sendKeys(L);
}			

	
}
public void send_time_on_list_clear(List<WebElement> list_element) throws InterruptedException


{
	
for(int i=0;i<list_element.size();i++)
{  
	
	String L=Random_Function.randomStringFromTimevalue();
	Explicit_wait_elementToBeVisible(list_element.get(i), 5);
	list_element.get(i).sendKeys(L);
	list_element.get(i).clear();
}			

	
}


public void random_clicks(List<WebElement> list_element) throws InterruptedException

{
	
	Random r = new Random();
	int randomValue = r.nextInt(2); //Getting a random value that is between 0 and (list's size)-1
	list_element.get(randomValue).click(); //Clicking on the random item in the list.		
	
}
public void random_clicks_stage(List<WebElement> list_element) throws InterruptedException, FileNotFoundException, IOException, ParseException

{
	int size_list=Satge_page.size;
	Random r = new Random();
	int randomValue = r.nextInt(size_list); //Getting a random value that is between 0 and (list's size)-1
	list_element.get(randomValue).click(); //Clicking on the random item in the list.		
	
}
public void random_clicks_user_list(List<WebElement> list_element) throws InterruptedException, FileNotFoundException, IOException, ParseException

{
	int size_list=Satge_page.user_list_size;
	Random r = new Random();
	int randomValue = r.nextInt(size_list); //Getting a random value that is between 0 and (list's size)-1
	list_element.get(randomValue).click(); //Clicking on the random item in the list.		
	
}
public int click_while(WebElement element,List<WebElement> form) throws InterruptedException

{
	System.out.print("form click here");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	int j=0;
	for (int i=0;i<Random_Function.random_number();i++) {

		String name = form.get(i).getText();
		js.executeScript("arguments[0].click()", element);
	
		j++;
		if (name=="Form#3") {		
			System.out.print("form click");
			break;
		}

	}
	return j;
			
}
public void remove_atribute(List<WebElement> list_element) throws InterruptedException
{
	for (WebElement input : list_element) {
	    ((JavascriptExecutor) driver).executeScript(
	                "arguments[0].removeAttribute('readonly','readonly')",input);
	}

}
	public void Search_filters_compare(List<WebElement> list_element, String text) throws InterruptedException
	
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (WebElement webElement : list_element) {

			String name = webElement.getText();

			if (name.contains(text)) {
				js.executeScript("arguments[0].click()", webElement);
				break;

			}

		}
	}

	public String Get_Text_element(List<WebElement> list_element, String text) throws InterruptedException

	{

		String get_text = null;
		for (WebElement webElement : list_element) {

			String name = webElement.getText();
           
			if (name.contains(text)) {
				
				get_text = webElement.getText();	
				break;

			}
		
		}
		
		return get_text;
	}

	public void Screen_Shot_Element(WebElement element) {

		File SrcScreenshot = element.getScreenshotAs(OutputType.FILE);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		try {
			FileHandler.copy(SrcScreenshot,
					new File(System.getProperty("user.dir") + "\\ScreenShot\\" + timestamp.getNanos() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}

	public String Get_Text_single_element(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String txt_back = element.getText();
		return txt_back;
	}

	public void Screen_Shot_Full_Fcreen() {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {

			Timestamp timestamp = new Timestamp(System.currentTimeMillis());

			FileHandler.copy(src,
					new File(System.getProperty("user.dir") + "\\ScreenShot\\" + timestamp.getNanos() + ".png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
   public static void softAssertion()
   {
	   SoftAssert softAssertion= new SoftAssert();
   }
	public int counter_int(String Text) {
		int counter = 0;
		counter = Integer.parseInt(Text);
		return counter;
	}
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		}
		
	public void fluentwait(WebElement elem) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(1500)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(elem));

	}
	public void randomly_select(List<WebElement> option_select_list)
	{

		Random r = new Random();
		int randomValue = r.nextInt(option_select_list.size()); //Getting a random value that is between 0 and (list's size)-1
		option_select_list.get(randomValue).click();
	
		}
	}

