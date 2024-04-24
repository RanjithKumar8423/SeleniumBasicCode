package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiSelectWithSelect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement element = driver.findElement(By.xpath("//select[@multiple]"));
		Select select =new Select(element);
		boolean multi = select.isMultiple();
		System.out.println(multi);
		select.selectByVisibleText("Andean flamingo");
		select.selectByVisibleText("American flamingo");
		
		
	

	}

}
