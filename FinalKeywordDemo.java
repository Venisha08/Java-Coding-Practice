// Online Java Compiler (Editor)
// Write and run Java online using this editor.
 final class Animal{
    
    void display()
    //Final void display() 
    {
        System.out.println("Animal ");
    }
 }

class Dog extends Animal
    {
     void display()
         {
         System.out.println("Dog");
         }
    }

class FinalKeywordDemo{
    public static void main(String[] args) {
     Dog a = new Dog();
       a.display();
    }
}

//op:display() in Dog cannot override display() in Animal
//cannot inherit from final Animal
//