package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveToElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		 Thread.sleep(3000);
//		 WebElement contlink = driver.findElement(By.xpath("//a[@class='menulink']"));
//		 Actions act=new Actions(driver);
//		 act.moveToElement(contlink).perform();
//		 driver.findElement(By.xpath("(//a[text()='Articles'])[1]")).click();
		 By parent=By.xpath("//a[@class='menulink']");
		 By menu=By.linkText("COURSES");
		 handlemenusublevel2(parent, menu);
			
	}
	
	
	
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	public static void handlemenusublevel2(By parentLocator, By menuLocator) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(getelement(parentLocator)).perform();
		Thread.sleep(5000);
		getelement(menuLocator).click();
	}

}
