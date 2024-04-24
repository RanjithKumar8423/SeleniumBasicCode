package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdsLogin {

	 //WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://fx1qa.idsnext.live/#/login");
		 driver.wait(3000);
		 driver.findElement(By.name("username1")).sendKeys("teee");

	}

}
