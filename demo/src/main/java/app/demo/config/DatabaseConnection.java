import java.sql.*;

public class DatabaseConnection {
    
    public static void main(String[] args) {
        
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/spring";
            String username = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, username, password);
            
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Could not load database driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Could not connect to the database: " + e.getMessage());
        }
    }
}
