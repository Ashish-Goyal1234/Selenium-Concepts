package Day9_AlertsAndPopupInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case3_WindowsPopup_MacPopup_ChooseFileButton_ByNaveen extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    
    @Test
    public  void  windowsPopupTest() {
        try{
        driver.get("https://html.com/input-type-file/");
        /*
         Dont use .click() method for browse button then it will not do anything instead use dirctly use "Sendkeys" and it will work.
         */
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("F:\\Wallpaper\\dark-full-hd-1080p-wallpapers.jpg");
        driver.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
