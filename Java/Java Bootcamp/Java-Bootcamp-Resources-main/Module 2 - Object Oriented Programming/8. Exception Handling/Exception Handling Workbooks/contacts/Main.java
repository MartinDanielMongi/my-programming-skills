import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {
    public static void main(String[] args){

        /* EJERCICIO 1
        try{
        Contact contact= new Contact("Martin", "11/13/1995", 156862340);
        System.out.println(contact);
        }
        catch(ParseException e){
            System.out.println(e.getMessage());
        }
        */

        ContactManager contactManager= new ContactManager();
        try {
            loadContacts("contacts.txt", contactManager);
            System.out.println("\n****CONTACTS LOADED****\n");
            System.out.println(contactManager);
            manageContacts(contactManager);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            
        }
        
        /*  EJERCICIO 2
        try {
            contactManager.addContact(new Contact("Ryan", "11/11/1992", 613501242));
            contactManager.addContact(new Contact("Gio", "11/11/1993", 647709234));
            contactManager.addContact(new Contact("Thomas", "11/11/1994", 819225697));
        }catch(ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(contactManager);
        }
        */
    }
        public static void manageContacts(ContactManager contactManager){
            Scanner scan = new Scanner(System.in);
            String loop="a";
            String removeConta= "";
            while(!loop.equals("c")){
                System.out.print(" Press 'a' to add new, 'b' to remove contact, 'c' for exit.: ");
                loop= scan.nextLine();
                switch (loop) {
                    case "a":
                        System.out.print("\n Name:");
                        String name=scan.nextLine();
                        System.out.print("\n Phone:");
                        int phone= scan.nextInt();
                        scan.nextLine();
                        System.out.print("\nBirth:");
                        String birth= scan.nextLine();
                        try {
                            Contact contact= new Contact(name, birth, phone);
                            contactManager.addContact(contact);
                        } catch (ParseException e) {    
                            System.out.println(e.getMessage());
                            
                        }catch(IllegalArgumentException e){
                            System.out.println("\nInvalid input, try again\n");
                        }
                        finally {
                            System.out.println("\n****CONTACTS UPDATED****\n");
                            System.out.println(contactManager);

                        }
                        
                        break;

                    case "b":
                    try {
                        System.out.print("Who would you like to remove?: ");
                        removeConta=scan.nextLine();
                        contactManager.removeContact(removeConta);
                        System.out.println("\n****CONTACTS UPDATED****\n");
                        System.out.println(contactManager);
                        
                    } catch (IllegalStateException e) {
                        System.out.println("\nYou cant remove a contact from an empty list.\n");
                    }
                        
                        break;

                    case "c":
                        loop="c";

                        break;    
                
                    default:
                    System.out.println("\nThat's not an option, select another.");
                        break;
                }
            }
            scan.close();
        }
    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */
        
        
    
        public static void loadContacts(String fileName, ContactManager contactManager)throws FileNotFoundException{
            FileInputStream fis= new FileInputStream(fileName);
            Scanner scanFile = new Scanner(fis);
            while(scanFile.hasNextLine()){
                try{
                    String namee= scanFile.next();
                    int phonee= Integer.parseInt(scanFile.next());
                    String birthh=scanFile.next();
                    Contact contact= new Contact(namee, birthh , phonee);
                    
                    contactManager.addContact(contact);

                }catch(ParseException e){
                    System.out.println(e.getMessage());
                }

            }
            scanFile.close();
        }
    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
