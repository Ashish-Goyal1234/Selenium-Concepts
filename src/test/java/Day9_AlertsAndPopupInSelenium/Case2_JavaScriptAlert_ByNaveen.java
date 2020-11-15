package Day9_AlertsAndPopupInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;
public class Case2_JavaScriptAlert_ByNaveen extends BaseClass{
    WebDriver driver;
    WebDriverWait wait;
    
    @BeforeMethod
    public void init() {
        driver  = initialization();
        wait = new WebDriverWait(driver,30);
    }
    
    @Test
    public  void alertsAndPopupTest() {
    try{
            driver.manage().window().maximize();
            driver.get("https://www.rediff.com/");
            WebElement signin = driver.findElement(By.xpath("//a[@class='signin']"));
            wait.until(ExpectedConditions.elementToBeClickable(signin));
            signin.click();
            
            WebElement login = driver.findElement(By.xpath("//input[@name='proceed']"));
            wait.until(ExpectedConditions.elementToBeClickable(login));
            login.click();
            Alert alert = driver.switchTo().alert();
            String textOFAlert = alert.getText();
            System.out.println(textOFAlert);
            
            alert.accept();
            //alert.dismiss(); // if cancel button is present.
            
            Thread.sleep(5000);
            driver.close();
    }catch(Exception e){
        e.printStackTrace();
    }
    
    }
}
