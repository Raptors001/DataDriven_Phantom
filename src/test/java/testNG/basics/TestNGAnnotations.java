package testNG.basics;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	// we need to install TestNG plugin for Eclipse
	
	/*
	 * @Test is a test case. any method that has @Test on top of it considers as a test case
	 * @BeforeMethod: this annotation will run a block of code before each Test case
	 * @AfterMethod: this annotation will run a block of code after each Test case
	 * @BeforeTest: this annotation will run a block of code before First Test case
	 * @AfterTest: this annotation will run a block of code after last Test case
	 * @BeforeClass: This annotation will run a block of code before a test class
	 * @AfterClass: This annotation will run a block of code after a test class
	 * @BeforeSuite: This annotation will run a block of code before a test suite
	 * @AfterSuite: This annotation will run a block of code after a test suite
	 * @BeforeGroups: This annotation will run a block of code before a specific groups of TC 
	 * @AfterGroups: This annotation will run a block of code after a specific groups of TC. 
	 */
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before each test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after each test case");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before frist Test case");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after last Test case");
	}
	
	@Test (priority =2)
	@Ignore
	public void testTwo() {
		System.out.println("this is test two ");
	}
	
	@Test (priority =3, enabled = false)
	public void testThree() {
		System.out.println("this is test Three ");
	}
	
	@Test(priority = 1, groups= {"smokeTest"})
	public void testOne() {
		System.out.println("this is test one ");
	}
	
	@Test (priority =4)
	public void testFour() {
		System.out.println("this is test Four ");
	}
	
	@Test (groups = {"smokeTest"})
	public void testFive() {
		Assert.assertTrue(true);
		System.out.println("this is test Five ");
	}
	
	@Test (dependsOnMethods = "testFive")
	public void testSix() {
		System.out.println("this is test six ");
	}
	
	

}
