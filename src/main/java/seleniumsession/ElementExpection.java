package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExpection {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// driver.findElement(By.name("search1")).sendKeys("Ranjith");//NSE
//		 List<WebElement> list=driver.findElements(By.tagName("ranj"));
//		 System.out.println(list.size());
//		 System.out.println(list);
//		boolean flag= driver.findElement(By.className("img-responsive")).isDisplayed();
//		System.out.println(flag); //if classname is wrong then it will go further steps
//		if (flag) {
//			System.out.println("logo is displayed--passed");
//		}
//		else {
//			System.out.println("Sorry unable to find logo.....THank you");
//		}
//		List<WebElement> logo= driver.findElements(By.className("img-responsive1"));
//		if (logo.size()==1) {
//			System.out.println("Logo is displayed");
//		}
//		else {
//			System.out.println("Logo not Displayed");
//		}
		//By logo= By.className("img-responsive");
//		Boolean LogoDis=iselementdisplayed(logo);
//		if (LogoDis) {
//			System.out.println("Logo is showing");
//		}
//		else {
//			System.out.println("Logo not showing");
//		}
//		
//		 
//	
//
//	}
//	 public static WebElement getelement(By Locator) {
//			return driver.findElement(Locator);
//	    	 
//	     }
//	
//	 public static boolean iselementdisplayed(By Locator) {
//		 return getelement(Locator).isDisplayed();
//	 
		 By logo= By.className("img-responsive9");
		if ( iselementexits(logo)) {
			System.out.println("Logo is there");
		}
		else {
			System.out.println("Logo is not there");
		}
		 
	 }
	 public static List<WebElement> getelements(By Locator) {
			return driver.findElements(Locator);
	    	 
	     }
	 public static boolean iselementexits(By Locator) {
		int count= getelements(Locator).size();
		if (count==1) {
			//System.out.println("Passed--logo exits");
			return true;
		}
		return false;
	 }

}
