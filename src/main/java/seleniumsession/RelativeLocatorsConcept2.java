package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsConcept2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.aqi.in/dashboard/canada");
		 Thread.sleep(5000);
		// WebElement ele = driver.findElement(By.linkText("Banff, Canada"));
		 WebElement cityele = driver.findElement(By.linkText("Banff, Canada"));
		 String abovetext = driver.findElement(RelativeLocator.with(By.tagName("p")).above(cityele)).getText();
		 System.out.println(abovetext);
		 String belowtext = driver.findElement(RelativeLocator.with(By.tagName("p")).below(cityele)).getText();
		 System.out.println(belowtext);
		 String neartext = driver.findElement(RelativeLocator.with(By.tagName("p")).near(cityele)).getText();
		 System.out.println(neartext);
		 String righttext = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(cityele)).getText();
		 System.out.println(righttext);
		 
		 
		 Thread.sleep(3000);
		 driver.quit();
	}

}
