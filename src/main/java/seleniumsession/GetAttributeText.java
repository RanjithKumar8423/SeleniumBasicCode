package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeText {

	static WebDriver driver;
	public static void main(String[] args) {
// printng get attribute value
		
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		String plchldr= driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		System.out.println(plchldr);
		 By id_Email=By.id("input-email");
		 By id_Password=By.id("input-password");
		 By RegisterLink=By.linkText("Register");
//			String emailtype= dogetattribute(id_Email, "type");
//			System.out.println(emailtype);
//			String emailplaceholder= dogetattribute(id_Email, "placeholder");
//			System.out.println(emailplaceholder);
//			String Passwordplaceholder= dogetattribute(id_Password, "placeholder");
//			System.out.println(Passwordplaceholder);
			String RegisterLinktype= dogetattribute(RegisterLink, "href");
			System.out.println(RegisterLinktype);
	}
	public static WebElement getelement(By Locator) {
		return driver.findElement(Locator);
	}
	public static String dogetattribute(By Locator, String Attributevalue) {
		return getelement(Locator).getAttribute(Attributevalue);
	}


}
