package Day5_DropdownsInSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case3_HandleAutoSugesstiveDropdown_ByRahulShetty extends BaseClass{

    WebDriver driver;
    @BeforeTest
    public void init() {
        driver = initialization();
    }
    
    @Test
    public  void autoSuggestiveDropdownTest() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));  // It will return list of all webelements with 'li' tag having class name as 'ui-menu-item' and child as //a
        for(WebElement list :options) {
            if(list.getText().equalsIgnoreCase("India")){
                list.click();
                System.out.println("Testcase passed");
                break;
            }
        }
        driver.close();
    }
}
