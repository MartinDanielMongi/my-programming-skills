import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    
        Person object =new Person();
        object.name="Martin";
        object.nacionality= "Argentina";
        object.dateOfBirth="13/11/1995";
        object.passport=new String[] {object.name,object.nacionality,object.dateOfBirth};
        object.seatNumber= 50;

        System.out.println("Name: "+ object.name);
        System.out.println("\nNacionality: "+ object.nacionality);
        System.out.println("\nDate of birth: "+ object.dateOfBirth);
        System.out.println("\nPassport: "+ Arrays.toString(object.passport ));
        System.out.println("\nSeat number: "+ object.seatNumber);
    }

}
