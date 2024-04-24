package testNGsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseTest {
	
	@Test(priority = 1)
	public void titleTest() {
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "Title is not matched");
	}
	@Test(priority = 2)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("trial"));
	}
	@Test (priority = 3)
	public void imageTest() {
		boolean imagedisplayed = driver.findElement(By.xpath("/html/body/nav/div/a/img")).isDisplayed();
		Assert.assertTrue(imagedisplayed);
		
	}
	

}
