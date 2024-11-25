@SuppressWarnings("ALL")
public class Main {
    // Constructors in Java

    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Kavinda");
        st.setSurname("Karunasinge");
        st.getSurname();
        String name = st.getName(); // asingning get to varibel


        System.out.println(name);
        System.out.println(st.getSurname());

        System.out.println("My full name is " + (name + " " + st.getSurname()));
    }


}