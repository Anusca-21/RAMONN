package sample;

public class Main{
    public static void main(String[] args)
    {
          Person A=new Person(24,"Andrei");//instanta
          Person B=new Person();
          System.out.println(" This person "+ A.getFname()  + " has " +A.getAge() +" years old");

         // System.out.println(A);
         // System.out.println(B);
        A.setFname("Adi");
        A.setAge(30);
        A.setLname("Nastase");
        System.out.println(A);

        Student S=new Student();
        System.out.println(S);

        Student S1=new Student(24,"Ionut","Petrescu",8.45);
        System.out.println(S1);
        System.out.println(S1.getMedie());
    }
}