package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	static WebDriver driver;
	public static void main(String[] args) {
//total number links in page and gettext and get attribute value
		
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		 List<WebElement> allinks=driver.findElements(By.tagName("a"));
//		 System.out.println("Total links on page"+allinks.size());
//		 for (WebElement e : allinks) {
//			String text=e.getText();
//			if (text.length()!=0) {
//				System.out.println(text);
//			}
//		}
		 System.out.println("---------");
		 
		 //All TextFields count
//		 List<WebElement> alltextfields=driver.findElements(By.className("form-control"));
//		int textcount= alltextfields.size();
//		System.out.println(textcount);
//		for (WebElement a : alltextfields) {
//			a.sendKeys("Hello");
//			
//		}
		 List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		 System.out.println("Total links on page"+alllinks.size());
		 for (int i = 0; i < alllinks.size(); i++) {
			 String acttext=alllinks.get(i).getText();
			 if (acttext.length()!=0) {
				System.out.println(acttext);
			}
			 
			
		}

	}

}
