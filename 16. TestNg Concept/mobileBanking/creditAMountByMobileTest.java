package mobileBanking;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class creditAMountByMobileTest {
    
    @Parameters({"URL","BankName"})
    @Test(groups={"smoke"})    // this group will execute when in TestNG.xml file willl call to execute the textcases having group name as "smoke".
    public void creditAmountbyMobile_M1(String urlname, String bname){
        System.out.println("Credit Amount by Mobile m1()");
        System.out.println(urlname);
        System.out.println(bname);
    }
    @Test
    public void creditAmountbyMobile_M2(){
        System.out.println("Credit Amount by Mobile m2()");
    }
    @Test(dataProvider = "getdata")
    public void creditAmountbyMobile_M3(String username, String password){
        System.out.println("Credit Amount by Mobile m3()");
        System.out.println(username);
        System.out.println(password);
    }
    
    @DataProvider
    public Object[] [] getdata(){   // We use Multi dimentional Array
        Object[][] data = new Object[3][2];   // Declared as 3 rows 2 columns
        data[0][0] = "ratan";
        data[0][1] = "ratanPassword";
        
        data[1][0] = "anu";
        data[1][1] = "anuPassword";
        
        data[2][0] = "durga";
        data[2][1] = "durgaPassword";
        
        return data;
    }
}
