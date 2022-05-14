package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSteps {

	public WebDriver driver;
	@Given("user launch the chrome")
	public void user_launch_the_chrome() {
	   
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}

	@And("user is on google search")
	public void user_is_on_google_search() {
	    
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@When("user enters text in searchbox")
	public void user_enters_text_in_searchbox() {
	   
		driver.findElement(By.xpath("//input[@name='q']"))
		.sendKeys("latest braine greeen book");
		
	}

	@And("user click on log in button")
	public void user_click_on_log_in_button() {
	   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[1]"))
	   .click();
	}

	@Then("user navigate to serchpage")
	public void user_navigate_to_serchpage() throws Exception {
		Thread.sleep(2000);
	   boolean flag =  driver.getPageSource().contains("List of book by author");
	   System.out.println(flag);
	   driver.quit();
	}

	
}
