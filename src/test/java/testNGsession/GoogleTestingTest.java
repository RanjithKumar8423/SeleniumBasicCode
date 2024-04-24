package testNGsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTestingTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "Title is not matched");
	}
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("googl"));
	}
	@Test (priority = 3)
	public void imageTest() {
		boolean imagedisplayed = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		Assert.assertTrue(imagedisplayed);
		
	}
	
	
	
}
