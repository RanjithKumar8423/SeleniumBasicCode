package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageloading {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 boolean flag = ispageloaded(10);
		 if (!flag) {
			 System.out.println("browser not opened");
			throw new BrowserException("element not found");
		}
	}
	public static boolean ispageloaded(int timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("Return document.readyState==='complete'")).toString();
		return Boolean.parseBoolean(flag);
	}

}
