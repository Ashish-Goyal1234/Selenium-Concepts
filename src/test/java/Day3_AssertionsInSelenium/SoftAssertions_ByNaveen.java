package Day3_AssertionsInSelenium;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions_ByNaveen{
    SoftAssert softassert = new SoftAssert();
    /*
   1. Hard Assertion : hard validation: if a hard assertion is getting failed -> Immediately testcase will be marked as failed and testcases will be terminated.
   2. Soft Assertion : Soft Validation : if a soft assertion is getting failed -> Testcase will not be marked as passed as well as next lines will be executed.
   3. assertAll() : to mark the testcases as failed , if any soft assertion is getting failed.
   4. Assertion is Introduced by TestNg.
     */

    @Test(priority=1)
    public void SoftAssertmtd(){
        
        System.out.println("open browser");
        
        Assert.assertEquals(true, true);
        
        System.out.println("Enter Username");
        System.out.println("Enter Password");
        System.out.println("Click on Sign in Button");
        
        Assert.assertEquals(true, true);
    
        System.out.println("Validate HomePage");
         //Assert.assertEquals(false, true);   // HardAssertion  , programme terminates abnormally rest of code not executed and next textcase will start.
        softassert.assertEquals(false, true,"Not able to validate homepage"); // Soft Assertion , programme nit terminates abnormally, rest of the code executed.
      
        System.out.println("go to deals Page");
        System.out.println("Create a Deal Page");
        softassert.assertEquals(false, true,"Not able to create Deal Page");  // Fail 2
        
        
        System.out.println("go to contacts p    age");
        System.out.println("Create a Contact");
        softassert.assertEquals(false, true,"Not able to create contact"); // fail 3
        // assertAll() is important other wise our testcase is treated as passed.
        softassert.assertAll();  // This will fail and show all the failed testcases, if we dont write this line our testcases will never show the failed tetscaes.
    }
    
    @Test(priority=2)
    public void testCase2() {
       System.out.println("Test Case 2 Started");
       Assert.assertEquals(true, true);
    }
}
