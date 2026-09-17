// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;


class Main {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         System.out.println("enter a num:");
             int n = sc.nextInt();

           for(int i = 0 ; i< n ;i++)
               { 
                   for(int j=0; j<= n; j++)
                       {
                           System.out.print("*");
                       }
                   System.out.println(" ");
                   
               }
         
    } 
}