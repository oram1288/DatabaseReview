import java.sql.SQLException;

public class Main {
    private static AnimalService animalService = new AnimalService();
    private static UserService userService = new UserService();
    public static void main(String[] args) throws SQLException {

        Animal animal = new Animal("Test", "Test", "Test");

        User user = new User("TestUserName", "TestPassword");

    
       animalService.addAnimal(animal);
       
       userService.registerUser(user);
    }
}