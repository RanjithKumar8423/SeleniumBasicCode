package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTableTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://classic.crmpro.com/");
		 driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("apiautomation");
		 driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("selenium@12345");
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		 Thread.sleep(4000);
		 driver.switchTo().frame("mainpanel");
		 driver.findElement(By.xpath("//a[@title='Contacts' and text()='Contacts']")).click();
		 selectcontact("KL Rahul");
		 selectcontact("Jyothi AB");
		 System.out.println(getcomapny("KL Rahul"));
		 System.out.println(getphonenumber("KL Rahul"));
		 System.out.println(getphonenumberhome("neha sharma"));

	}
	public static void selectcontact(String contactname) {
		driver.findElement(By.xpath("//a[text()='"+contactname+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	public static String getcomapny(String companycontactname) {
		return driver.findElement(By.xpath("//a[text()='"+companycontactname+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	public static String getphonenumber(String phonecontactname) {
		return driver.findElement(By.xpath("//a[text()='"+phonecontactname+"']/parent::td/following-sibling::td/span[@context='phone']")).getText();
	}
	public static String getphonenumberhome(String phonehomecontactname) {
		return driver.findElement(By.xpath("(//a[text()='"+phonehomecontactname+"']/parent::td/following-sibling::td/span[@context='phone'])[2]")).getText();
	}
	

}
