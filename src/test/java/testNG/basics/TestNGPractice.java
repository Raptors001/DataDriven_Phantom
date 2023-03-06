package testNG.basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@BeforeMethod
	public void beforeMethod() {
		
	}

	@AfterMethod
	public void afterMethod() {
		
	}
	@Test(priority = 1)
	public void testOne() {
		
	}
	@Test(priority = 2, groups= {"Regression"})
	public void testTwo() {
		
	}
	@Test(priority = 3)
	public void testThree() {
		
	}
	@Test(priority = 4, groups= {"Regression"})
	public void testFour() {
		
	}
	@Test(priority = 5)
	@Ignore
	public void testFive() {
		
	}
	@Test(priority = 6, groups= {"Regression"})
	public void testSix() {
		
	}
	@Test(priority = 7)
	public void testSeven() {
		
	}
	@Test(priority = 8, enabled = true, groups= {"Regression"})
	public void testEight() {
		
	}
	@Test(priority = 9)
	public void testNine() {
		
	}
	@Test(priority = 10)
	public void testTen() {
		
	}

	
}
