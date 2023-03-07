package testNG.basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametersConcept5 {
	
	/**
	 * In TestNG we can parameterize TC in two ways:
	 * - @parameters 
	 * We can pass values from TestNG.xml file for our test cases
	 * - @DataProvider
	 */
	@Parameters({"emailValue","passwordValue"})
	@Test
	public void test(String email, String password) {
		System.out.println(email + " this is from parameters");
		System.out.println(password + " this is form parameters");
	}
	

}
