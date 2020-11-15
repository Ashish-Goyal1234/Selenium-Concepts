package atmBanking;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class creditAmountByATMTest {
    
    /*
     * To check the difference run testNG.xml file, Please do nt run this class only you will not get the difference
     */
   @BeforeSuite
   public void beforeSuit(){
       System.out.println("\t 1. Before Suit : testNG.xml level annotation, it will execute before <suit> </suit>");
   }
   
   @AfterSuite
   public void AfterSuit(){
       System.out.println("\t 8. After Suit : testNG.xml level annotation, it will execute After <suit> </suit>");
   }
    
   @BeforeTest
   public void beforetest() {
       System.out.println("\t 2. Before Test : testNG.xml level annotation, it will execute before <test> </test>");
   }
   
   @AfterTest
   public void Aftertest() {
       System.out.println("\t 7. After Test : testNG.xml level annotation, it will execute After <test> </test>");
   }
    
    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\t 3. Before class : Class level annotation and execute before each testcase in this class only.");
 
    }
    
    @AfterClass
    public void AfterClass(){
        System.out.println(" \t\t 6. After Method : Class level annotation and execute before each testcase in this class only.");
 
    }
    
    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" \t\t\t 4. Before Method : Class level annotation and execute before each testcase in this class only.");
    }
    
    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\t 5. After Test : Class level annotation and execute after each test case is executed in this class only.");
    }
    @Test
        public void creditAmountbyATM_M1(){
            System.out.println("\t\t\t\t 1.1 Credit Amount by ATM m1()");
        }
    
        @Test(groups={"smoke"})  //  this group will execute when in TestNG.xml file willl call to execute the textcases having group name as "smoke".
        public void creditAmountbyATM_M2(){
            System.out.println("\t\t\t\t 1.2. Credit Amount by ATM m2()");
        }
        @Test
        public void creditAmountbyATM_M3(){
            System.out.println("\t\t\t\t 1.3. Credit Amount by ATM m3()");
        }
}
