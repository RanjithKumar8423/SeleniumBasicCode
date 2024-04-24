package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForIframe1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]")).click();
		 By framexpath = By.xpath("//iframe[contains(@id,'frame-one')]");
		 waitForFrameAndSwitch(10, framexpath);
		 driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-8\"]")).sendKeys("testing123");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("/html/body/nav[2]/div/div/a[2]")).click();

	}
	public static void waitForFrameAndSwitch(int timeout, By frame) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	}

}
