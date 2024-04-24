package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdsNextLoginScript {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://fx1qa.idsnext.live/#/login");
		 Thread.sleep(10000);
		 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("tsc20007@idsnext.com");
		 driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ids@1001");
		 driver.findElement(By.cssSelector("button[type='button']")).click();
		 Thread.sleep(40000);
		 driver.findElement(By.cssSelector("div[title*='FX Reservation']")).click();
		 Thread.sleep(8000);
		// driver.switchTo().frame(0);
		//driver.findElement(By.cssSelector("div[class='md2-select-menu']>md2-option#md2-option-4")).click();
	        WebElement selectElement = driver.findElement(By.xpath("//md2-select[@placeholder='System Name']"));

	        // Click on the select element to open the dropdown
	        selectElement.click();

	        // Wait for the dropdown options to be visible
//	        WebDriverWait wait = new WebDriverWait(driver, 10);
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("md2-select-menu")));

	        // Find the option element with the text "R2" and click on it
	        WebElement optionElement = driver.findElement(By.xpath("//md2-option[contains(text(), 'R2')]"));
	        optionElement.click();

	        // Find the Save button and click on it
	        WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Save']"));
	        saveButton.click();

	
	
	}

}
