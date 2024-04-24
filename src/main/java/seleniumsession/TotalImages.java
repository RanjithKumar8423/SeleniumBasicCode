package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

// i want print image count on screen and then src and alt
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
//		 List<WebElement> Totalimg=driver.findElements(By.tagName("img"));
//		int count= Totalimg.size();
//		System.out.println(count);
//		for (WebElement e : Totalimg) {
//			String Alt_value=e.getAttribute("alt");
//			
//			if (Alt_value.length()!=0) {
//				System.out.println("Alt value of All Images: "+Alt_value);
//			}
//			
//		}
		 
		 By Totalimg=By.tagName("img");
		 a_getimagesAlt(Totalimg, "alt");
	}
	public static List<WebElement> getelement(By Locator) {
		return driver.findElements(Locator);
	}
	 public static int s_getimagesAlt(By Locator) {
		return getelement(Locator).size();
	 }
	 public static void a_getimagesAlt(By Locator, String altvalue) {
		 List<WebElement> imglist=getelement(Locator);
		// ArrayList<String> actimglist=new ArrayList<String>();
		 for ( WebElement e : imglist) {
			String ss= e.getAttribute(altvalue);
			System.out.println(ss);
		
			
		}
	
		 }
	 

}
