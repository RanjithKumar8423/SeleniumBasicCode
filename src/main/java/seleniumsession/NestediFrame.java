package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrame {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selectorshub.com/iframe-scenario/");
		 driver.switchTo().frame("pact1");
		 driver.findElement(By.id("inp_val")).sendKeys("testing");
		 driver.switchTo().frame("pact2");
		 driver.findElement(By.id("jex")).sendKeys("automation");
		 driver.switchTo().frame("pact3");
		 driver.findElement(By.id("glaf")).sendKeys("12345");
		 
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("jex")).sendKeys("9876");
		 
		 driver.switchTo().defaultContent();
		 String text = driver.findElement(By.xpath("(//a[contains(@href,'selectorshub')]/slogan)[1]")).getText();
		 System.out.println(text);
		 
		 Thread.sleep(5000);
		 driver.quit();

	}

}
