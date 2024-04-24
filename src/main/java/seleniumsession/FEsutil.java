package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsutil {
// i want to print get text of all links
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 By links = By.tagName("a");
		 By images=By.tagName("img");
//		 ArrayList<String> eletext= getelementtextlist(links);
//		 System.out.println(eletext);
		 ArrayList<String> attributetext= getattributetextlist(images, "src");
		 System.out.println(attributetext);
//		 if (eletext.contains("Help")) {
//			 System.out.println("passed");
			
//		}
		 
		 
		 
	}
	public static List<WebElement> getelement(By Locator) {
		return driver.findElements(Locator);
	}
	public static int getelementcoutn(By Locator) {
		return getelement(Locator).size();
	}
	public static ArrayList<String> getelementtextlist(By Locator) {
		List<WebElement> elelist=getelement(Locator);
		ArrayList<String> elelisttext=new ArrayList<String>();
		for (WebElement e : elelist) {
			String text=e.getText();
			if (text.length()!=0) {
				elelisttext.add(text);
				
			}
			
		}
		return elelisttext;
		
	}
	public static ArrayList<String> getattributetextlist(By Locator, String Altvalue) {
		List<WebElement> elelist=getelement(Locator);
		ArrayList<String> attributelisttext=new ArrayList<String>();
		for (WebElement e : elelist) {
		String Attributevalue=	e.getAttribute(Altvalue);
		if (Attributevalue.length()!=0) {
			attributelisttext.add(Attributevalue);
			
		}
			
		}
		return attributelisttext;
	
		
	}

}
