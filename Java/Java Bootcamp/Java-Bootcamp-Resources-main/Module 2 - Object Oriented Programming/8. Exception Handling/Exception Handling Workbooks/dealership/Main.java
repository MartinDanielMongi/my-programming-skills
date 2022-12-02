import java.util.InputMismatchException;
import java.util.Scanner;

import models.Car;
import models.Dealership;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String loop="yes";
        Car[] cars = new Car[] {
            new Car("Nissan", 5000),
            new Car(".", 12000),
        };
        cars[1].setMake("Honda");
        cars[1].setPrice(8500);

        Dealership dealership = new Dealership(cars);

        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (loop.equals("yes")) {

            System.out.println(dealership);
            System.out.print("Enter the spot number of the car you want to buy: "); 
            try{
                int spot = scan.nextInt();
                dealership.sell(spot);   
            }catch(InputMismatchException e){
                System.out.println("INVALID INPUT");
                scan.nextLine();
            }   
            if(dealership.isEmpty()){
                loop="no";
                System.out.println("We're all sold out!");
            }else{
            System.out.println("Type yes to continue shopping: ");
            scan.nextLine();
            loop=scan.nextLine();
            }
        }

       scan.close();

    }
}
