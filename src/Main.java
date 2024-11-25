@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("Nimesh", "Kavinda", "nimesh@gmail.com", 10000 , 20012150, "0778525115");

        System.out.println(account1.getName());

        account1.putMoney(2000);
        account1.takeMoney(5000);
    }


}