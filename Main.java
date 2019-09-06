package sample;

public class Main{
    public static void main(String[] args)
    {
          Person A=new Person(24,"Andrei");//instanta
          Person B=new Person();
          System.out.println(" This person "+ A.fname + " has " +A.age +" years old");

          System.out.println(A);
          System.out.println(B);
    }
}