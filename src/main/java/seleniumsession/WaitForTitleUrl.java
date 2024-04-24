package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.orangehrm.com/30-day-free-trial/");
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		  try {
		 if (wait.until(ExpectedConditions.urlContains("orangehrm"))) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("hey expected url has correct:   "+currentUrl);
			driver.quit();
		}
		  }
		  catch (Exception e) {
			System.out.println("expection handled, expected url wrong, pls check");		}
			  
		  
		

	}

}
