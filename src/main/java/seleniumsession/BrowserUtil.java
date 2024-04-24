package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	WebDriver driver=null;
	public WebDriver launchbrowser(String browser) {
		
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			
			break;
			
		case "edge":
			driver=new EdgeDriver();
			
			break;

		default:
			System.out.println("pls pass ryt Browser"+browser);
			throw new BrowserException("BrowserNotfound");
			
		}
		return driver;
	}
	
	public void launchurl(String url) {
		if (url==null) {
			throw new BrowserException("Url is null");
		}
		if (url.indexOf("http")==0) {
			driver.get(url);
		}
		else {
			throw new BrowserException("HTTP/s is  missing in URL");
		}
		
	}
	public String getpagetitle() {
		return driver.getTitle();
	}
	public String getpageurl() {
		return driver.getCurrentUrl();
	}
	public void closebrowser() {
		driver.close();
	}
	public void quitbrowser() {
		driver.quit();
		
	}

}
