package mavenproject.test.steps;


import static org.junit.Assert.assertTrue;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	WebDriver driver;
	Duration d=Duration.ofSeconds(3, 1);
	
	@Given("user navigates to google page in browser")
	public void user_navigates_to_google_page_in_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new FirefoxDriver();
	    driver.get("https://www.google.co.in");
	}

	@When("user searches for {string} in searchbox")
	public void user_searches_for_in_searchbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(string+Keys.ENTER);
	   
	}

	@Then("related results for search term is displayed")
	public void related_results_for_search_term_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
           driver.manage().timeouts().implicitlyWait(d);
	       driver.findElement(By.partialLinkText("Cucumber")).click();
	       assertTrue(driver.getTitle().contains("BDD Testing"));
		   driver.quit();
	}


}
