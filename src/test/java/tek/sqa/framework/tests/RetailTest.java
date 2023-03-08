package tek.sqa.framework.tests;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import tek.sqa.framework.base.BaseUITest;
import tek.sqa.framework.config.POMFactory;

public class RetailTest extends BaseUITest {

	@Parameters({ "emailValue", "passwordValue" })
	@Test
	public void endToEndTest(String email, String pass) throws InterruptedException {
		POMFactory factory = POMFactory.getPOMFactory();
		factory.retailPage().clickonSignInOption();
		factory.retailPage().loginToApplication(email, pass);
		click(factory.retailPage().accountOption);
		waitTillPresence(factory.retailPage().cardAmex);
		click(factory.retailPage().cardAmex);
		click(factory.retailPage().cardEditButton);
		waitTillPresence(factory.retailPage().cardNumber);
		String actualCardNumber = factory.retailPage().cardNumber.getAttribute("Value");
		List<Map<String, Object>> db = getDbUtility().convertResultToMap(
				"select * from payments where cardNumber =" + actualCardNumber + " and isDeleted = 0;");
		Assert.assertEquals(actualCardNumber, db.get(0).get("cardNumber"), "");

	}
	
	

}
