package dev.hemanth.jfs.inheritance;

/**
 * Demonstrates usage of super keyword.
 *
 * Refer:
 * docs/07-inheritance-and-polymorphism/01-inheritance-polymorphism-overriding.md
 * Section 7 – super keyword
 */
public class SuperKeyword {

    static class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            // Call parent behavior first
            super.sound();
            System.out.println("Dog bark");
        }
    }

    public static void main(String[] args) {
        new Dog().sound();
    }
}