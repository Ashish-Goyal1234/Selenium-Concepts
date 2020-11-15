package Day11_CalenderHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_CalenderHandling_ByRahulShetty extends BaseClass{
    WebDriver driver;
    
    @BeforeTest
    public void init() {
        driver = initialization();
    }

    @Test
    public  void calenderHandlingTest() {
        driver.get("https://www.path2usa.com/travel-companions");
       /*
        *  1. Find Out the common method in HTML Tag to Select date.
        *  2. Iterate Each Date and Provide If condition it matches click on it.
        */
                // Code for Selecting month in calender
       
        driver.findElement(By.cssSelector("#travel_date")).click();  //Clicked on Date box and select date window will get open. 
        WebElement Month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
                
                while(!Month.getText().contains("January")){
                    driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();
                }
                // Code to select the Date in Calender
            List<WebElement> days = driver.findElements(By.cssSelector(".day"));  // 1. Taken list of webElements
            int count = days.size();                                                                        //  2. Take countuntil to  run the loop
              for(int i=0;i<count;i++){
                  String SelectDate = days.get(i).getText();                                    //   3. Get the text of the day.      
                  if(SelectDate.equals("12")){                                                        //    4. Apply the condition if expected date is found click the date and braek the loop.
                      days.get(i).click();
                      break;
                  }
              }
    }

}
