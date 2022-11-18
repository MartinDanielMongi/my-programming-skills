import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int figures= scan.nextInt();
        scan.nextLine();
        String[][] database= new String [figures][3];
        
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        for(int i=0; i<database.length;i++){
            System.out.println("Figure "+(i+1));
            for(int j=0; j<database[0].length;j++){
                if(j==0){
                    System.out.println("\n-Name: ");
                    database[i][j]=scan.nextLine();
                }else if (j==1){
                    System.out.println("\n-Date of Birth:");
                    database[i][j]=scan.nextLine();
                }else {
                    System.out.println("\n-Occupation:");
                    database[i][j]=scan.nextLine();
                }
            }
        }
        //Watch out for the nextLine() pitfall. 
        /* Task 3 
        for (____) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            pick up and store figure's name.   

            System.out.print("\t - Date of birth: ");
            pick up and store figure's birthday.

            System.out.print("\t - Occupation: ");
            pick up and store figure's occupation. 

            System.out.print("\n");

        }
        
        */
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 

        System.out.print("\nWho do you want information on? ");  
        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */

}
