package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//launch browser and print title and check title valid and print current url and check url valid and close


public class WebDriverBasic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("correct title...pass");
		}
		else {
			System.out.println("invalid title...failed");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("google.com")) {
			System.out.println("correct url...pass");
		}
		else {
			System.out.println("invalid url...failed");
		}
		driver.close();
		

	}

}
