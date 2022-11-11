import static java.lang.Math.*;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String wantToPlay =scan.nextLine();
        if(wantToPlay.equals("no")){
            System.out.println("Darn some other time...!");
        }else {
        System.out.println("Great!\nrock-paper-scissors, shoot!");
        String choice = scan.nextLine();
        String computer = computerChoice();
        String resultado = resultGame(choice, computer);
        result (choice, computer, resultado);
        }
        scan.close();
    }

    public static String computerChoice(){
        int number = ((int)(random() * 2+1));
        if (number==0){
            String computersChoice = "rock";
            return computersChoice;
        }else if (number ==1){
            String computersChoice = "paper";
            return computersChoice;
        }else{
            String computersChoice = "scissors";
            return computersChoice;
        }
    }
    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */




    //Task 4  – Write a function that compares the choices and returns the result.
    public static String resultGame(String yourChoice, String computerChoice){
        if ((yourChoice.equals("rock") && computerChoice.equals("scissors"))||(yourChoice.equals("paper") && computerChoice.equals("rock")||(yourChoice.equals("scissors") && computerChoice.equals("paper")) )){
            String theResult= "You win!";
            return theResult;
        }else if (!yourChoice.equals("rock")&&!yourChoice.equals("paper")&&!yourChoice.equals("scissors")){
            String theResult= "INVALID CHOICE";
            return theResult;
        }else {
            String theResult= "You lose!";
            return theResult;
        }
    }
    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. Otherwise, the result is "You lose!":
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static void result(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose:"+yourChoice + "\nThe computer chose: "+computerChoice+"\nVeredict:" + result);
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

}
