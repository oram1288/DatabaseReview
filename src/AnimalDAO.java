import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDAO {

    public void addAnimal(Animal animal) throws SQLException{
        String sql = "INSERT INTO animals2 (animalName, animalBreed, animalType) VALUES (?, ?, ?)";

        try (Connection conn = DatabseConnection.getConnection()){

            PreparedStatement pStatement = conn.prepareStatement(sql);

            pStatement.setString(1, animal.getAnimalName());
            pStatement.setString(2, animal.getAnimalBreed());
            pStatement.setString(3, animal.getAnimalType());

            pStatement.executeUpdate();
            
        }
    }


    
}
