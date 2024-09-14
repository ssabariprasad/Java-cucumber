package mavenproject.test.steps;

import static org.junit.Assert.assertTrue;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeHRMSteps {
	WebDriver driver;
	Duration d=Duration.ofSeconds(3, 1);;
	@Given("user is in login page")
	public void user_is_in_login_page() {
	    driver= new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters correct username {string} and password {string}")
	public void user_enters_correct_username_and_password(String username, String password) {
		driver.manage().timeouts().implicitlyWait(d);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("user navigated to home page of the application")
	public void user_navigated_to_home_page_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(d);
		String user=driver.findElement(By.className("oxd-userdropdown-name")).getText();
		/*
		 * boolean status=user.contentEquals("manda user"); assertTrue(status);
		 */
		System.out.println(user);
		driver.quit();
	}


@Given("you are in login page")
public void you_are_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
	driver= new FirefoxDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@When("you enters correct credentials")
public void you_enters_correct_credentials(DataTable dataTable) {
	List<List<String>> signUpForm = dataTable.asLists(String.class);
    String username = signUpForm.get(0).get(0);
    String password = signUpForm.get(0).get(1);
	driver.manage().timeouts().implicitlyWait(d);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);;
	
   
}
@When("you clicks on submit button")
public void you_clicks_on_submit_button() {
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
}
@Then("you navigated to home page of the application")
public void you_navigated_to_home_page_of_the_application() {
	driver.manage().timeouts().implicitlyWait(d);
	String user=driver.findElement(By.className("oxd-userdropdown-name")).getText();
	boolean status=user.contentEquals("Jos Butler");
	assertTrue(status);
	driver.quit();
}





}
