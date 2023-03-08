package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class googlestepdefinition {
	WebDriver driver;

	@Given("Open browser")
	public void Open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@When("Enter test in search box")
	public void Enter_test_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("testng");
	}

	@And("click on Enter")
	public void click_on_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("You navigate to expected result")
	public void You_navigate_to_expected_result() {
		driver.getPageSource().contains("TestNG - Welcome");
	}
}
