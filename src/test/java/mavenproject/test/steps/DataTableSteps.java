package mavenproject.test.steps;

import static org.junit.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	WebDriver driver;
	Duration d=Duration.ofSeconds(3, 1);;
	@Given("user logged in using valid credentials")
	public void user_logged_in_using_valid_credentials(DataTable dataTable) {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	List<Map <String, String>> cred=dataTable.asMaps(String.class,String.class);
	System.out.println(cred);
	String username=cred.get(0).get("Username");
	String password=cred.get(0).get("password");
	driver.manage().timeouts().implicitlyWait(d);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	  
	@When("user clicks on punch button")
	public void user_clicks_on_punch_button() {
		driver.manage().timeouts().implicitlyWait(d);
	   driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/button")).click();
	}
	@Then("punch info page is displayed")
	public void punch_info_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.manage().timeouts().implicitlyWait(d);
	   String page=driver.findElement(By.tagName("h6")).getText();
	   System.out.println(page);
	   assertTrue(page.equalsIgnoreCase("attendance"));
	   driver.quit();
	}




}
