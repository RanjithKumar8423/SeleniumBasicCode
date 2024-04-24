package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
//		List<WebElement> findElements = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		System.out.println(findElements.size());
//		for (WebElement e : findElements) {
//			String text = e.getText();
//			if (text.contains("Venezuela")) {
//				e.click();
//				System.out.println(text);
//				break;
//			}
//			
//		}
		By xpath_options = By.xpath("//select[@id='Form_getForm_Country']/option");
		DoselectOption(xpath_options, "Venezuela");
		DoselectOption(xpath_options, "India");
		int count = TotalCountryofCountry(xpath_options);
		System.out.println(count);

		
	}
	public static WebElement getelement(By Locator) {
		return driver.findElement(Locator);

	}
	public static List<WebElement> getelements(By Locator) {
		return driver.findElements(Locator);
	}
	public static void DoselectOption(By Locator, String CountryName ) {
		for (WebElement e : getelements(Locator)) {
			String text = e.getText();
			if (text.contains(CountryName)) {
				e.click();
				System.out.println(text);
				break;
			}
		}
	}
	public static int TotalCountryofCountry(By Locator) {
		return getelements(Locator).size();
	}

}
