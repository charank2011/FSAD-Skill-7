public class Main {

    // Entry point of the application
    public static void main(String[] args) {
        // BUG FIX: Corrected the version signaling
        System.out.println("Hello, Git! This is version 1.0.1 (Bug Fixed)");
        greet("Student");
    }

    // Greet method
    public static void greet(String name) {
        System.out.println("Welcome, " + name + "! Learning Git is fun.");
    }
}
