package stepDefinations;



import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.sql.SQLOutput;

public class hooks {

    @Before("@SmokeTest")
    public void setup()
    {
        System.out.println("before hooks");
    }

    @After("@SmokeTest")
    public void cleanup()
    {
        System.out.println("After hooks");
    }
}
