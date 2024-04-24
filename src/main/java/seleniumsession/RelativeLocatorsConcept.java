package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.aqi.in/dashboard/canada");
		 Thread.sleep(5000);
		 WebElement cityele = driver.findElement(By.linkText("Guelph, Canada"));
		 String Rank = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(cityele)).getText();
		 System.out.println(Rank);
		 String AQI = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(cityele)).getText();
		 System.out.println(AQI);
		 String belowcityname = driver.findElement(RelativeLocator.with(By.xpath("(//a[contains(@href,'mount-pearl')])[1]")).below(cityele)).getText();
		 System.out.println(belowcityname);
		 String abovecityname = driver.findElement(RelativeLocator.with(By.tagName("a")).above(cityele)).getText();
         System.out.println(abovecityname);
		 String nearele = driver.findElement(RelativeLocator.with(By.tagName("p")).near(cityele)).getText();
		 System.out.println(nearele);
		 driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
