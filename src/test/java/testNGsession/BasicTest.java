package testNGsession;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTest {
	
	@Test
	public void Test() {
		System.out.println("Test1");
	}
	@Test
	public void Test1() {
		System.out.println("Test2");
	}
	@BeforeMethod
	public void Testing() {
		System.out.println("BEfore method");
	}
	@AfterMethod
	public void Testing1() {
		System.out.println("After method");
	}
}
