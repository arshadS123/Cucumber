package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Declare The Element As Private
	// Generate getter
	// Inside The constructor -Initialize the elements

	// Webelement Refname = driver.Findelement(By.Locators("Value"));
	// @-->
	// FindBy , FindBys

	public static WebDriver driver; // null driver

	@FindBy(id = "username")
	private WebElement user; // null webelement

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement Login_Btn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin_Btn() {
		return Login_Btn;
	}

	public LoginPage(WebDriver dri) {

		driver = dri;
		PageFactory.initElements(driver, this);

	}
}
