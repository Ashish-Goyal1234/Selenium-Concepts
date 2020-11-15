package Day19_HashMapConcept;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

/*
         *   Let say in Amamzon.com there are different people having different role and there login is also done according to their role.
         *   
         *   1.  Customer
         *   2. admin.
         *   3. Seller
         *   4. Distributor
         *   5. Cutomercare  
         */
public class Case1_HashMapConcept_ByNaveen extends BaseClass{
WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    
    @Test
    public  void hashMapConceptTest() {
        System.out.println(getcredentials());
        System.out.println(getcredentials().get("customer"));   // It will return my customer data
        
        
        String customerCredentials = getcredentials().get("cutomer");   // When Login as Customer use this credential.
        
       driver.get("https://www.facebook.com/l");
        driver.findElement(By.name("email")).sendKeys(customerCredentials.split(":")[0]);
        driver.findElement(By.name("pass")).sendKeys(customerCredentials.split(":")[1]);
        
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
}
