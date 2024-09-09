package mavenproject.test.steps;

import static org.junit.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTableExampleTestSteps {
	WebDriver driver;
	Duration d=Duration.ofSeconds(3, 1);;
	@Given("user in login page")
	public void user_in_login_page() {
		driver= new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("user enters correct {string} and {string}")
	public void user_enters_correct_and(String username, String password) {
		driver.manage().timeouts().implicitlyWait(d);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("user clicks submit button")
	public void user_clicks_submit_button() {
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	}
	@Then("user navigated to dashboard of the application")
	public void user_navigated_to_dashboard_of_the_application() {
		driver.manage().timeouts().implicitlyWait(d);
		String user=driver.findElement(By.className("oxd-userdropdown-name")).getText();
		boolean status=user.contentEquals("manda user");
		driver.quit();
		System.out.println(user);
		assertTrue(status);
		
	}



}
