package tek.sqa.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sqa.framework.utilities.CommonUtility;

public class RetailPage extends CommonUtility {

	public RetailPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// 20 min to store UI Elements of Retail page
	@FindBy(id = "signinLink")
	public WebElement signInOption;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(id = "loginBtn")
	public WebElement loginButton;

	@FindBy(id = "accountLink")
	public WebElement accountOption;

	@FindBy(xpath = "//p[text()='American Express' and @class='account__payment-sub-title']")
	public WebElement cardAmex;

	@FindBy(xpath = "(//button[text()='Edit'])[1]")
	public WebElement cardEditButton;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumber;
	
	
	public void clickonSignInOption() {
		click(signInOption);
	}
	
	public void loginToApplication(String emailValue, String passwordValue) {
		sendText(emailField, emailValue);
		sendText(passwordField, passwordValue);
		click(loginButton);
	}
	
	
	

}
