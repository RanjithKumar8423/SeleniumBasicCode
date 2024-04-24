package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.orangehrm.com/30-day-free-trial/");
		 By fullname = By.id("Form_getForm_Name");
		 By business = By.id("Form_getForm_Email");
		 By phNo = By.id("Form_getForm_Contact");
		 Explicitywaitmethod(fullname, 10, "ranjith").sendKeys("ranjith");
		 Explicitywaitmethod(business, 10, "kumar").sendKeys("ranjith");;
		 Explicitywaitmethod(phNo, 10, "1200203").sendKeys("ranjith");;
		 Thread.sleep(5000);
		 driver.quit();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


		 
	}
	public static WebElement Explicitywaitmethod(By Locator, int timeout, String paasing) {
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 return wt.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}

}
