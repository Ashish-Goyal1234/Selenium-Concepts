package Day6_ActionClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case4_AmazonWebSiteForActionClass_ByRahulShetty extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }

    @Test
    public  void actionClassTest() {
        driver.get("https://www.amazon.com");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
        
        a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile")
        .doubleClick().perform();
    }
}