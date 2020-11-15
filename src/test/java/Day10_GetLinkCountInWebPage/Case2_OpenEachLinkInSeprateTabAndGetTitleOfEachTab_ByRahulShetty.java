package Day10_GetLinkCountInWebPage;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case2_OpenEachLinkInSeprateTabAndGetTitleOfEachTab_ByRahulShetty extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }

    @Test
    public  void openLinkInSepratePageTest() {
        /*
         * Note : WindowHandles or New Window Open or New Tab open is the same concept both can be handled by using Iterators.
         */
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        
        WebElement footerSection = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));  // I have taken footerSection webelement
        WebElement DiscountCouponSectionOnFooter = footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));  // this is webElement for only Discount Section
        int DiscountCouponWebElement = DiscountCouponSectionOnFooter.findElements(By.tagName("a")).size();  
     
        //1. For Loop is used to open the links in different tabs.
        for(int i=1; i<DiscountCouponWebElement;i++) {  // Here I have Initialized i=1 because 'Discount Couple' title is also a link but not clickable so no pint to initialize i=0;
            String LinkNames = DiscountCouponSectionOnFooter.findElements(By.tagName("a")).get(i).getText();
            System.out.println(LinkNames);
            DiscountCouponSectionOnFooter.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
        }
            
        //2. No getting titile of each tab, while loop is used to Iterate each tab and get title.
        
                        Set<String> windows = driver.getWindowHandles();
                         Iterator<String> tabs = windows.iterator();
                         while(tabs.hasNext()){
                             driver.switchTo().window(tabs.next());
                             System.out.println(driver.getTitle());
                         }
    }

}
