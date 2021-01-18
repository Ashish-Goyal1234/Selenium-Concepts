package Day5_DropdownsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case6_SelectMultipleValuesInDropDown extends BaseClass{
    
    /*
     1. Normally we are able to select drop down values by 
         SelectByIndex
         SelectByVisbleText
         SelectByValue
     */
            
WebDriver driver;
    @BeforeMethod
    public void init() {
        driver= initialization();
    }
    
    @Test
    public void slectMultipleDropDownValueTest() {
        
        driver.get("https://demoqa.com/select-menu");
       WebElement carsDrpDown =  driver.findElement(By.id("cars"));
       Select select = new Select(carsDrpDown);
      System.out.println("Verifying that is Select class allows multiple :" +  select.isMultiple());
      if(select.isMultiple()){
          select.selectByIndex(1);
          select.selectByVisibleText("Audi");
      }
    }
}