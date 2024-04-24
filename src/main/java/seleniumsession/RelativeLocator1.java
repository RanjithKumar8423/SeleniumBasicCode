package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		 WebElement eletext = driver.findElement(By.id("input-email"));
//		// String labletext = driver.findElement((RelativeLocator.with(By.xpath("//label[@for='input-email']"))).above(eletext)).getText();
//		 String labletext = driver.findElement((RelativeLocator.with(By.tagName("label"))).above(eletext)).getText();
//		 System.out.println(labletext);
//		 
		 WebElement newcontact = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		 WebElement button = driver.findElement(By.linkText("Continue"));
		 List<WebElement> content = driver.findElements(RelativeLocator.with(By.tagName("p")).below(newcontact).above(button));
		 for (WebElement e : content) {
			 System.out.println(e.getText());
			 
		}
		 driver.quit();
	
}

}
