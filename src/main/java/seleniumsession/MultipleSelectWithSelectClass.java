package seleniumsession;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectWithSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		 driver.get("https://html.com/attributes/select-multiple/");
//		By locatorfield=By.xpath("//select[@multiple]");
//		//String[] data={"American flamingo", "Greater flamingo","Andean flamingo"};
//		List<String> data=Arrays.asList("American flamingo", "Greater flamingo","Andean flamingo");
//		multipleselect(locatorfield, data);
//		
//	}
//	 public static WebElement getelement(By Locator) {
//			return driver.findElement(Locator);
//	    	 
//	     }
//	 public static void multipleselect(By Locator, List<String> textvalue) {
//		 Select select=new Select( getelement(Locator));
//		for (String e : textvalue) {
//		 select.selectByVisibleText(e);
//		}
//	    //select.deselectAll();
//	     
		 
	 }
	
	

}
