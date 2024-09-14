package mavenproject.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/",
glue="mavenproject.test.steps",tags="@one",plugin={"html:target/htmlreports.html","json:target/report.json"})

public class TestRunner {

}
