package testNGsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpencartTest {
	
	// Before Annotation
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS--Db connection");
	}
	@BeforeTest
	public void createuser() {
		System.out.println("BT--create user");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC--launchBrowser");
	}
	@BeforeMethod
	public void login() {
		System.out.println("BM--login");
	}
	@Test
	public void header() {
		System.out.println("Test-- header");
	}
	@Test
	public void title() {
		System.out.println("Test-- title");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM--Logout");
	}
	@AfterClass
	public void closeBrowsert() {
		System.out.println("AC--closeBrowser");
	}
	@AfterTest
	public void deleteuser() {
		System.out.println("AT--deleteUser");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS--DisconnectDB");
	}

}
