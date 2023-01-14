package stepDefinations;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.Test;
import utils.TestContextSetup;

import java.sql.SQLOutput;


public class hooks {

    TestContextSetup testContextSetup;
    public  hooks(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
    }

//    @Before
//    public void setup()
//    {
//        System.out.println("before hooks");
//    }

    @After
    public void cleanup()
    {
        this.testContextSetup.driverManager.getDriver().quit();

    }
}
