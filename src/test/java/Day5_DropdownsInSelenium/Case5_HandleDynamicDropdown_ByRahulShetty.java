package Day5_DropdownsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case5_HandleDynamicDropdown_ByRahulShetty extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    
    @Test
    public  void dynamicDropDownTest() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT[name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Mumbai (BOM)")).click();
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT[name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[2]")).click();
        driver.close();
    }
}