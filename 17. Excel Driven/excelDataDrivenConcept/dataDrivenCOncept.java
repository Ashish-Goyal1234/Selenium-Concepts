package excelDataDrivenConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import com.google.common.collect.Table.Cell;
import BaseclassPackage.BaseClass;

public class dataDrivenCOncept extends BaseClass{
WebDriver driver;
    
    @BeforeMethod
    public void init() {
        driver = initialization();
    }
    public  void dataDrivenConceptTest() throws IOException {
        
            FileInputStream fis = new FileInputStream("E:\\Selenium\\SeleniumConcept\\17. Excel Driven\\testdata.xlsx");  // to get the file
            XSSFWorkbook wb = new XSSFWorkbook(fis);   // create object to access the excel excel file
        
               int sheetCount =  wb.getNumberOfSheets();     // It will give count number of sheets present in Excel.
               for(int i =0;i<sheetCount;i++){
                   if(wb.getSheetName(i).equalsIgnoreCase("one")){
                       XSSFSheet sheet = wb.getSheetAt(i);                       // it will move to sheet name as "one"
                       
                       //1. Need to Move to First Row in Excel sheet.
                           Iterator<Row> row = sheet.iterator();
                           Row firstrow = row.next();                                                          // moved to First Row in Excel sheet.
                           
                       //2. Need to Iterate each column to find the column named as "Testcases"    
                           Iterator<Cell> columns = firstrow.cellIterator();           
                           
                           int index = 0;
                           int columnNumber = 0;
                           while(columns.hasNext()){                                                            //  Traversing each column to find column name as "Testcase"
                               Cell columnName = columns.next();
                               if(columnName.getStringCellValue().equalsIgnoreCase("TestCases")){
                                   columnNumber = index;
                               }
                               index++;
                           }
                           System.out.println(columnNumber);
                           while(row.hasNext()){
                               Row r = row.next();
                               if(r.getCell(columnNumber).getStringCellValue().equalsIgnoreCase("purchase")){
                                   Iterator<Cell> columnValues = r.cellIterator();
                                  while(columnValues.hasNext()){
                                     String values =  columnValues.next().getStringCellValue();
                                     System.out.println(values);
                                  }
                               }
                           }
                   }
               }
        }
}
