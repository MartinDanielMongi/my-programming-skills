package models;

import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts= new ArrayList<Contact>();
    }

    public Contact getContacts(int index) {

        return new Contact(contacts.get(index));
    }

    public void setContact(Contact contact, int index) {
        contacts.set(index, new Contact(contact));
    }
    
    public void addContact(Contact contact){
        contacts.add(new Contact (contact));
    }

    public String toString(){
        String temp = " ";
        for(int i=0; i < contacts.size(); i++){
            temp+=contacts.get(i).toString();
            temp+="\n";
        }
        return temp;
        
    }
    public void removeContact(String contactName){

        if(contacts.isEmpty()){
            throw new IllegalStateException("You cant remove a contact from an empty List");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if(contactName.equals(contacts.get(i).getName())){
                contacts.remove(i);
            }
            
        }
        
    }

}
