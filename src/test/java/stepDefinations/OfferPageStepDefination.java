package stepDefinations;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefination {
    TestContextSetup testContextSetup;
    String offerPageProductName;

    public OfferPageStepDefination(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;

    }


    @Then("user search for same shortname {string} in offers page to check if product exist")
    public void user_search_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
        Set<String> windows = testContextSetup.driver.getWindowHandles();
        Iterator<String> i1 = windows.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        testContextSetup.driver.switchTo().window(childWindow);
        testContextSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);
        Thread.sleep(2000);
        String offerPageProductName = testContextSetup.driver.findElement(By.cssSelector("td:nth-of-type(1)")).getText();
    }

    @Then("verify product name in offers page matches with landing page")
    public void verify_product_name_in_offers_page_matches_with_landing_page() {
        if (testContextSetup.landingPageProductName == offerPageProductName) {
            Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductName);
        }
    }
}
