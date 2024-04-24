package testNGsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority = 2, invocationCount = 3)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority = 1)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test (priority = 3)
	public void imageTest() {
		boolean imagedisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		if (!imagedisplayed) {
			System.out.println("Failed test--image not displaying");
		}
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
