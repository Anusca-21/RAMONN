package sample;

public class Student extends Person {
    private int age;
    private String fname;
    private String lname;
    private double medie;
    Student(){
        super();// functie ce reia din Person date
    }
    Student(int Age, String Fname, String Lname,double medie){
        super(Age,Fname,Lname);

        this.medie=medie;
    }
    public double getMedie(){
        return this.medie;
    }
}
