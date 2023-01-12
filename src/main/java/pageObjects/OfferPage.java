package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class OfferPage {

    By searchButton = By.xpath("//input[@id='search-field']");
By searchResult=By.cssSelector("td:nth-of-type(1)");
By topDealLink=By.linkText("Top Deals");
public WebDriver driver;

   public OfferPage(WebDriver driver)
   {
       this.driver=driver;

   }


      public void enterText(String shortName)
      {

          this.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);

      }

      public  String getSearchText()
      {
          return this.driver.findElement(By.cssSelector("td:nth-of-type(1)")).getText();
      }

    public void switchToDealPage()
    {
        this.driver.findElement(topDealLink).click();
        Set<String> windows = this.driver.getWindowHandles();
        Iterator<String> i1 = windows.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        this.driver.switchTo().window(childWindow);

    }
}
