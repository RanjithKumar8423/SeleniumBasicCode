package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 String pwid = driver.getWindowHandle();
		 Thread.sleep(3000);
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.get("https://www.google.com");
		 System.out.println(driver.getTitle());
		 driver.close();
		 driver.switchTo().window(pwid);
		 System.out.println(driver.getTitle());
		 Thread.sleep(5000);
		 driver.quit();
		 
		 

	}

}
