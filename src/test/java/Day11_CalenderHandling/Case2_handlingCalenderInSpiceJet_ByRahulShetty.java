package Day11_CalenderHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case2_handlingCalenderInSpiceJet_ByRahulShetty extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }

    @Test
    public  void spiceJetClaenderTest() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
        Thread.sleep(2000);
        WebElement calenderMainWindow = driver.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last"));
        List<WebElement> date = calenderMainWindow.findElements(By.cssSelector("[data-handler='selectDay']"));   // Written this because we need to find date in only calender window.
        int count = date.size();
        Thread.sleep(2000);
        if(!calenderMainWindow.findElement(By.cssSelector(".ui-datepicker-month")).getText().contains("October")){
            driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
        for(int i=0;i<count;i++){
            String ActualDateToSelect = date.get(i).getText();
            if(ActualDateToSelect.equals("12")){
                date.get(i).click();
                break;
            }
        }
        
    }
}
