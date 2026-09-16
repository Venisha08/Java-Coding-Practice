// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];
        System.out.println("Enter 5 number:");

        for(int i =0 ; i< array.length; i++)
            {
                array[i] = sc.nextInt();                
            }
        System.out.println("Array elements:");
           for(int i =0 ; i< array.length; i++)
            {
                System.out.println(array[i]);
            }
        
    }
}