@SuppressWarnings("ALL")
public class Audi extends Car{
    // Audi pretend itself like car
    @Override
    public void run(){
        System.out.println("Audi is Woriking");
    }
//    @Override
    // a static method can not be override
    public static void stop(){
        System.out.println("Car is stopped");
    }
}
