import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static AnimalService animalService = new AnimalService();
    private static UserService userService = new UserService();
    public static void main(String[] args) throws SQLException {

        Animal animal = new Animal("Test", "Test", "Test");

        User user = new User("Cody", "Cody");

    
       animalService.addAnimal(animal);
       
       userService.registerUser(user);

       userService.authUser("Cody", "Cody");

       Scanner sc = new Scanner(System.in);

       int choice = 0;

       do {
            System.out.println("Welcome to our App!");
           System.out.println("1. Create A New User");
           System.out.println("2. Authenticate User");
           System.out.println("3. Add Animal");
           System.out.println("4. Exit");
           choice = sc.nextInt();
           sc.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Enter Username: ");
                   String username = sc.nextLine();
                   System.out.println("Enter Password: ");
                   String password = sc.nextLine();
                   User newUser = new User(username, password);
                   userService.registerUser(newUser);
                   break;
               case 2:
                   System.out.println("Enter Username: ");
                   String authUsername = sc.nextLine();
                   System.out.println("Enter Password: ");
                   String authPassword = sc.nextLine();
                   userService.authUser(authUsername, authPassword);
                   break;
               case 3:
                   System.out.println("Enter Animal Name: ");
                   String animalName = sc.nextLine();
                   System.out.println("Enter Animal Breed: ");
                   String animalBreed = sc.nextLine();
                   System.out.println("Enter Animal Type: ");
                   String animalType = sc.nextLine();
                   Animal newAnimal = new Animal(animalName, animalBreed, animalType);
                   animalService.addAnimal(newAnimal);
                   break;
               case 4:
                   System.out.println("Goodbye!");
                   break;
               default:
                   System.out.println("Invalid Choice");
                   break;
           }
       } while (choice != 4);
       sc.close();
    }
}

// Jordans Menu Code

// public class Main {
//     private static AnimalService animalService = new AnimalService();
//     private static UserService userService = new UserService();

//     public static void main(String[] args) throws SQLException {

//         Animal animal = new Animal("Test", "Test", "Test");

//         User jordan = new User("Jordan", "Jordan");

//         // animalService.addAnimal(animal);

//         // userService.registerUser(jordan);

//         // userService.authUser("Jordan", "Jordan");

//         Scanner sc = new Scanner(System.in);

//         int choice = 0;

//         do {
//             System.out.println("Welcome To Our Aplication!");
//             System.out.println("What Would You Like To Do?");
//             System.out.println("1: Create A New User");
//             System.out.println("2: Login The User");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     registerUser(sc);
//                     break;
//                 case 2:
//                     loginUser(sc);
//                     break;

//                 default:
//                     break;
//             }
//         } while (choice != 2);
//         {

//         }

//     }

//     private static void loginUser(Scanner sc) throws SQLException {

//         System.out.println("Logging In The The System......");
//         System.out.println("Enter Username");
//         String userName = sc.next();
//         System.out.println("Enter The Password: ");
//         String password = sc.next();

//         User user = userService.authUser(userName, password);

//         if(user != null){
//             System.out.println("Welcome: " + user.getUserName());

//             if(user.getUserName().equals("Jamie")){
//                 jamieDashboard(sc,user);
//             }
//         }
//     }

//   private static void jamieDashboard(Scanner sc, User user) throws SQLException {
//         System.out.println("Welcome To Jamie Dashboard!");

//         System.out.println("Press 1 To Delete Jordan");

//         int choice = sc.nextInt();

//         if(choice == 1){
//             userService.deleteUser("Jordan");
//         } else{
//             return;
//         }

//     }

//   private static void registerUser(Scanner sc) throws SQLException {

//         System.out.println("Adding A New User.... ");
//         System.out.println("Enter The Username");
//         String userName = sc.next();
//         System.out.println("Enter The Password: ");
//         String password = sc.next();

//         User user = new User(userName, password);
//         userService.registerUser(user);

//     }
// }