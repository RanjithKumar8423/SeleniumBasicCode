package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/england-in-india-2023-24-1389386/india-vs-england-5th-test-1389403/full-scorecard");
		System.out.println("1st innings");
		System.out.println(getscorecard("Ben Duckett"));
		System.out.println(getscorecard("Ollie Pope"));
		System.out.println(getscorecard("Zak Crawley"));
		System.out.println("2nd innings");
//		System.out.println(getscorecard2("Ben Duckett"));
//		System.out.println(getscorecard2("Ollie Pope"));
//		System.out.println(getscorecard2("Zak Crawley"));
		System.out.println(getscorecard2("Ben Foakes"));
		
		
//		String wktername = driver.findElement(By.xpath("(//span[text()='Zak Crawley']/ancestor::td/following-sibling::td/span)[1]")).getText();
//		System.out.println(wktername);
	}
	public static ArrayList<String> getscorecard(String btsman) {
		List<WebElement> btsmandetails = driver.findElements(By.xpath("(//span[text()='"+btsman+"'])[1]/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		ArrayList<String> dlist = new ArrayList<String>();
		for (WebElement e : btsmandetails) {
			String text = e.getText();
			dlist.add(text);
		}
		return dlist;
	}
	public static ArrayList<String> getscorecard2(String btsman2) {
		List<WebElement> btsmandetails = driver.findElements(By.xpath("(//span[text()='"+btsman2+"'])[3]/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		ArrayList<String> dlist = new ArrayList<String>();
		for (WebElement e : btsmandetails) {
			String text = e.getText();
			dlist.add(text);
		}
		return dlist;
	}

}
