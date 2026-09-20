// Online Java Compiler
// Use this editor to write, compile and run your Java code online



class Animal{
    
void eat()
    {
        System.out.println("Eat");
        
    }
    void sleep()
    {
        System.out.println("sleep");
    }
}

class Dog extends Animal{

    void bark()
    {
        System.out.println("Barking dog");
    }
}
class Animal_dog_Inheritance {
    public static void main(String[] args) {

     Dog d = new Dog();
       
        d.bark();
         d.eat();
        d.sleep();
        
    }
}