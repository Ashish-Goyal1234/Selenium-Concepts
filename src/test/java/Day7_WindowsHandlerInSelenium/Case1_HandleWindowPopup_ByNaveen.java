package Day7_WindowsHandlerInSelenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseclassPackage.BaseClass;

public class Case1_HandleWindowPopup_ByNaveen extends BaseClass{
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }

    @Test
    public  void handleWindowsPopup() throws InterruptedException {	
		//1.alerts--- javasript popup  we use Api Alet(driver.switchTo().alert()) we have again two method accept() and dismiss()
		//2. FileUpload Popup--->browse button use if(type="file" use sendKeys,desired path)
		//3. browser window popup---->Advertisement popup use (windowHandler Api---getwindowHandles())
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Thread.sleep(3000);
		/*
		 We have Two Windoe Parent and child Window.
		 If we want to perform from parent window to child window we need toswith and to switch we have method
		 driver.switchto().window(); but we need window id, so for window id we have method driver.getwindowsHandles();
		 */
		
		
		Set<String> handler=driver.getWindowHandles();   //it store the value in case of indexes so use iteratot to get 0,1,2.
		
		Iterator<String> it = handler.iterator(); //we are using strring becuase windowid is available in form of string only.
		
		//Iterator will point just above the set object.
		String Parentwindow=it.next();  //shift the it object to next location i.e parent location.Pointing to 1st location
		System.out.println("Parent Window id :"+Parentwindow);
		
		String childwindow=it.next();  //It will shif from 1st location to 2nd location.
		System.out.println("Parent Window id :"+childwindow);
		
		driver.switchTo().window(childwindow);
		Thread.sleep(2000);
		System.out.println("Title of ChildWindowPopup :"+driver.getTitle());
		
		driver.close();   //specific window close
		//driver.quit();    //all browsers.
		
		driver.switchTo().window(Parentwindow);
		Thread.sleep(2000);
		System.out.println("Title of parentWindowPopup :"+driver.getTitle());
		driver.close();	
	}
}
 	