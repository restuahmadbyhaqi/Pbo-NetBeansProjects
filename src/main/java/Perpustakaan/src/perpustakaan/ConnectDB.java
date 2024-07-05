package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/perpustakaan";
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; 

    public static Connection BukaKoneksi() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            if (connection != null) {
                System.out.println("Connected to the database!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return connection;
    }
}
