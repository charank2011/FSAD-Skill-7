public class Main {

    // Entry point of the application
    public static void main(String[] args) {
        // Combined Resolve: Feature Update version 1.1 + Bug Fix
        System.out.println("Hello, Git! This is version 1.1.1 (Feature + Bug Fix)");
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
