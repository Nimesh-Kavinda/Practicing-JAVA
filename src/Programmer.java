@SuppressWarnings("ALL")

public class Programmer extends Employee {

    private String language;

    // constructor
    public Programmer(String name, String surname, int age, String language) {

        super(name, surname, age);
        this.language = language;


       // super() // go and call constructoe of Super Class
       // super. // go and call method or variable of Super class

    }

    @Override  // annotation , if you want you can remove it,nothing chnage
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Language "+ language);
    }

    // overwrite
    //it means , go and call a method from superclass and write somthing over it


}
