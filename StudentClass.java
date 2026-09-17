// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Student{

    String name ;
    int age;
    int mark;

    Student(String name,int age,int mark)
    {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    
    
   void display_details()
    {
        System.out.println("Name:"+ name+" "+"Age:"+" "+ age+" " + "Mark:"+mark);
    }
}
class StudentClass {
    public static void main(String[] args) {

        Student sdt = new Student("venisha",23,85);
        
        sdt.display_details();
    }
}