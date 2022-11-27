import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
        //Item pepsi= new Item ("Pepsi", 3, 5);
        //System.out.println(pepsi.toString());

         Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };

         Machine maquina= new Machine(items);
         System.out.println(maquina.toString());
         int run=1;
         while(run==1){
         System.out.print("Pick a row: "); 
         int newRow= scan.nextInt();
         System.out.print("Pick a spot in the row: "); 
         int newSpot=scan.nextInt();
         if (maquina.dispense(newRow, newSpot)){
            System.out.println("Enjoy your drink! Press 1 to purchase another: ");
            run=scan.nextInt();
         }else{
            System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
            run=scan.nextInt();
         }
         System.out.println(maquina.toString());
        }
         
        //task 3
        //items[2][1].setPrice(2.99);
        // System.out.println(maquina.getMachine(2, 1));

         //task 4

        //Item variable= new Item (items[2][1]);
        // variable.setPrice(2.99);
        // items[2][1].setPrice(variable.getPrice());
        // System.out.println(items[2][1]);

        //task 5
        //maquina.dispense(0,0);
        //maquina.dispense(0,0);
        //System.out.println(maquina.getMachine(0, 0));


    }
}
