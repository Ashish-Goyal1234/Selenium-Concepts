package Day5_DropdownsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case4_handleAutoSuggestionDropdownMakeMyTrip_ByRahulShetty extends BaseClass{
WebDriver driver;
WebDriverWait waitForReload ;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
        waitForReload = new WebDriverWait(driver, 10);
    }
    
    @Test
    public  void autoSuggestiveDropDownTest() {
        driver.get("https://www.makemytrip.com/");
        waitForReload.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@class='fsw_inputField font30 lineHeight36 latoBlack']")))).click();
        //driver.findElement(By.xpath("//input[@class='fsw_inputField font30 lineHeight36 latoBlack']")).click();
        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("MUM", Keys.DOWN, Keys.ENTER);
        //driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
        driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Del", Keys.DOWN, Keys.ENTER);
    }
}
