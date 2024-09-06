package mavenproject.test.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/google.feature",glue="mavenproject.test.steps")

public class TestRunner {

}
