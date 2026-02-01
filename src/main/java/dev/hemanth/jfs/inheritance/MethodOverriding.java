package dev.hemanth.jfs.inheritance;

/**
 * Demonstrates method overriding and runtime dispatch.
 *
 * Refer:
 * docs/07-inheritance-and-polymorphism/01-inheritance-polymorphism-overriding.md
 * Section 4 – Method overriding
 */
public class MethodOverriding {

    static class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();

        // Runtime polymorphism:
        // Reference type = Animal
        // Object type = Dog
        a.sound(); // Bark
    }
}