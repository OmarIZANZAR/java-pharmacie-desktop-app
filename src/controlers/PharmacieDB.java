package controlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PharmacieDB {
    public static String DB_URL = "jdbc:mysql://localhost:3306/pharmacieDB";
    public static String DB_USER = "root";
    public static String DB_PASSWORD = "123456";
    
    public static Connection connectDB(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("CONNECTION TO DATABASE SUCCEEDED");
            
        }catch(SQLException ex){
            System.out.println("CONNECTION TO DATABASE FAILED");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return conn;
    }
    
    public static void closeConnection(Connection conn){
        try{
            conn.close();  
        }catch (SQLException ex) {
            // NEVER MIND
        }
        System.out.println("CONNECTION CLOSED");
    }
}
