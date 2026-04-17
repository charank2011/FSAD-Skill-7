public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Git! This is version 1.1.1 (Feature + Bug Fix)");
        greet("Student");
        showFeature();
    }

    public static void greet(String name) {
        System.out.println("Welcome, " + name + "! Learning Git is fun.");
    }

    public static void showFeature() {
        System.out.println("New Feature: Branching logic implemented.");
    }
}
