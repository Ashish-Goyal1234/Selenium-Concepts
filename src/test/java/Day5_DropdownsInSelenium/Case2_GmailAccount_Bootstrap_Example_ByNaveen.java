package Day5_DropdownsInSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case2_GmailAccount_Bootstrap_Example_ByNaveen extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod()
    public void init() {
        driver  = initialization();
    }

        @Test
	public  void gmailBootStrapTest()
	{
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.findElement(By.id("CountryCode")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='CountryCode']//div[@class='goog-menuitem-content']"));
		System.out.println("Total Number of country is :" + list.size());
		for(int i=0;i<list.size();i++) 
		{
		System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Algeria")) 
			{
				list.get(i).click();
			}
		}	
	}
}
