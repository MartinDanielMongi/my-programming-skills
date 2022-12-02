package models;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {
  private String name;
  private String birth;
  private int age;
  private int phone;
  Date currentDate= new Date();
  
    public Contact(Contact source) {
        this.name = source.name;
        this.birth = source.birth;
        this.age = source.age;
        this.phone = source.phone;
    }

    public Contact(String name, String birth, int phone)throws ParseException {
        if(name.equals(null)|| name.isBlank()){
            throw new IllegalArgumentException("Name not valid");
        }
        if(phone<10000 ){
            throw new IllegalArgumentException("Phone not valid");
        }
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        calcAge(birth);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.equals(null)|| name.isBlank()){
            throw new IllegalArgumentException("Name not valid");
        }
        this.name = name;
    }

    public String getBirth() {
        return this.birth;
    }

    public void setBirth(String birth) throws ParseException {
        this.birth = birth;
        calcAge(birth);
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        if(phone<10000 ){
            throw new IllegalArgumentException("Phone not valid");
        }
        this.phone = phone;
    }

    public Contact name(String name) {
        setName(name);
        return this;
    }

    public Contact birth(String birth) throws ParseException {
        setBirth(birth);
        return this;
    }

    public Contact age(int age) {
        setAge(age);
        return this;
    }

    public Contact phone(int phone) {
        setPhone(phone);
        return this;
    }

   
    public String toString() {
        return
            "Name: " + getName() + "\n" +
            "Birth: " + getBirth() + "\n" +
            "Age: " + getAge() + "\n" +
            "Phone: " + getPhone() + "\n";
    }
    private void calcAge(String birth)throws ParseException{
        SimpleDateFormat sdfBirth= new SimpleDateFormat("MM/dd/yyyy");
        sdfBirth.setLenient(false);
        long difference= currentDate.getTime()-sdfBirth.parse(birth).getTime();
        this.age= (int)(((((difference/1000)/60)/60)/24)/365);
    }
    
}
