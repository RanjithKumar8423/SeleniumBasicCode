package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGconcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.name("q")).sendKeys("iphone14");
		 driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();
		 Thread.sleep(5000);
		 //driver.quit();
	}

}
