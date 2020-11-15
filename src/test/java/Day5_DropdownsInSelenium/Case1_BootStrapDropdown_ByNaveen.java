package Day5_DropdownsInSelenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_BootStrapDropdown_ByNaveen extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
	
    @Test
    public  void bootStrapDropdownTest() {
   
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
	List<WebElement> list =	driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));   //Always findElements will return list of webelements.
	System.out.println("List Of Dropdown Elements :"+ list.size());	
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());   //this will print dropdown list text line by line.
			list.get(i).click();         //this is for selecting all 14 subvalue in dropdown.
			/*if(list.get(i).getText().contains("jQuery")) {   
				list.get(i).click();                         // this code is for selecting specific value from 14 list
				break;
			}*/		
		}
		driver.close();
	}
}
