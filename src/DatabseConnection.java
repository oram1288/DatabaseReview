import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabseConnection {

     private static final String URL = "jdbc:postgresql://localhost:5432/DBreview";
    private static final String USER = "postgres";
    private static final String PASSWORD = "leafsfan12";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    
}
