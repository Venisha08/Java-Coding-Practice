// Online Java Compiler
// Use this editor to write, compile and run your Java code online



class Animal{

    void sound()
    {
        System.out.println("Animal sound");
    }
}
    class dog extends Animal {
        void sound()
        {        
            System.out.println("dog sound ");   
        }
    }
        class cat extends Animal{
            void sound()
            {
                System.out.println("meow");
            }
        }

class Main {
    public static void main(String[] args) {
     dog d = new dog();
       d.sound();
     cat a = new cat();
        a.sound();
        
        
    }
}