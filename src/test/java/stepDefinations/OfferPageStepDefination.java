package stepDefinations;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.OfferPage;
import utils.TestContextSetup;

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
        OfferPage offerPage=testContextSetup.pageObjectManager.getOfferPage();
//        OfferPage offerJava =new OfferPage(testContextSetup.driver);

        offerPage.switchToDealPage();
        offerPage.enterText(shortName);
        Thread.sleep(2000);
        String offerPageProductName= offerPage.getSearchText();
    }

    @Then("verify product name in offers page matches with landing page")
    public void verify_product_name_in_offers_page_matches_with_landing_page() {
        if (testContextSetup.landingPageProductName == offerPageProductName) {
            Assert.assertEquals(testContextSetup.landingPageProductName, offerPageProductName);
        }
    }


}
