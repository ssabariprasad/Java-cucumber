package mavenproject.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/OrangeHRM.feature",glue="mavenproject.test.steps")

public class TestRunner {

}
