// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Rectangle
    {
       int length;
       int breadth; 
        
        Rectangle (int length, int breadth)
        {
          this.length  =  length;
          this.breadth =  breadth;        
        }

        int area()
        {
            int result = length * breadth;
            return result;
        }

        
    }

class Main {
       public static void main(String[] args) {
       Rectangle rec = new Rectangle(10, 15);
         System.out.println("Area of Rectangle :" + rec.area());
        
    } 
}