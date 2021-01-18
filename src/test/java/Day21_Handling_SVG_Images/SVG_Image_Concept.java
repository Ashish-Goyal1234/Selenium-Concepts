package Day21_Handling_SVG_Images;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class SVG_Image_Concept  extends BaseClass{
    WebDriver driver;
    
    @BeforeTest
    public void init() {
        driver = initialization();
    }

    @Test
    public  void verifySVGImagesTest() throws InterruptedException {
       // driver.get("https://developers.google.com/chart/interactive/docs/gallery/piechart");
       // driver.get("https://demos.telerik.com/kendo-ui/pie-charts/index");
        driver.get("https://www.w3schools.com/graphics/svg_circle.asp");
        Thread.sleep(6000);
        WebElement circleLocator = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='circle']")).get(0);
        Thread.sleep(6000);
        String colour = circleLocator.getAttribute("fill");
        System.out.println("Colour of the svg image is :" + colour);
        System.out.println("Text of the circle Locator :" + circleLocator.getText());
        
        
        System.out.println("************* Handling SVG images where id is changing constantly ***************");
        Thread.sleep(5000);
        driver.navigate().to("http://debeissat.nicolas.free.fr/svg3d.php");
        Thread.sleep(5000);
        driver.switchTo().frame("svg_result");
        List<WebElement> eleList = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']//*[local-name()='path' and contains(@id,'face')]"));
        
        while(true) {
        for(WebElement ee:eleList){
            String text = null;
            text = ee.getAttribute("d");
            System.out.println(text);
        }
     }
    }
}
