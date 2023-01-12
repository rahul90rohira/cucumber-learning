package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/searchProduct.feature",
                 glue = "stepDefinations",stepNotifications = true,plugin = {"pretty","html:target/cucumber.html"})
public class JunitTestRunner {


}
