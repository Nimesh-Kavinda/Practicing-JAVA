@SuppressWarnings("ALL")
public class Student {

    public String name;
    public String surname;
    public String email;
    public int age;

    public static void create() {
        System.out.println("I am a Static Method. I belogns to calass");
    }

    public void put() {
        System.out.println("Student Object is Craated and You used this method");
    }
}

