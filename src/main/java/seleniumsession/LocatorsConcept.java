package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launching browser with multiple approches



public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver= new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 driver.get("https://www.facebook.com/");
//		1. Basic Steps
//		driver.findElement(By.id("input-email")).sendKeys("ranjith@gamil.com");
//		driver.findElement(By.id("input-password")).sendKeys("ranjit@123");
		
//		2. Segregating sendkeys
//		WebElement username=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		username.sendKeys("ranjitj@gmail.com");
//		password.sendKeys("Ranjith@123");
		
//		3. still cutting expression by method
		
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//		WebElement usr=driver.findElement(username);
//		WebElement pwd=driver.findElement(password);
//		usr.sendKeys("ranjith@gmail.com");
//		pwd.sendKeys("Ranjith@133");
//		
//		4.creating method for elements means inside id method data
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//		WebElement usr=getelement(username);
//		WebElement pwd=getelement(password);
//		usr.sendKeys("ranjith45");
//		pwd.sendKeys("ranjith@333");
//		
//		5. creating method for element along with sendkeys
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//		dosendkey(username, "Ranjith940");
//		dosendkey(password, "Ranj030");
//		
//		6. creating common util class nd using here
//		By username=By.id("input-email");
//		By password=By.id("input-password");
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.dosendkey(password, "Ranjith3448");
//		eleutil.dosendkey(username, "Ranji440");
	
//		8.string -->by-->webelement-->action	
//		String user_id="input-email";
//		String password="input-password";
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.dosendkey("id", user_id, "ranjithkumar");
//		eleutil.dosendkey("id", password, "ranjith123");
		
//		String user_name="email";
//		String pwd_name="password";
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.dosendkey("name", user_name, "ranjithkumar");
//		eleutil.dosendkey("name", pwd_name, "ranjith123");

// xpath string variables
//		String user_xpath="//*[@id=\"input-email\"]";
//		String pwd_xpath="//*[@id=\"input-password\"]";
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.dosendkey("xpath", user_xpath, "ranjithkumar");
//		eleutil.dosendkey("xpath", pwd_xpath, "ranjith123");
//css selectors string variables
//		String user_css="#input-email";
//		String pwd_css="#input-password";
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.dosendkey("css", user_css, "ranjithkumar");
//		eleutil.dosendkey("css", pwd_css, "ranjith123");
		
//LinkText
//		By Registerlink=By.linkText("Register");
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.doclick(Registerlink);
		
//partial linktext
//		By Registerpartiallink=By.partialLinkText("Reg");
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.doclick(Registerpartiallink);
//
//Tag name
		
//		By Pageheader=By.tagName("h2");
//		ElementUtil eleutil=new ElementUtil(driver);
//		String header=eleutil.dogetelementtext(Pageheader);
//		System.out.println(header);
		
//    ids
		String user_xpath="//*[@id=\"email\"]";
		String pwd_xpath="//*[@id=\"pass\"]";
		By btn=By.xpath("//*[@id=\"u_0_5_8o\"]");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.dosendkey("xpath", user_xpath, "ranjithkumar");
		eleutil.dosendkey("xpath", pwd_xpath, "ranjith123");
		eleutil.doclick(btn);
	
	}
	
//	public static WebElement getelement(By locator) {
//		return driver.findElement(locator);
//	
//	}
//	public static void dosendkey(By locator, String value) {
//		getelement(locator).sendKeys(value);
//		
//	}

}
