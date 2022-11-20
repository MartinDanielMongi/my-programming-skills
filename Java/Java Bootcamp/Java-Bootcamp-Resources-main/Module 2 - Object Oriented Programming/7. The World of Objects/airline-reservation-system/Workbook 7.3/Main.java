import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        Person martin= new Person("Martin", "Argentina", "13/11/1995",new String[3] ,20);
        System.out.println("Name: " + martin.getName() + "\n" + "Nationality: " + martin.getNationality() + "\n" + "Date of Birth: " + martin.getDateOfBirth() + "\n" + "Seat Number: " + martin.getSeatNumber() + "\n");
        System.out.println("\nThe seat number "+martin.getSeatNumber()+ " its taken, select another one");
        int seat= scan.nextInt();
        martin.setSeatNumber(seat);
        System.out.println("\nName: " + martin.getName() + "\n" + "Nationality: " + martin.getNationality() + "\n" + "Date of Birth: " + martin.getDateOfBirth() + "\n" + "Seat Number: " + martin.getSeatNumber() + "\n");
    }
    
}
