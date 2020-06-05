package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"StepDefinitions"},
        features = "src/test/java/resources/coalShastra/",
        plugin = {"json:target/cucumber-parallel/json/Cucumber.json",
                "html:target/cucumber-html-report"
        }
//        dryRun = false
//        tags = {""}
)

public class TestRunner {
}
