package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    By searchButton=By.xpath("//input[@type='search']");
    By productName= By.cssSelector("h4.product-name");
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterSearchItems(String shortname)
    {
        this.driver.findElement(searchButton).sendKeys(shortname);

    }

    public String getSearchText()
    {
       return this.driver.findElement(productName).getText().split("-")[0].trim();
    }
}
