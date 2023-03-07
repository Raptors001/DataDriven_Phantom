package testNG.basics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertion {
	
	/*
	 * Hard Assertion: 
	 * 	- Provided by TesNG.org similar to Junit assertion
	 *  - if assertion failed, execution will stop. 
	 * Soft Assertion: 
	 * 	- Class provided by TestNG 
	 * 	- We need to create Object of this class 
	 * 	- We can use Soft Assertion methods 
	 * 	- Soft Assertion methods are same as Hard Assertion
	 *  - If an assertion fails, the execution will not stop and move 
	 *  - to next line of the code, but it will mark the test case failed. 
	 */

	@Test
	public void test() {
		System.out.println("this is before assertion");
		Assert.assertEquals(5,10); // execution will stop as assertion is false
		System.out.println("this is after assertion");
	}
	
	@Test
	public void testTwo() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("this is before first soft assert");
		softAssert.assertEquals(5, 10);
		System.out.println("this is after first soft assert");
		softAssert.assertFalse(true);
		System.out.println("this is after second soft assert");
		softAssert.assertAll(); // assertAll is required to check status of assertion
	}
}







