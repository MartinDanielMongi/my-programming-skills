import java.util.Scanner;
import static java.lang.Math.*;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        int diceRoll;
        int score = 0;
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println("-If you roll a 6, the game stops.");
        System.out.println("-If you roll a 4, nothing happens.");
        System.out.println("-Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

        while(true){
        scan.nextLine();
        diceRoll=diceRolll();
        System.out.print("You rolled a:" + diceRoll);
            if(diceRoll==6){
                System.out.println(" End of Game");
                if(score>3){
                    System.out.println("\nYou made:"+ score + " Wow, that's lucky. You win!");
                }else{
                    System.out.println("\n You made:"+score+" Tough luck, you lose :(");
                }
                break;
            }else if (diceRoll==4){
                System.out.println(" Zero points, nothing happens");
                continue;
            }else{
                score ++;
                System.out.println(" One point. Keep rolling.");
            }
        }
        

        
    }  
    public static int diceRolll (){
        int dice = (int)(random()*6+1);
        return dice;
    }
}
