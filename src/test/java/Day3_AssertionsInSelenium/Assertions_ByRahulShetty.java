package Day3_AssertionsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Assertions_ByRahulShetty extends BaseClass {
    WebDriver driver;
    
    @BeforeTest
    public void init(){
        driver  = initialization();
    }

    @Test
    public void assertionsTest() {
           
        /*Assertion is used to validate if result we are getting is expected or not.
           Assertions is brought by TestNg */
        driver.get("https://www.spicejet.com/");
        String title = driver.getTitle();
        Assert.assertEquals(title, "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
        
        WebElement familyAndFriendCheckbox = driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily"));
        System.out.println("Verify Checkbox is Selected :" + familyAndFriendCheckbox.isSelected());
        Assert.assertFalse(familyAndFriendCheckbox.isSelected()); // It means I am Expecting false value so My execution will not stop.
        
        familyAndFriendCheckbox.click();
        System.out.println("Verify Checkbox is Selected :" + familyAndFriendCheckbox.isSelected());
        Assert.assertTrue(familyAndFriendCheckbox.isSelected());  // It means That I am Expecting true value and my Execution will not stop   
    }
}
