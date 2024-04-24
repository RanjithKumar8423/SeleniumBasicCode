package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTesting {

	public static void main(String[] args) {
		BrowserUtil brutil=new BrowserUtil();
		WebDriver driver=brutil.launchbrowser("chrome");
		brutil.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=brutil.getpagetitle();
		System.out.println(title);
		By username=By.id("input-email");
		By password=By.id("input-password");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.dosendkey(username, "Ranjith123");
		eleutil.dosendkey(password, "ranji999");
		
		
		
		

	}

}
