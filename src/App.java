public class App {
    public static void main(String[] args) throws Exception {
        

        // Create Student objects
        // toString demonstration
        // equals and hashCode demonstration
        Student angie = new Student("Angie", 1, 4.0);
        Student angi = new Student("Angie", 1, 4.0);
        System.out.println(angie.toString());
        Student mike = new Student("Mike", 2, 4.0);
        System.out.println(String.format("Is Mike equal to Angie? %s", angie.equals(mike)));
        System.out.println(String.format("Is Angi equal to Angie? %s", angie.equals(angi)));
        System.out.println(String.format("What's Angi's unique ID? %s", angi.hashCode()));
    }
}
