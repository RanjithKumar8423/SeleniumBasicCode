package seleniumsession;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		Select select=new Select(country);
		select.selectByIndex(5);
		select.selectByValue("India");
		List<WebElement> alllist=select.getOptions();
		int count=alllist.size();
		System.out.println(count);
		for (WebElement e : alllist) {
			String text=e.getText();
			System.out.println(text);
			if (text.contains("Ukraine")) {
				e.click();
				break;
				
			}
		
		}
		

	}

}
