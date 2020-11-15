package Day10_GetLinkCountInWebPage;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_FindCountOfLinkPresentOnlyInFooter_ByRahulShetty extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization() ;
    }

    @Test
    public  void getLinkCountTest() {
                // Here we are able to find count of link present only in footer. or find link present on particular section.
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement footerSection = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));  // I have taken footerSection webelement
      
        int footerSectionsLinksCount = footerSection.findElements(By.tagName("a")).size();
        System.out.println("Links present only in footer :" + footerSectionsLinksCount );
        
        
        // Finding link for a particular section of footer (In this Example Discount coupon section only)
        // As we already having footerSection locator then just extending that.
        WebElement DiscountCouponSectionOnFooter = footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));  // this is webElement for only Discount Section
        int DiscountCouponWebElement = DiscountCouponSectionOnFooter.findElements(By.tagName("a")).size();
        System.out.println("Number of Links Present only under Discount Coupon : " + DiscountCouponWebElement);
        
  System.out.println("**************Printing name By using Iterator*********************"); 
        // Pinting name of Each Link by using Iterator
        Iterator<WebElement> findLinkNames = DiscountCouponSectionOnFooter.findElements(By.tagName("a")).iterator();
        while(findLinkNames.hasNext()){
            WebElement names = findLinkNames.next();
            System.out.println("Name of Linkes by using Iterator :" + names.getText());
        }
 System.out.println("*******************Printing name by using for loop********************");       
        //Printing each name of Link by Using for Loop
        for(int i = 1;i<DiscountCouponWebElement;i++){
           String names =  DiscountCouponSectionOnFooter.findElements(By.tagName("a")).get(i).getText();
           System.out.println("Names of Link by using for loop :" + names);
        }
        
    System.out.println("******************Printing name by usinh for each loop**********************");    
        //printing name of links by using for EachLoop
        List<WebElement> test =  DiscountCouponSectionOnFooter.findElements(By.tagName("a"));
        for(WebElement e : test){
            String name = e.getText();
            System.out.println("printing names by using foreachloop : " + name);
        }   
    }
}
