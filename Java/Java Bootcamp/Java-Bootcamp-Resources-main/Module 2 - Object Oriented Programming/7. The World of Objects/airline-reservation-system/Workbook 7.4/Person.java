public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seat;


    public Person(String name, String nationality, String dateOfBirth, int seat) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seat = seat;
    }
    public Person(Person source){
        this.name= source.name;
        this.nationality=source.nationality;
        this.dateOfBirth=source.dateOfBirth;
        this.seat=source.seat;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeat() {
        return this.seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}
