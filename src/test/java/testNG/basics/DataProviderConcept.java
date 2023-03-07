package testNG.basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	/*
	 * Dataprovider is powerfull annotation of TestNG this is similar concept as
	 * Scenario Outline of Cucumber each row of DataProvider will be used as
	 * execution data for example if we have 5 rows the test case will be executed 5
	 * times
	 * 
	 */
	@Test(dataProvider = "data")
	public void test(String name, String email, String password) {
		System.out.println(name + " name ");
		System.out.println(email + " email");
		System.out.println(password + " password");
	}

	@DataProvider(name = "data")
	public Object[][] data() {
		return new Object[][] { { "shaiq", "shaiq@tekschool.us", "Test@112233" } ,
								{ "shams", "shams@tekschool.us", "Test@1122" } ,	
								{ "Khalil", "khalil@tekschool.us", "Test@1123" } ,
								{ "Frezer", "frezer@tekschool.us", "Test@1133" } ,};
	}

}
