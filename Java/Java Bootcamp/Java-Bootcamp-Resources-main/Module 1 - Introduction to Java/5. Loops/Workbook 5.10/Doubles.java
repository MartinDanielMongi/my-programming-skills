
import static java.lang.Math.*;


public class Doubles {
    public static void main(String[] args) {

        int dice1=98;
        int dice2=99;
        while (dice1!=dice2){
            dice1= rollDice();
            System.out.print("\n\nDice 1: "+dice1);
            dice2= rollDice();
            System.out.print("\nDice 2: "+dice2);
        }
        System.out.println("\nYou rolled Doubles!");
    }
    public static int rollDice(){
            int dice =(int)(random()*6+1); 
            return dice;
    }
}





