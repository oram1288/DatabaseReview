import java.sql.SQLException;

public class AnimalService {

    AnimalDAO animalDAO = new AnimalDAO();

    public AnimalService(){
        animalDAO = new AnimalDAO();
    }

    public boolean addAnimal(Animal animal) throws SQLException{
        if(animal.equals(null)){
            System.out.println("Animal Not Created");
            return false;
        }

        Animal newAnimmal = new Animal(0, animal.getAnimalName(), animal.getAnimalBreed(), animal.getAnimalType());

        animalDAO.addAnimal(newAnimmal);
        System.out.println("Animal Created! ");
        return true;
    }
    
}
