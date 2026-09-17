// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class calculator
    {
       
        public int add(int a ,int b)
        {
            int result = a + b;
            return result;
        }
         public int sub(int a,int b)
        {
            int result = a - b;
            return result;
        }

         public int multi(int a,int b)
        {
            int result = a * b;
            return result;
        }

         public int divide(int a,int b)
        {
            int result = a / b;
            return result;
        }
    }

class Calculator {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter a :");
            int a = sc.nextInt();
           System.out.println("Enter b :");
            int b = sc.nextInt();
           

           calculator cal = new calculator();
           
             System.out.println("Add:" + cal.add(a,b));
             System.out.println("sub:"+ cal.sub(a,b));
             System.out.println("multiply:" + cal.multi(a,b));
             System.out.println("Divide:" + cal.divide(a,b));
           
        
         
    } 
}