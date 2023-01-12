package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class LandingPageStepDefination {
    public WebDriver driver;
    String landingPageProductName;

    TestContextSetup testContextSetup;

    public LandingPageStepDefination(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;

    }

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        testContextSetup.driver = WebDriverManager.chromedriver().create();
        testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }

    @When("User search the vegetable with short name {string} and extracted actual name of product")
    public void user_search_the_vegetable_with_short_name_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
        Thread.sleep(2000);
        landingPageProductName = testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
        System.out.println("product name" + landingPageProductName);


    }




}
