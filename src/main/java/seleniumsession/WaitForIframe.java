package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForIframe {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]")).click();
		 By framexpath = By.xpath("//iframe[contains(@id,'frame-one')]");
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framexpath));
		 driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-8\"]")).sendKeys("testing123");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("/html/body/nav[2]/div/div/a[2]")).click();
		 //driver.quit();
	}

}
