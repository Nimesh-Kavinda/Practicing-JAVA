@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Nimesh", "Kavinda",23,"java");
        programmer.showInfo();
        programmer.work();
        CEO ceo = new CEO("Dimuth", "Adithya",30,12);
        ceo.showInfo();
        Driver driver = new Driver("Dulanka", "Nimshara", 25,3);
        driver.showInfo();
    }


}