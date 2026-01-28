package dev.hemanth.jfs.classes;

/**
 * Demonstrates classic traps:
 * - Shadowing bug without this
 * - Default constructor rule
 * - Static method hiding (not overriding)
 *
 * Refer:
 * docs/06-classes-and-objects/01-classes-objects-constructors-this.md
 * Section 10 – Interview traps
 * Section 9 – Static methods are hidden
 */
public class ClassInterviewTraps {

    static class ShadowingBug {
        String name;

        ShadowingBug(String name) {
            // BUG: assigns parameter to itself, field remains null
            // name = name;

            // FIX:
            this.name = name;
        }
    }

    static class Parent {
        static void greet() {
            System.out.println("Parent.greet()");
        }
    }

    static class Child extends Parent {
        // This is NOT overriding. It's hiding (static methods are chosen by reference type).
        static void greet() {
            System.out.println("Child.greet()");
        }
    }

    public static void main(String[] args) {
        ShadowingBug p = new ShadowingBug("Hemanth");
        System.out.println("ShadowingBug.name = " + p.name);

        Parent ref = new Child();

        // Static methods use compile-time binding:
        // The reference type is Parent, so Parent.greet() is called.
        ref.greet(); // Parent.greet()

        // But calling via class name makes it explicit:
        Child.greet();  // Child.greet()
    }
}