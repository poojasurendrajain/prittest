package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		System.out.println("User is on Home Page");
	}

	@When("User Enters username and password")
	public void user_Enters_username_and_password() {
		System.out.println("User Enters username and password");

		LoginOR obj = new LoginOR(driver);
		obj.uname.sendKeys("tomsmith");

		// driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		System.out.println("User clicks on Login button");
		driver.findElement(By.className("radius")).click();
	}

	@Then("Display message logged in successfully")
	public void display_message_logged_in_successfully() {
		System.out.println("Display message logged in successfully");
	}

}
