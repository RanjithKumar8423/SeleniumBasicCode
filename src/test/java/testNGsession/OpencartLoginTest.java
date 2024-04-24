package testNGsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartLoginTest extends BaseTest {
	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login", "Title is not matched");
	}
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("opencart"));
	}
	@Test (priority = 3)
	public void imageTest() {
		boolean imagedisplayed = driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).isDisplayed();
		Assert.assertTrue(imagedisplayed);
		
	}
	
}
