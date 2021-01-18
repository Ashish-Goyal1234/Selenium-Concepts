
package database_Testing_Using_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class ConnectMySQL {

    @Test
    public void testDb() throws ClassNotFoundException, SQLException {
        // for MySQL database you need to pass the Driver as
        // "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        /*
         * Syntax for Connection String :
         * jdbc:mysql://hostname:port/dbname", "username" ,"password"
         */
        System.out.println("******************** Connecting to MYSQL DB ***********************");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/naveenautomationlabs", "root", "pass@123");
        
        System.out.println("********** Creating a new Record in database************************");
        String createRecord = "insert into customer values (1023,'Selenium', '9852526454', 'selenium@123.com', 'Male', 'USA')";
        Statement createSmtForNewRecordCreation = con.createStatement();
        createSmtForNewRecordCreation.execute(createRecord);
  
        System.out.println("********** Showing all Record in database************************");
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("Select * from customer");
        while (rs.next()) {
                String customerID = rs.getString("CustomerID");
                String customerName = rs.getString("CustomerName");
                System.out.println("Database record is : " +  customerID + " " + customerName);
        }
        
        
        System.out.println("********* Closing the Connection ***************");
        createSmtForNewRecordCreation.close();
        smt.close();
        rs.close();
        con.close();
        System.out.println("Programme is executed Successfully");
    }
}
