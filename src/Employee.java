@SuppressWarnings("ALL")

public class Employee {
    private String name;
    private String surname;
    private int age;

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void work(){
        System.out.println(name +" is Working");
    }

    public void showInfo(){
        System.out.println("Name " + name );
        System.out.println("SurName " + surname );
        System.out.println("Age " + age );


    }
}
