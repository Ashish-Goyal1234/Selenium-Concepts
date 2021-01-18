package Day1_WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class test extends BaseClass{
WebDriver driver;
    
    @BeforeTest
    public void init() {
        driver = initialization();
    }
    
    @Test
    public void basicCommandsTest(){
        driver.get("https://www.gmail.com");
       driver.navigate().to(driver.getCurrentUrl());
      
    }
}
