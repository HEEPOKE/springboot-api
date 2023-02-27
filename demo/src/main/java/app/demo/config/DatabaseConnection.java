import java.sql.*;
import java.util.*;

public class DatabaseConnection {
    
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = System.getenv("DB_URL");
    private static final String DB_USERNAME = System.getenv("DB_USERNAME");
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");

    public static void main(String[] args) {

        try {
            Class.forName(DRIVER_NAME);

            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Could not load database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Could not connect to the database: " + e.getMessage());
        } 											
    }                                               
}             
