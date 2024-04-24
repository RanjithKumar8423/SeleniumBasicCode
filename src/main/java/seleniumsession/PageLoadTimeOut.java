package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
		 Duration time = driver.manage().timeouts().getPageLoadTimeout();
		 System.out.println(time);
		 driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		 
	
	}
	

}
