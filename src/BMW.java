@SuppressWarnings("ALL")

public class BMW {
    private String name;
    private String model;
    private int doors;
    private int hoursepower;

    public BMW() {
    }

    public BMW(String name, String model, int doors, int hoursepower) {
        this.name = name;
        this.model = model;
        this.doors = doors;
        this.hoursepower = hoursepower;
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

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        // Encapsulate fields
            if(doors < 1){
                System.out.println("Invalid door Operation");
                return;
            }
        System.out.println("Meothd is not stooped");
        this.doors = doors;
    }

    public int getHoursepower() {
        return hoursepower;
    }

    public void setHoursepower(int hoursepower) {
        if(hoursepower < 10) {
            System.out.println("Invalid power operation");
            return;
        }

        this.hoursepower = hoursepower;
    }
}
