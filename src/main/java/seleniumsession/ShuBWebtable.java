package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShuBWebtable {

	
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']")).click();
//		
//		String name="Joe.Root";
		slectoruser("Joe.Root");
		slectoruser("Jasmine.Morgan");
		System.out.println(getusers("Jasmine.Morgan"));
	}
	public static void slectoruser(String username) {
		String xpath="//a[text()='"+username+"']/ancestor::tr//input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	public static ArrayList<String> getusers(String username1) {
		String xpath="//a[text()='"+username1+"']/parent::td/following-sibling::td";
		
		List<WebElement> userele = driver.findElements(By.xpath(xpath));
		ArrayList<String> userinfolist = new ArrayList<String>();
		for (WebElement e : userele) {
			String text = e.getText();
			//System.out.println(text);
			userinfolist.add(text);
		
		}
		return userinfolist;
	}

}
