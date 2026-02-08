package dev.hemanth.jfs.abstraction;

/**
 * Demonstrates conceptual difference between abstract class and interface.
 *
 * Refer:
 * docs/08-abstraction/01-abstraction-abstract-classes-interfaces.md
 * Section 6 – Abstract class vs interface
 */
public class InterfaceVsAbstractClass {

    interface Flyable {
        void fly();
    }

    static abstract class Bird {
        void layEggs() {
            System.out.println("Lays eggs");
        }
    }

    static class Sparrow extends Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("Sparrow flies");
        }
    }

    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.layEggs();
        s.fly();
    }
}