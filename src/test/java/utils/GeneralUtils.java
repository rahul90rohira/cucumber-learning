package utils;

import com.sun.xml.internal.ws.model.WrapperBeanGenerator;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GeneralUtils {

    WebDriver driver;

    public GeneralUtils(WebDriver driver)
    {
        this.driver=driver;
    }

    void switchToChildPage()
    {
        Set<String> windows = this.driver.getWindowHandles();
        Iterator<String> i1 = windows.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        this.driver.switchTo().window(childWindow);
    }
}
