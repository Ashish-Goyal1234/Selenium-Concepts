package Day8_FramesInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_Frame_Handling_ByNaveen extends BaseClass{
    WebDriver driver;
    /*
     We can Locate frame :
         driver.switchTo.frame("name or id");
         driver.switchTo().frame("index");
         driver.switchTo().frame("By web element");
     */
    @BeforeMethod
    public void inti() {
        driver = initialization();
    }
    
    @Test
	public  void frameHandlingTest() throws InterruptedException {
		driver.get("http://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a")).click();
	}
}
