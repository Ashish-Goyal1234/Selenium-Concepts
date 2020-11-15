package Day15_SeleniumGridConcept;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class SeleniumGridconcept extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    /*
    1. Descired capabilties : Sets properties on which browser test should be executed on which O.S test should be executed.
    2. When you want to run your test remotely yo have to tell your test on what browser you are going to run your test, on what OS you are going yo run your test,
        for that we create Desiredcapaibilities class.
    */

    @Test
    public  void seleniumGridTest() throws MalformedURLException {
        DesiredCapabilities dc =new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);
        //WebDriver driver = new ChromeDriver() ; // this is what we suppose to give in local machine
            WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.204:4444/wd/hub"), dc);
            
            driver.get("https//google.com");
    }
}
