package mavenproject.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/google.feature",
glue="mavenproject.test.steps",monochrome=true,plugin={"html:target/htmlreports.html","json:target/report.json"})

public class TestRunner {

}
