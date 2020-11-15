package Day14_ScreenShotConcept;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class takingScreenshot extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    
        /*
         *  1. If we want to take screenshot then we have to convert driver object into Screenshot object.
         *  2. Cast driver with "TakeScreenshot" object.
         *  3. Get screenShot as FIle and SRC reference
         *  4. copy screenshot from src refernce to local computer by using "FileUtils,cpyFile"
         */
    @Test
    public  void takeScreenShotTest() throws IOException {
        driver.get("http://google.com");
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("D://Screenshot.png"));

    }
}
