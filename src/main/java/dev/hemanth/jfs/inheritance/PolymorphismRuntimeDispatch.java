package dev.hemanth.jfs.inheritance;

/**
 * Demonstrates that runtime type determines method execution.
 *
 * Refer:
 * docs/07-inheritance-and-polymorphism/01-inheritance-polymorphism-overriding.md
 * Section 2 – Reference vs Object type
 */
public class PolymorphismRuntimeDispatch {

    static class Parent {
        void show() {
            System.out.println("Parent show");
        }
    }

    static class Child extends Parent {
        @Override
        void show() {
            System.out.println("Child show");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show(); // Child show
    }
}