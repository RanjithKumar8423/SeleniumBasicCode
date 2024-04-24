package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 String Pwid = driver.getWindowHandle();
		
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://Google.com");
		 System.out.println("New window title  "+driver.getTitle());
		 driver.switchTo().newWindow(WindowType.TAB);
//		 String Cwid = driver.getWindowHandle();
		 driver.get("https://FaceBook.com");
		 
		 System.out.println("New window title  "+driver.getTitle());
		 
		 Thread.sleep(3000);
		 driver.close();
//		 driver.switchTo().window(Cwid);
		 driver.close();
		 driver.switchTo().window(Pwid);
		 System.out.println("parent window title   "+driver.getTitle());
	}

}
