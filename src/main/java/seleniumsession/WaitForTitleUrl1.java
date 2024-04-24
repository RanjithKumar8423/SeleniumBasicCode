package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl1 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.orangehrm.com/30-day-free-trial/");
//		 urlprinting(10, "orangehrm2");
		 String title = waitfortitlecontains(5, "Free");
		 System.out.println(title);
		 driver.quit();

	}
	
	public static String waitforURLcontains(int timeout, String expectedURL) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.urlContains(expectedURL))) {
			return driver.getCurrentUrl();
		} }
		catch (Exception e) {
		System.out.println("expected url wrong");
		
		}
		return null;
		
	}
//	public static void urlprinting(int timeout, String expectedURL) {
//		String expectedurl = waitforURLcontains(timeout, expectedURL);
//		System.out.println("expected url is:   "+expectedurl);
//		
//	}
	public static String waitforURLis(int timeout, String expectedURL) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.urlToBe(expectedURL))) {
			return driver.getCurrentUrl();
		} }
		catch (Exception e) {
		System.out.println("expected url wrong");
		
		}
		return null;
		
	}
	public static String waitfortitlecontains(int timeout, String expectedtitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.titleContains(expectedtitle))) {
			return driver.getTitle();
		} }
		catch (Exception e) {
		System.out.println("expected title wrong");
		
		}
		return null;
		
	}

}
