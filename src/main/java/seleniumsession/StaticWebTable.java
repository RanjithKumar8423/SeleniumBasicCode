package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//table[@class='ws-table-all']//tr//td[2]
		 countrydetails();
	
	}
	public static void companydetails() {
		int rowcount = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size();
		 System.out.println("ROW count  "+(rowcount-1));
		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		 String afterXpath="]/td[1]";
		 for(int row=2; row<=rowcount; row++) {
			 String compXpath=beforeXpath+row+afterXpath;
			 String text = driver.findElement(By.xpath(compXpath)).getText();
			 System.out.println(text);
		 }
	}
	public static void contactdetails() {
		int rowcount = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size();
		 System.out.println("ROW count  "+(rowcount-1));
		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		 String afterXpath="]/td[2]";
		 for(int row=2; row<=rowcount; row++) {
			 String compXpath=beforeXpath+row+afterXpath;
			 String text = driver.findElement(By.xpath(compXpath)).getText();
			 System.out.println(text);
		 }
	}
	public static void countrydetails() {
		int colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		 
		 for(int col=3; col<=colcount; col++) {
			 List<WebElement> coldata = driver.findElements(By.xpath("//table[@id='customers']//tr/td["+col+"]"));
			for (WebElement e : coldata) {
				String text = e.getText();
				System.out.println(text);
				
			}
		 }
	}

}
