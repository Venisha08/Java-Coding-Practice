// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Student
    {
        String name;
        int mark1;
        int mark2;
        int mark3;
    
        Student(String name,int mark1,int mark2,int mark3)
        {
            this.name = name;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3; 
        }
        
        public void calculateTotal(int mark1,int mark2,int mark3)
        {
            int total = mark1+ mark2+mark3;
            System.out.println("Total Mark: "+total);

            
        }
          public void calculateAverage(int mark1,int mark2,int mark3)
        {
             int average = mark1+ mark2+mark3/3;
            System.out.println("Average: "+average);
            
        }
          public void displayResult()
        {
           System.out.println("Name:"+ name);
           
                
        }       
    }
class Main {
    public static void main(String[] args) {
       
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();

        System.out.println("Enter mark1:");
        int mark1 = sc.nextInt();

        System.out.println("Enter mark2:");
        int mark2 = sc.nextInt();

        System.out.println("Enter mark3:");
        int mark3 = sc.nextInt();
        Student s = new Student( name, mark1,mark2,mark3);
        s.calculateTotal( mark1,mark2,mark3);
        s.calculateAverage( mark1,mark2,mark3);
       s.displayResult();
        
        
    }
}