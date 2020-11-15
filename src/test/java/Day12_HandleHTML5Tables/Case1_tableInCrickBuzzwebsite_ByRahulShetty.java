package Day12_HandleHTML5Tables;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_tableInCrickBuzzwebsite_ByRahulShetty extends BaseClass{
WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    
    @Test
    public  void HandleHTMLTest(String[] args) throws InterruptedException {
        driver.get("https://www.cricbuzz.com/live-cricket-scores/30369/rr-vs-kxip-9th-match-indian-premier-league-2020");  // This might change need to update.
        driver.findElement(By.xpath("//a[@class='cb-nav-tab ' and text()='Scorecard']")).click();
        int Totalruns = 0; 
        Thread.sleep(2000);
        WebElement scoreTable = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
        List<WebElement> runColumn= scoreTable.findElements(By.cssSelector(".cb-col.cb-col-8.text-right.text-bold"));
        System.out.println(runColumn.size());
        for(int i=2;i<runColumn.size()-2;i++){
           String runs =  runColumn.get(i).getText();
           int convertedRuns = Integer.parseInt(runs);
           Totalruns = Totalruns + convertedRuns;
        }
        System.out.println(Totalruns);
    }
}
