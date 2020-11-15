package Day6_ActionClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case2_MouseMovementConcept_ByNaveen extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init(){
        driver = initialization();
    }

    @Test
    public  void mouseMovementTest() throws InterruptedException {
		driver.get("http://spicejet.com/");
		Actions action=new Actions(driver);
		Thread.sleep(8000);
			action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.linkText("SpiceFlex")).click();
			driver.navigate().back();
	}
}
