public class Main {

    // Entry point of the application
    public static void main(String[] args) {
        System.out.println("Hello, Git! This is version 1.1");
        greet("Student");
        showFeature();
    }

    // Greet method
    public static void greet(String name) {
        System.out.println("Welcome, " + name + "! Learning Git is fun.");
    }

    // Method added in feature-update branch
    public static void showFeature() {
        System.out.println("New Feature: Branching logic implemented.");
    }
}
