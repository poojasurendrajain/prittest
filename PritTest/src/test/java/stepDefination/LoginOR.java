package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOR {
	WebDriver driver;
	public LoginOR(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name="username") WebElement uname;


}
