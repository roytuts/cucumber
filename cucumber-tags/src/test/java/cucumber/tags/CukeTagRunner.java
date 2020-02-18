package cucumber.tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = "classpath:cuke/features/cucumberTag.feature", glue = "cucumber.tags.steps", monochrome = true, plugin = {
		"pretty", "html:target/cucumber", "json:target/Cucumber.json",
		"junit:target/Cucumber.xml" }, tags = { "@SIT and not @Smoke" })
public class CukeTagRunner {

}
