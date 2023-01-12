package pageObjects;

import org.openqa.selenium.WebDriver;

import java.time.OffsetDateTime;

public class PageObjectManager {

    public LandingPage landingPage;
    public OfferPage offerPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver)
    {
        this.driver=driver;
    }

    public LandingPage getLandingPage()
    {
       landingPage= new LandingPage(this.driver);
       return landingPage;
    }

    public OfferPage getOfferPage()
    {
        offerPage= new OfferPage(this.driver);
        return offerPage;
    }
}
