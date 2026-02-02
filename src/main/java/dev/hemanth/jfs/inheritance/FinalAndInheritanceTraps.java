package dev.hemanth.jfs.inheritance;

/**
 * Demonstrates inheritance traps:
 * - Field hiding
 * - Static method hiding
 *
 * Refer:
 * docs/07-inheritance-and-polymorphism/01-inheritance-polymorphism-overriding.md
 * Sections 6 and 9
 */
public class FinalAndInheritanceTraps {

    static class Parent {
        int x = 10;

        static void greet() {
            System.out.println("Parent greet");
        }
    }

    static class Child extends Parent {
        int x = 20;

        static void greet() {
            System.out.println("Child greet");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();

        // Fields use reference type
        System.out.println(p.x); // 10

        // Static methods use reference type
        p.greet(); // Parent greet
    }
}