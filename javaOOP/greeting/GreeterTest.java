public class GreeterTest {
    public static void main(String[] args) {
        Greeter.testGreeting("Sal");
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("Sal");
        String greetingWithFullName = g.greet("Sal", "Nunez");
        System.out.println(greetingWithFullName);
    }
}