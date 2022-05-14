package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LogInTestProject {

	public WebDriver driver;
	@Given("user launch browser")
	public void user_launch_browser() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
	}
	@And("user is on log in page")
	public void user_is_on_log_in_page() {

		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		driver.findElement(By.id("name"))
		.sendKeys(username);
		driver.findElement(By.id("password"))
		.sendKeys(password);

	}

	@And("user navigate to home page")
	public void user_navigate_to_home_page() throws InterruptedException {

		
		Thread.sleep(2000);
		driver.findElement(By.id("login"))
		.click();
		String actualtitle = driver.getTitle();

		System.out.println("The title of page is  "+actualtitle);

	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() {
		WebElement logout = driver.findElement(By.id("logout"));
		boolean flag = logout.isDisplayed();
		if(flag == true) {

			Assert.assertTrue(true);
			System.out.println("Test is passed");
		}
		else {

			Assert.assertTrue(false);
			System.out.println("test is failed");
		}
		driver.quit();

	}




}
