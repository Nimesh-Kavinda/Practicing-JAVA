@SuppressWarnings("ALL")
public class Car {
    private String name;
    private int doors;
    private int seats;
        // Varaibel  name
    private Engine engine;
    private Wheel wheel;

    public Car(String name, Wheel wheel, Engine engine, int seats, int doors) {
        this.name = name;
        this.seats = seats;
        this.doors = doors;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
