package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldvalue {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		 driver.findElement(By.name("search")).sendKeys("Ranjith");
//		String passestext= driver.findElement(By.name("search")).getAttribute("value");
//		System.out.println(passestext);
		By locator_id= By.name("search");
		String sendingvalue="RanjithKumar86257";
		String getattributevalue="value";
		System.out.println(dosendkey(locator_id, sendingvalue, getattributevalue));
	}
	 public static WebElement getelement(By Locator) {
			return driver.findElement(Locator);
	    	 
	     }
	 public static String dosendkey(By Locator, String passingvalue, String getingvalue) {
		 getelement(Locator).sendKeys(passingvalue);
		 return getelement(Locator).getAttribute(getingvalue);
	 }

}
