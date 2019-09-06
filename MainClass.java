
 package  sample;
 public class MainClass{
     public static void main(String args[]){
         int[] A=new int[20] ;// creare sir
         A[0]=1;
         A[1]=5;
         A[2]=-3;

         System.out.println(A[0]+ " " +A[1]+ " " +A[2]);

         for(int i=0;i<5;i++){
            A[i]=i;
            System.out.println(A[i]);
         }
         System.out.println("Suma este:" +suma(A));
     }
     public static int suma(int[] vector){
         int sum=0;
         for(int i=0;i<vector.length;i++){
             sum+=vector[i];
         }
         return sum;
     }
 }


