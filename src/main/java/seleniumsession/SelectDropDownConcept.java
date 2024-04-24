package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		 driver.get("https://orangehrm.com/en/30-day-free-trial");
//		WebElement country= driver.findElement(By.id("Form_getForm_Country"));
//		Select select=new Select(country);
//		select.selectByIndex(10);
//		select.selectByVisibleText("Algeria");
		By countrylist= By.id("Form_getForm_Country");
//		int index_value=30;
//		doselectdropdownbyindex(countrylist, index_value);
		doselectdropdownbyvisibletext(countrylist, "Algeria");
	}
	 public static WebElement getelement(By Locator) {
			return driver.findElement(Locator);
	     }
	 public static void doselectdropdownbyindex(By Locator, int value) {
		 Select select=new Select(getelement(Locator));
		 select.selectByIndex(value);
	 }
	 public static void doselectdropdownbyvisibletext(By Locator, String value) {
		 donullblankcheck(value);
		 Select select=new Select(getelement(Locator));
		 select.selectByVisibleText(value);
	 }
	 public static void doselectdropdownbyvalue(By Locator, String value) {
		 donullblankcheck(value);
		 Select select=new Select(getelement(Locator));
		 select.selectByValue(value);
	 }
	 public static void donullblankcheck(String value) {
		 if (value==null | value.length()==0) {
			 throw new MyElementExcepts("value should null");
			
		}
	 }
	 

}
