@SuppressWarnings("ALL")

public class Driver extends Employee{

    private int cars;

    public Driver(String name, String surname, int age, int cars) {
        super(name, surname, age);
        this.cars = cars;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        System.out.println("Cars of Driver " + cars);
        super.showInfo();
    }
}
