package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnableSelected {

	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		 driver.get("https://classic.freecrm.com/register/");
		Boolean btnEnabled= driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(btnEnabled);//false
		Boolean btnDisplayed=  driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(btnDisplayed);//true
		Boolean btnselected=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(btnselected);//false
		driver.findElement(By.name("agreeTerms")).click();
		 btnselected=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(btnselected);//true
		btnEnabled= driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(btnEnabled);//true
	}

}
