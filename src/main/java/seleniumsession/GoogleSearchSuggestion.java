package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestion {

//Google Search selection 
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
//		 driver.findElement(By.name("q")).sendKeys("ranjithkumarmeaning");
//		 Thread.sleep(3000);
//		 List<WebElement> suggestion=driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//         System.out.println(suggestion.size());
//         for (WebElement e : suggestion) {
//        	 String text=e.getText();
//        	 System.out.println(text);
//        	boolean suglink= text.contains(" in english");
//        	if (suglink) {
//        		e.click();
//        		break;
//			}
//        	else {
//				System.out.println("oops sorry");
//			}
///	}
		 
		By searchField= By.name("q");
		By selectionxpath= By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		String value="in english";
		dosearch(searchField, selectionxpath, "ranjithkumarmeaning", value);
        
	}
	
	 public static WebElement getelement(By Locator) {
		return driver.findElement(Locator);
    	 
     }
	 public static List<WebElement> getelements(By Locator) {
			return driver.findElements(Locator);
	    	 
	     }
	 public static void dosearch(By searchlocator, By Searchsuggestion, String passingData, String SuggestionData) throws InterruptedException {
		 
		WebElement actsize= getelement(searchlocator);
		actsize.sendKeys(passingData);
		Thread.sleep(3000);
		List<WebElement> allsug=getelements(Searchsuggestion);
		System.out.println(allsug.size());
		for (WebElement e : allsug) {
			String text=e.getText();
			if (text.contains(SuggestionData)) {
				e.click();
				System.out.println(text);
				break;
			}
			
		}

     }

}
