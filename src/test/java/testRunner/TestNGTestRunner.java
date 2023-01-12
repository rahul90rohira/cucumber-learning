package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/searchProduct.feature",
                 glue = "stepDefinations",monochrome = true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {


}
