package hookStepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class HookSteps {

	public static WebDriver driver;
	@Before(order = 1)
	public void before() {
		
		System.out.println("before browser launch");
		
	}
	@BeforeStep
	public void beforeSteps() {
		
		System.out.println("Before steps launch");
	}
	
	@Before(order = 2)
	public void setUp() {
		System.out.println("webdriver is launch");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Given("user is on log in page")
	public void user_is_on_log_in_page() {
		System.out.println("navigate to home page");
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {

		System.out.println("enters username and password");
		driver.findElement(By.id("name"))
		.sendKeys("Raghav");
		driver.findElement(By.id("password"))
		.sendKeys("12345");
	}
	@And("user click on log in button")
	public void user_click_on_log_in_button() throws Exception {

		Thread.sleep(4000);
		System.out.println("click on log in button");
		driver.findElement(By.id("login"))
		.click();
	}
	@Then("user navigate to log in page")
	public void user_navigate_to_log_in_page() {

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


	}
	@After
	public void teardown() {
		
		System.out.println("driver is quit");
		driver.quit();
	}
	
	@AfterStep
	public static void takeScreenShot(Scenario scenario) {
		
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
		
	}


}
