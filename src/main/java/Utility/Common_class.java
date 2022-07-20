package Utility;

import java.io.File;

import java.io.IOException;

import java.sql.Timestamp;
import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

import com.paulhammant.ngwebdriver.NgWebDriver;

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

	public WebElement Explicit_wait_elementToBeClickable(WebElement element_hover_wait, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		return wait.until(ExpectedConditions.elementToBeClickable(element_hover_wait));

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

	public void Explicit_wait_elements_visiblity(List<WebElement> list_element, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.visibilityOfAllElements(list_element));
	}

	public void Explicit_wait_elements_presence(List<WebElement> list_element, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) list_element));
	}

	public void Explicit_wait_elementToBeVisible(WebElement element_hover_wait, int waittime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.visibilityOf(element_hover_wait));

	}

	public void Explicit_wait_elementToBeInvisible(WebElement element, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void Explicit_wait_until_element_selected(WebElement search_box, int waittime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waittime));
		wait.until(ExpectedConditions.elementToBeSelected(search_box));

	}

	public void Mouse_hover_on_element(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void Mouse_to_element(WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	public void Scroll_To_Element(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void get_elements_text_click(List<WebElement> list_element, String text) throws InterruptedException {

		for (WebElement webElement : list_element) {

			String name = webElement.getText();

			if (name.contains(text)) {
				webElement.click();
				break;
			}
		}
	}

	public void Search_filters(List<WebElement> list_element, String text) throws InterruptedException

	{

		for (WebElement webElement : list_element) {

			String name = webElement.getText();

			if (name.contains(text)) {

				webElement.click();
				break;

			}

		}
	}

	public void Search_filters_compare(List<WebElement> list_element, String text) throws InterruptedException

	{

		for (WebElement webElement : list_element) {

			String name = webElement.getText();

			if (name.contains(text)) {

				webElement.click();
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

	public int counter_int(String Text) {
		int counter = 0;
		counter = Integer.parseInt(Text);
		return counter;
	}

	public void fluentwait(WebElement elem) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(1500)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(elem));

	}

}
