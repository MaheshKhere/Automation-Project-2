package stepDefination;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user on login page")
	public void user_on_login_page() {
		driver.get("https://example.testproject.io/web/");
	}

	@When("^user enters (.+)and (.+)$")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user should on home page")
	public void user_should_on_home_page() throws IOException {
TakesScreenshot ts = (TakesScreenshot)driver;
File source =ts.getScreenshotAs(OutputType.FILE);
File file = new File (System.getProperty("user.dir") + "//reports//image.png");
FileUtils.copyFile(source, file);

	}

	@And("user should logout")
	public void user_should_logout() {
		driver.findElement(By.id("logout")).click();
	}

}
