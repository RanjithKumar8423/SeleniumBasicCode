package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 String parentwhandleid = driver.getWindowHandle();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		 driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		 driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		 driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		 
		 Set<String> handles = driver.getWindowHandles();
		 Iterator<String> it = handles.iterator();
		 while (it.hasNext()) {
			 String windowID = it.next();
			 driver.switchTo().window(windowID);
			 System.out.println("windows Title  "+ driver.getTitle());
			if (!windowID.equals(parentwhandleid)) {
				driver.close();
			}
			Thread.sleep(1000);
		}
		 driver.switchTo().window(parentwhandleid);
		 System.out.println("switch locator  "+driver.getTitle());
	}

}
