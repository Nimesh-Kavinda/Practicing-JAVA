@SuppressWarnings("ALL")

// extends
// Super Class is the Base Class that we extends

public class Student extends Person {

    public Student(String name, String surname, int age){
        super(name , surname , age);
        // go and call constructor of super class
        super.getName();
        // go and catch the getName method in super class

        // inheritance means "IS a" connection

    }

    // Person is our parent class or supper class or our base class
    // Studens or Teacher is our child classes

    public static void run(){
        System.out.println("this student is running");
    }

    public String read(String bookname){
        return bookname;
    }

}
