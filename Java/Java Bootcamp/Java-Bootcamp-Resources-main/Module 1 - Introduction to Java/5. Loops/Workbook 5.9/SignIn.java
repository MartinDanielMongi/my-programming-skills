import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        String userTest= "";
        String passTest="";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");

        while (!userTest.equals(username) || !passTest.equals(password)){
        System.out.print("- Username: ");
        userTest= scan.nextLine();
        System.out.print("- Password: ");
        passTest= scan.nextLine();
        if (!userTest.equals(username) || !passTest.equals(password)){
            System.out.println("\nIncorrect, please try again!\n");
        }
        }
        System.out.println("Sign in successful. Welcome!");
        //pick up password

        // see Learn the Part for the remaining instructions.
        
        
        /* will be useful for task 2
        
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("- Password: ");
            passwordEntry = scan.nextLine();

        
        */
        scan.close();
        
    }
}
