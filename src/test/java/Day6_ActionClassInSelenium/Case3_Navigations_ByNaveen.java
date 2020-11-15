package Day6_ActionClassInSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case3_Navigations_ByNaveen extends BaseClass{
    WebDriver driver;    
    
        @BeforeMethod
        public void init() {
            driver = initialization();
        }
        
        @Test
	public  void navigationsTest() throws InterruptedException {
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("http://amazon.com");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();
	}
}
