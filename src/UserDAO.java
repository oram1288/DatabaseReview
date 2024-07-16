import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {


    public void addUser(User user) throws SQLException{
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";

        try(Connection conn = DatabseConnection.getConnection()){
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());

            preparedStatement.executeUpdate();

            

        }
    }


    
}
