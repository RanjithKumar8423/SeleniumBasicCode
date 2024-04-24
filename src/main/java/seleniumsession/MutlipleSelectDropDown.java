package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleSelectDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
//		 driver.findElement(By.id("justAnInputBox")).click();
//		 Thread.sleep(3000);
//		List<WebElement> listofselection= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(listofselection.size());
//		for (WebElement e : listofselection) {
//			String text=e.getText();
//			System.out.println(text);
//			if (text.contains("choice 2 1")) {
//				e.click();
//			}
//			
//		}
		By ClickOnDropDwon= By.id("justAnInputBox");
		By Selectionchoice= By.xpath("//span[@class='comboTreeItemTitle']");
		//String[] paasingvalue={"choice 2 1", "choice 2 2", "choice 2 3", "choice 6 2 1","choice 7"};
		
//        TC-02 for multiple select
		//		DODropdownselect(ClickOnDropDwon, Selectionchoice, paasingvalue);
		//Tc-03 for All selection
		DODropdownselect(ClickOnDropDwon, Selectionchoice, "All");

	}
	
	 public static WebElement getelement(By Locator) {
			return driver.findElement(Locator);
	    	 
	     }
	 public static List<WebElement> getelements(By Locator) {
			return driver.findElements(Locator);
	    	 
	     }
	 
	 
//	public static void DODropdownselect(By ClickLocator, By SelectLocator, String[]  selectchoice) throws InterruptedException {
//		getelement(ClickLocator).click();
//		Thread.sleep(3000);
//		System.out.println(getelements(SelectLocator).size());
//		for (WebElement e : getelements(SelectLocator)) {
//			String text=e.getText();
//			System.out.println(text);
//			for (String val : selectchoice) {
//				if (text.contains(val)) {
//					e.click();
//					break;
//					
//				}
//			}
//			
//			
//		}
//	}
	 
		public static void DODropdownselect(By ClickLocator, By SelectLocator, String...  selectchoice) throws InterruptedException {
		getelement(ClickLocator).click();
		Thread.sleep(3000);
		System.out.println(getelements(SelectLocator).size());
		if (!selectchoice[0].equals("All")) {
			for (WebElement e : getelements(SelectLocator)) {
				String text=e.getText();
				System.out.println(text);
				for (String val : selectchoice) {
					if (text.contains(val)) {
						e.click();
						break;
						
					}
				}
				
				
			}
			
		}
		else {
			for (WebElement e : getelements(SelectLocator)) {
				try {
					e.click();
					
				} catch (Exception e2) {
					break;
				}
				
				
			}
		}
	}
	 

}
