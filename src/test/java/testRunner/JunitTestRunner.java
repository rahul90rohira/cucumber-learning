package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 glue = "stepDefinations",stepNotifications = true,plugin = {"pretty","html:target/cucumber.html"},dryRun = true)
public class JunitTestRunner {


}
