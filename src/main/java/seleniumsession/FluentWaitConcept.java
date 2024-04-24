package seleniumsession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 By clickele = By.xpath("//*[@id=\"imageTemplateContainer4\"]");
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class)
				 .withMessage("Element Not Available");
		 wait.until(ExpectedConditions.visibilityOfElementLocated(clickele)).click();
		 
	}

}
