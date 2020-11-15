package Day5_DropdownsInSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleStaticDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "E:\\Study\\2. Selenium\\Drivers\\chromedriver_win32_74.0\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        /*
         * Whenever we see a Select tag on hover of dropdown then we can say that it is a Static dropdown.
         */
        driver.findElement(By.cssSelector(".paxinfo")).click();
        WebElement Adult = driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Adult"));
        Select adult = new Select(Adult);
        
       //1. getOptions()
        List<WebElement> options = adult.getOptions();
        for(WebElement e :options){
            System.out.println("Options : " + e.getText());
        }
          int count = options.size();
           System.out.println("Number of Elemnts present :" + count);
      
          for(int i = 0;i<count;i++){
               String value = options.get(i).getText();
               System.out.println("Another way by using for loop :" + value);
           }
           int i = 0;
           while(i<count){
               String value = options.get(i).getText();
               System.out.println("Another way by using while loop :" + value );
               i++;
           }
           
        //2. SelectByIndex()
        adult.selectByIndex(2);  // Output will be 3 as index starts from zero.
        //3. SelectByValue()
        adult.selectByValue("2"); // output will be 2.
        //4. SelectByVisibleText()
        adult.selectByVisibleText("7");  // output will be 7
        //5. iSMultiple() : tells wheather select dropdown support multiple select webelements or not. Return boolean value.
        System.out.println("Adult type of Dropdown support  Multiple select webelemnts ? : " + adult.isMultiple());
        driver.close();

    }

}
