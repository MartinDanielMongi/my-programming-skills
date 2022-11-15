import java.util.Scanner;
import static java.lang.Math.*;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int secretNumber= (int)(random() *5 +1);
       int election= scan. nextInt();
       while (election!=secretNumber){
            System.out.print("\nGuess again: ");
            election= scan.nextInt();
       }
       System.out.println("Yey! you got it, the number was " + secretNumber);
        
        scan.close();
    }

}
