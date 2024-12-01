@SuppressWarnings("ALL")
public class Main {

    // a car has a engin
    // a car has wee
    // programmer is a Employee

    // Composition is "Has a Connetion"

    // Audi can have doors e, engin, wheel e.c

    // Is a Inheritance is "Is a Connection"
    // Has a Composition

    public static void main(String[] args) {

        Engine engine = new Engine("MMS", 450, "SSH");
        Wheel wheel = new Wheel("Michelin", "Black",20);



        Car car = new Car("Mercedes", wheel, engine, 4,2);
        System.out.println(car.getName());
        System.out.println(car.getSeats());
        System.out.println("Name of Engine: " +engine.getName());
        System.out.println("Model of Engine: " +engine.getModel());
        System.out.println("Power of Engine: " + engine.getPower());
        System.out.println("Wheel Name: " + wheel.getName());
        System.out.println("Wheel inch " + wheel.getInch());

    }


}