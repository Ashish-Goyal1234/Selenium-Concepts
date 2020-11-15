package Day13_HandlingSSLCertification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_SSLCertificationHandling_ByRahulShetty extends BaseClass{
WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    
    @Test
    public  void SSLCertificationTest() {
            DesiredCapabilities ch = DesiredCapabilities.chrome();
            ch.acceptInsecureCerts();
            
            // Below to your local browser
            ChromeOptions c = new ChromeOptions();
            c.merge(ch);
            System.setProperty("webdriver.chrome.driver", "");
            WebDriver driver = new ChromeDriver(c);
    }
}
