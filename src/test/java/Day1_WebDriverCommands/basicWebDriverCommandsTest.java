
package Day1_WebDriverCommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class basicWebDriverCommandsTest extends BaseClass {
    WebDriver driver;
    
    @BeforeTest
    public void init() {
        driver = initialization();
    }
    
    @Test
    public void basicCommandsTest(){
        driver.get("https://www.google.com/?gws_rd=ssl");       // 1. Returns the URL
        driver.getCurrentUrl();                                                    // 2. return the current URL and Return type isString.
        driver.getPageSource();                                                 // 3. Returns the page source and Return type is string Page Source Means HTML Code of WebPage.
        driver.getTitle();                                                           // 4. Return the title of the page.
        driver.getWindowHandle();                                          // 5. It gets the address of the active browser and it has a return type of String
        driver.getWindowHandles();                                      // 6. Returns the Set<String> of window ids used for traversing to multiple windows.
        driver.manage().deleteAllCookies();                         // 7. Delete all the coojies in the WebPage.
        driver.manage().getCookies();                                  // 8. Returns Set<Cookie> in the WebPage.
        driver.manage().window().maximize();
      
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.switchTo().alert();
        driver.switchTo().frame(1);

        driver.findElement(By.xpath(""));                       // 2. Used to find Particular  WebElemet on WebPage.
        driver.findElements(By.xpath(""));                    // 3. Used to find List of WebElements in WebPage and it Return type is List<WebElement>

        driver.quit();
        driver.close();
    }
}
