@SuppressWarnings("ALL")
public class Person {

    // States or varibles

    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    // Behaviours or funvtions or methods

    public void walk(String name){
        System.out.println(name + " is walking");
    }

    public Person(){

    }
}
