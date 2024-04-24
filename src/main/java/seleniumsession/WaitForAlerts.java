package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.alertIsPresent()).accept();
		 System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
	}

}
