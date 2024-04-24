package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		// driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		 driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		 Set<String> Handles = driver.getWindowHandles();
		 System.out.println(Handles);
		 Iterator<String> it = Handles.iterator();
		 it.next();
		 System.out.println(driver.getTitle());
		 String CWid = it.next();
		 driver.switchTo().window(CWid);
		 System.out.println(driver.getTitle());
		
		 Thread.sleep(5000);
		 driver.quit();
		 
	}

}
