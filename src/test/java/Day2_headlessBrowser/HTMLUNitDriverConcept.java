package Day2_headlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTMLUNitDriverConcept {
    WebDriver driver;
    @BeforeTest
    public void init() {
       // driver = new HtmlUnitDriver();
    }
    
    @Test
    public void htmlUnitConceptTest() throws InterruptedException{
        
        //htmlUnitDriver is not a part of delenium from version 3.x onwards.
        //htmlunitdriver---to use this concept we have to download htmlunitdriver jar file.
        //This will not open any browser instead it will print output without opening browser
        
        /*
         Advantages Of HtmlUnitDriver
         1. Testing is Happening behind the scene--no browser is launched.
         2. very fast--execution of testcases is very fast.---improve performance of the script.
         3. Not work or suitable for user action class--mouse movement, double click ,drag and drop.
         4. Also called as Ghost Driver or headless browser.
                 Different Headless Avialble in market
                 1. HtmlUnitDriver--java
                 2. phantomJS--JavaScript
         */
     
        driver.get("https://www.freecrm.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       
        System.out.println("Before login   :" + driver.getTitle());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
        
        Thread.sleep(3000);
        System.out.println("After login  :" + driver.getTitle());

    }
    
}