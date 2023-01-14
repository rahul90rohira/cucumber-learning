package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {
    public WebDriver driver;
    public String landingPageProductName;
public PageObjectManager pageObjectManager;
//public BaseTest baseTest;
public GeneralUtils generalUtils;
public  ConfigFileReader configFileReader;
public DriverManager driverManager;


    public TestContextSetup() throws IOException {
        driverManager=new DriverManager();
//        driver=driverManager.getDriver("chrome");
        driver=driverManager.getDriver();
        generalUtils=new GeneralUtils(driver);
        pageObjectManager=new PageObjectManager(driver);
//        baseTest=new BaseTest();
//        baseTest.readFile();
        configFileReader=new ConfigFileReader();




     }





}
