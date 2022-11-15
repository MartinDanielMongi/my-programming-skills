import java.util.Scanner;
import static java.lang.Math.*;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        int myCard1= drawRandomCard();
        int myCard2= drawRandomCard();
        int handValue=myCard1+myCard2;
        String dibujo =drawing(myCard1);
        System.out.println("You get a:\n"+dibujo);
        dibujo= drawing(myCard2);
        System.out.println("\nand a :\n"+dibujo);
        System.out.println("Your total is: "+handValue);
        scan.nextLine();
        int dealerCard1=drawRandomCard();
        int dealerCard2=drawRandomCard();
        dibujo= drawing (dealerCard1);
        int dealerValue= dealerCard1 + dealerCard2;
        System.out.println("The dealer shows:\n"+ dibujo+"\n and a card facing down \n"+ faceDown());
        int o=1;
        while (o==1){
            System.out.println("\n You wanna hit or stay?:");
            String hitStay= scan.nextLine();
            if (hitStay.equals("hit")){
                int myCard3= drawRandomCard();
                handValue +=myCard3;
                dibujo=drawing(myCard3);
                System.out.println("You get a:\n"+ dibujo + "\n Your new total points is: " + handValue);
            } else if (hitStay.equals("stay")){
                o=2;
            } else {
                System.out.println("You must write 'hit' or 'stay'");
            }
            if (handValue>21){
                System.out.println(" You lost!!");
                System.exit(0);
            }
        }
        dibujo= drawing(dealerCard1);
        System.out.println("Dealers turn.\n The dealers cards are: \n" +dibujo);
        dibujo= drawing(dealerCard2);
        System.out.println("And a : \n"+ dibujo);
        scan.nextLine();
        if (dealerValue>21){
            System.out.println("You winn!!");
            System.exit(0);
        }
        while(dealerValue<17){
            int dealerCard3=drawRandomCard();
            dibujo = drawing(dealerCard3);
            System.out.println("The dealer get's a:\n" + dibujo);
            dealerValue += dealerCard3;
            if (dealerValue>21){
                System.out.println("You winn!!");
                System.exit(0);
            }
        }       
        if(handValue>dealerValue){
            System.out.println("You winn!!");
        }else {
            System.out.println("You lost!!");
        }
         scan.close();

    }
    public static int drawRandomCard(){
        int num= (int) (random()*13+1);
        return num;
    }
    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static String drawing(int card){
        String carta="";
        switch(card){
            case 1:carta="   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";break;
            case 2: carta="   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";break;
            case 3: carta="   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";break;
            case 4: carta="   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";break;
            case 5: carta= "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";break;
            case 6: carta="   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";break;
            case 7: carta="   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";break;
            case 8: carta="   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";break;
            case 9: carta="   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";break;
            case 10: carta="   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";break;
            case 11: carta="   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";break;
            case 12: carta="   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";break;
            case 13: carta="   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";break;
            default: break;
            
        }
        return carta;
    }
    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    }

