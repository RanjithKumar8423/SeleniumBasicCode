package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept26 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.orangehrm.com/30-day-free-trial/");
		// WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
		 By full_name = By.id("Form_getForm_Name");
		 int time=20;
	//	 wt.until(ExpectedConditions.presenceOfElementLocated(full_name)).sendKeys("testing");
		// wt.until(ExpectedConditions.visibilityOfElementLocated(full_name)).sendKeys("59595");
		 Elementpresencewait(full_name, time).sendKeys("testing");
		Thread.sleep(5000);
		 driver.quit();

	}
	public static WebElement Elementpresencewait(By locator, int timeout) {
		 WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wt.until(ExpectedConditions.visibilityOfElementLocated(locator));

		
	}

}
