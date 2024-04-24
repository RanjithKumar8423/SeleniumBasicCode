package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMappHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://petdiseasealerts.org/forecast-map");
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
	String mapXpath="//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='features']";
	     List<WebElement> list = driver.findElements(By.xpath(mapXpath));
	     Actions action=new Actions(driver);
	     for (WebElement e : list) {
	    	 action.moveToElement(e).perform();
	    	 String attribute = e.getAttribute("id");
	    	 System.out.println(attribute);
	    	 Thread.sleep(500);
	    	 
	    	 
			
		}

	}

}
