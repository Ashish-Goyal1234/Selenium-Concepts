
package Day6_ActionClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_DragAndDrop_ByNaveen extends BaseClass {

    WebDriver driver;

    @BeforeTest
    public void init() {
        driver = initialization();
    }

    @Test
    public void dragAndDropTest() {
        driver.get("http://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        Actions action = new Actions(driver);
        action.clickAndHold(
                driver.findElement(By.xpath(".//*[@id='draggable']")))
                .moveToElement(
                        driver.findElement(By.xpath(".//*[@id='droppable']")))
                .release().build().perform();
    }
}
