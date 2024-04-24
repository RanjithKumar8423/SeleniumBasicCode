package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//select country with using any selectby method
public class SelectDropDownAllOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
//		WebElement countrylist= driver.findElement(By.id("Form_getForm_Country"));
//		Select select=new Select(countrylist);
//		List<WebElement> list=select.getOptions();
//		for (WebElement e : list) {
//			String text=e.getText();
//			if (text.equals("India")) {
//				e.click();
//				
//			}
//			
//		}
		By Dropdown = By.id("Form_getForm_Country");
		// doselect(Dropdown, "India");
		System.out.println(getDropDownOptionsTextList(Dropdown));
	}

	public static WebElement getelement(By Locator) {
		return driver.findElement(Locator);

	}

	public static void doselect(By Locator, String value) {
		List<WebElement> list = dropdownoptions(Locator);
		for (WebElement e : list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}

	public static int dropdowncount(By Locator) {
		List<WebElement> list = dropdownoptions(Locator);
		return list.size();
	}

	public static List<WebElement> dropdownoptions(By Locator) {
		Select select = new Select(getelement(Locator));
		return select.getOptions();
	}

	public static List<String> getDropDownOptionsTextList(By Locator) {
		List<WebElement> list = dropdownoptions(Locator);
		List<String> optionslist = new ArrayList<String>();
		for (WebElement e : list) {
			String text = e.getText();
			optionslist.add(text);
			
		}
		return optionslist;
	}
}
