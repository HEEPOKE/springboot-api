import java.sql.*;
import java.util.*;
import io.github.cdimascio.dotenv.Dotenv;

public class DatabaseConnection {
    Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(dotenv.get("DB_URL"), dotenv.get("DB_USERNAME"), dotenv.get("DB_PASSWORD"));

            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Could not load database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Could not connect to the database: " + e.getMessage());
        } 											
    }                                               
}             
             
