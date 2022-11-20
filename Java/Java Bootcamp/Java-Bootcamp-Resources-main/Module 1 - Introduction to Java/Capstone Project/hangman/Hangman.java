
import java.util.Arrays;
import java.util.*;

public class Hangman {
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("You about to play Hangman. Press enter to get a random word.");
        scan.nextLine();
        int mistakes=0;
        int youGotIt=0;
        int winnerCount=0;
        //-------- Choose random word
        int random= (int)(Math.random()*64);
        char[] secretWord= new char [words[random].length()];
        for (int i = 0; i < words[random].length(); i++) {
            secretWord[i] = words[random].charAt(i);
    }       
        System.out.println(words[random]);
        //----------Make a random word a char array
        char[] superSecretWord= new char[secretWord.length];
        for (int i = 0; i < superSecretWord.length; i++) {
            superSecretWord[i]='_';
        } 
        char[] misses= new char[6];
        for (int i = 0; i < misses.length; i++) {
            misses[i]='*';
        }

        //----------- Start the game loop!
        while(mistakes!=6){
            printHangman(mistakes);

            //---------Print hidden Word
            System.out.print("Word: ");
            for (int i = 0; i < superSecretWord.length; i++) {
                System.out.print(superSecretWord[i]);
            }

            //------- Misses----------
            System.out.print("\n Misses: ");
            for (int i = 0; i < misses.length; i++) {
                System.out.print(misses[i]);
            }

            //------ guessing letters
            System.out.print("\n Guess: ");
            char guess= scan.next().charAt(0);
            for (int i = 0; i < superSecretWord.length; i++) {
                if (secretWord[i]==guess){
                    superSecretWord[i]=guess;
                    youGotIt++;
                }
            }
            if(youGotIt==0){
                mistakes ++;
                for (int i = 0; i < misses.length; i++) {
                    if(misses[i]=='*'){
                        misses[i]=guess;
                        i=misses.length;
                    }
                }

            }
            youGotIt=0;

            //--------- Winning check
            for (int i = 0; i < superSecretWord.length; i++) {
                if(superSecretWord[i]!='_'){
                    winnerCount++;
                    if(winnerCount==superSecretWord.length){
                        System.out.println("YOU WINN!!!!");
                        System.exit(0);
                    }
                }
            }
            winnerCount=0;
        }
        printHangman(mistakes);
        System.out.println("GAME OVER!!");
}


    //................................Printing.....................................
    public static void printHangman(int mistakes){
        switch (mistakes) {
            case 0:
                System.out.println("+---+\n" +
                "|   |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n");
                break;
            case 1:
                System.out.println("+---+\n" +
                "|   |\n" +
                "O   |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========\n");
                break;
            case 2:
            System.out.println("+---+\n" +
            "|   |\n" +
            "O   |\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n");
                break;
            case 3:
            System.out.println(" +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|   |\n" +
            "     |\n" +
            "     |\n" +
            " =========\n");
                break;
            case 4:
            System.out.println(" +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" + 
            "     |\n" +
            "     |\n" +
            " =========\n");
                break;
            case 5:
            System.out.println(" +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" +
            "/    |\n" +
            "     |\n" +
            " =========\n");
                break;
            case 6:
            System.out.println(" +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" + 
            "/ \\  |\n" +
            "     |\n" +
            " =========\n");
                break;
            default:
                break;
        }

    }
    /* Function printHangman
     * @param int mistakes
     * 
     * task
     * Print the hangman, depending on the amount of mistakes.
     * 
     */

}




