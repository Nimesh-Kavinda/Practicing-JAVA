@SuppressWarnings("ALL")
public class Car {

    public void run(){
        System.out.println("Car is Woriking");
    }
    public static void stop(){
        System.out.println("Car is stopped");
    }

    private static void stop2(){
        System.out.println("Car class Private method");
    }

    private void stop3(){
        System.out.println("Car class Private method non Static");
    }
}
