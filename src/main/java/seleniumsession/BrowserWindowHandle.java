package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		 Set<String> handles = driver.getWindowHandles();
		 Iterator<String> it = handles.iterator();
		 String pwID = it.next();
//		 System.out.println("Parent window handles"+pwID+"----"+driver.getTitle());
//		 
		 String cwID = it.next();
//		 System.out.println("child window handles"+cwID+"----"+driver.getTitle());
//		 driver.close();
		 
		 driver.switchTo().window(cwID);
		 System.out.println("child tab page title    :-"+driver.getTitle());
		 driver.close();
		 driver.switchTo().window(pwID);
		 System.out.println("parent tab page title    :-"+driver.getTitle());
		 driver.quit();
	}
}
