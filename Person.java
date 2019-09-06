package sample;

public class Person {
    int age;
    String fname;
    String lname;

    Person(){
        age=20;
        fname="Unknown";
        lname=null;
    }

    Person(int age, String fname){
        this.age=age;//this se refera la var din clasa ..gen pointer
        this.fname=fname;
    }
    Person(int age, String fname,String lname){
        this.age=age;//this se refera la var din clasa ..gen pointer
        this.fname=fname;
        this.lname=lname;
    }
    //creare getter
    public int getAge(){
        return  this.age;
    }
    public String getFname(){
        return this.fname;
    }
    public String getLname(){
        return this.lname;
    }
    //creare setter
    public void setAge(int age){
        this.age=age;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }



    public String toString(){//funtie pentru a printa datele altfel apare locatia
        return "This person name is: "+this.fname+ " "+ this.lname+"and he/she is "+
                this.age + " years old";
    }
}
