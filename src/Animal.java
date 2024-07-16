public class Animal {
    private int id;

    private String animalName;

    private String animalBreed;

    private String animalType;

    public Animal(int id, String animalName, String animalBreed, String animalType) {
        this.id = id;
        this.animalName = animalName;
        this.animalBreed = animalBreed;
        this.animalType = animalType;
    }

    public Animal(String animalName, String animalBreed, String animalType) {
        this.animalName = animalName;
        this.animalBreed = animalBreed;
        this.animalType = animalType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    } 

    

    




    
}
