package utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    WebDriver driver;
    ConfigFileReader configFileReader=new ConfigFileReader();

    public WebDriver getDriver() {

        if (driver == null)
        {

            if (configFileReader.getBrowser().equalsIgnoreCase("chrome"))
                driver = io.github.bonigarcia.wdm.WebDriverManager.chromedriver().create();
            else if (configFileReader.getBrowser().equalsIgnoreCase("safari"))
                driver = io.github.bonigarcia.wdm.WebDriverManager.safaridriver().create();
            else
                System.out.println("please enter valid browser");

//            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        }
        return driver;


    }

}

