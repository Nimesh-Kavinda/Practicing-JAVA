@SuppressWarnings("ALL")
public class Audi extends Car{
    // Audi pretend itself like car


    @Override
    public void run(){
        System.out.println("Audi is Woriking");
        // poly means "many" and morphism means "forms".
    }


    // a static method can not be override
    public static void stop(){
        System.out.println("Car is stopped");
    }


    public static void stop2(){
        System.out.println("Audi class Static method");
    }



    public void stop3(){
        System.out.println("Audi class Non Static method");
    }
}
