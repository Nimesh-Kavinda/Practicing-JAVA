@SuppressWarnings("ALL")
public class Engine {
    private String name;
    private int power;
    private String model;

    public Engine(String name, int power, String model) {
        this.name = name;
        this.power = power;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
