package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 Thread.sleep(3000);
		 WebElement ele = driver.findElement(By.id("input-password"));
		 String text = driver.findElement(RelativeLocator.with(By.tagName("label")).above(ele)).getText();
		 System.out.println(text);
		 WebElement header = driver.findElement(By.xpath("//h2[text()='New Customer']"));
		 WebElement btnn = driver.findElement(By.linkText("Continue"));
//		 String content = driver.findElement(RelativeLocator.with(By.xpath("(//p)[3]")).near(header)).getText();
//		 System.out.println(content);
		 List<WebElement> conts = driver.findElements(RelativeLocator.with(By.tagName("p")).below(header).above(btnn));
		
		 for (WebElement e : conts) {
			 String texting = e.getText();
			 if (texting.contains("By creating an accoun")) {
				System.out.println(e.getText());
				
			}
			 else {
				System.out.println("testing");
			}
			 
			
		}
		 
		 
		 
		 Thread.sleep(3000);
		 driver.quit();
	}

}
