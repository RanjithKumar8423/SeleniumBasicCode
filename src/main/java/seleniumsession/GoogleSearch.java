package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	
		By xpath_GoogleSearch = By.xpath("//ul[@class='G43f7e']//div[@class=\"wM6W7d\"]/span");
		By id_Googlefield = By.name("q");
		GoogleSelect(xpath_GoogleSearch, id_Googlefield, "ranjithkumar", " name meaning");
	}
	public static WebElement getelement(By Locator) {
		return driver.findElement(Locator);

	}
	public static List<WebElement> getelements(By Locator) {
		return driver.findElements(Locator);
	}
	
	public static void GoogleSelect(By Locator, By Locatorfield, String passingData, String search) throws InterruptedException {
		WebElement all = getelement(Locatorfield);
		all.sendKeys(passingData);
		Thread.sleep(3000);
		for (WebElement e : getelements(Locator)) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(search)) {
				e.click();
			}
			
		}
	}

}
