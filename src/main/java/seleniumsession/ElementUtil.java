package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//Creating all util elements in separate class and using in other class

public class ElementUtil {
	
	private WebDriver driver;
	
// 8th approch says create method for by webelement and call in get element method and call dosendkeys method

	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public By getby(String attributetype, String attributevalue) {
		By locator=null;
		switch (attributetype.trim().toLowerCase()) {
		case "id":
			locator=By.id(attributevalue);
			
			break;
		case "name":
			locator=By.name(attributevalue);
			
			break;	

		case "xpath":
			locator=By.xpath(attributevalue);
			
			break;
			
		case "css":
			locator=By.cssSelector(attributevalue);
			
			break;
		default:
			break;
		}
		return locator;
	}
	
	public  WebElement getelement(String attributetype, String attributevalue) {
		return driver.findElement(getby(attributetype, attributevalue));
	
	}
	
	public  WebElement getelement(By locator) {
		return driver.findElement(locator);
	
	}
	public  void dosendkey(String attributetype, String attributevalue, String value) {
		getelement(attributetype, attributevalue).sendKeys(value);
		
	}
	
	public  void dosendkey(By locator, String value) {
		getelement(locator).sendKeys(value);
		
	}
	public void doclick(By locator) {
		 getelement(locator).click();
	}
	public String dogetelementtext(By locator) {
		return getelement(locator).getText();
		
	}

}
