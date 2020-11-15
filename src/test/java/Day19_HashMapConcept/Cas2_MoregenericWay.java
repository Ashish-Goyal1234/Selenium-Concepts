package Day19_HashMapConcept;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cas2_MoregenericWay {

    public static void main(String[] args) {
        ChromeDriver driver;
        System.setProperty("webdriver.chrome.driver", "E:\\Study\\2. Selenium\\Drivers\\chromedriver_win32_74.0\\chromedriver.exe"); 
        driver = new ChromeDriver();
       
        
        
       driver.get("https://www.facebook.com/l");
        driver.findElement(By.name("email")).sendKeys(getCustomerUserName("customer"));
        driver.findElement(By.name("pass")).sendKeys(getCustomerUserName("customer"));
        
    }
    
    public static HashMap<String, String> getcredentials(){   // I write here static because so that I can directly call in main method.
        // here I have seprated usernam and password with special character " : ".
        // Customer, admin, Seller this all are my differnt key which must be unique.
        HashMap<String, String> credentials = new HashMap<String, String>();
            credentials.put("customer", "Ashish : Test@123");
            credentials.put("admin", "admin : pass@123");
            credentials.put("Seller", "Seller : seller@123");
            credentials.put("cutomerCare", "amol : amol@123");   
            return credentials;
        }
    
        public static String getCustomerUserName(String loginAs){
            String roleName = getcredentials().get(loginAs);
            return roleName.split(":")[0];
        }
        
        public static String getCustomerPassword(String loginAs){
         String   rolePassword = getcredentials().get(loginAs);
         return rolePassword.split(":")[1];
        }
}
