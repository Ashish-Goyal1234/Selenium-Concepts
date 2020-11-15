package atmBanking;

import org.testng.annotations.Test;

public class debitAmountByATMTest {
        @Test
        public void debitAmountByATM_M1(){
            System.out.println("Debit Amount by ATM M1()");
        }
        
        @Test(groups={"smoke"})   // this group will execute when in TestNG.xml file willl call to execute the textcases having group name as "smoke".
        public void debitAmountByATM_M2(){
            System.out.println("Debit Amount by ATM M2()");
        }
        
        @Test
        public void debitAmountByATM_M3(){
            System.out.println("Debit Amount by ATM M3()");
        }
}
