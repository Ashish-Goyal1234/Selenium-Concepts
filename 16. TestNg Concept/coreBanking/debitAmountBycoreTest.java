package coreBanking;

import org.testng.annotations.Test;

public class debitAmountBycoreTest {
    
    @Test
    public void debitAmountbyCore_M1(){

        System.out.println("debit Amount by Core m1()");
    }
    @Test(groups={"smoke"})   // this group will execute when in TestNG.xml file willl call to execute the textcases having group name as "smoke".
    public void debitAmountbyCore_M2(){
        System.out.println("debit Amount by Core m2()");
    }
    @Test(enabled=false)
    public void debitAmountbyCore_M3(){
        System.out.println("debit Amount by Core m3()");
    }
}
