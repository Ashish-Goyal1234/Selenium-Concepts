
package Day9_AlertsAndPopupInSelenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

/*
         We can switch from one browser window to another browser window by using window ID.
         To get Window ID we have window handler API in selenium.
 */
public class Case1_BrowserWindowPopup_ByNaveen extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }

    @Test
    public  void browserWindowPopupTest() {
        try {
            driver.get("http://popuptest.com/goodpopups.html");
            driver.findElement(By.xpath("//a[@class='black']")).click();
            /*
             * getWindowHandles() will give set object with string type, now 2 window Id's available in Set object (parent as well as Child)
             */
            
            Set<String> handler = driver.getWindowHandles();  
            // Set never stores values in basis of indexes, so how to get values from set object? by using Iterator.
            
            Iterator<String> it = handler.iterator(); // to get particular value from set object use Iterartor.
        
            //it.next();   // will shift from 1 window  to next Window  and it will store id also.
            
            String parentWindowID = it.next() ;
            System.out.println("Print 1st value (Parent window id ) : " + parentWindowID );
           
            
            String childWindowId = it.next();  // now it moved to next window.
            System.out.println("Print 2nd value (child window id) : " + childWindowId);
            
            driver.switchTo().window(childWindowId);
            Thread.sleep(2000);
            System.out.println("Child window popup title :" + driver.getTitle());
            driver.close();
            
            driver.switchTo().window(parentWindowID);
            Thread.sleep(2000);
            System.out.println("Parent window popup title : " + driver.getTitle());
            
            driver.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
